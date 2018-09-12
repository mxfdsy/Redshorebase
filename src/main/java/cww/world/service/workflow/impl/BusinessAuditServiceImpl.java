package cww.world.service.workflow.impl;

import cww.world.common.Enum.workflow.AuditOperationEnum;
import cww.world.common.Enum.workflow.AuditStatusEnum;
import cww.world.common.constant.BaseCode;
import cww.world.common.constant.Constants;
import cww.world.common.exception.BaseException;
import cww.world.mapper.workflow.BusinessAuditMapper;
import cww.world.mapper.workflow.BusinessAuditProgressMapper;
import cww.world.mapper.workflow.BusinessAuditResultHandle;
import cww.world.mapper.workflow.BusinessAuditTodoListMapper;
import cww.world.pojo.dto.workflow.BusinessAuditApplyDTO;
import cww.world.pojo.dto.workflow.ProgressAuditDTO;
import cww.world.pojo.po.workflow.*;
import cww.world.service.workflow.BusinessAuditService;
import cww.world.service.workflow.WorkflowService;
import cww.world.service.workflow.strategy.BusinessAuditWorkflowStrategy;
import cww.world.service.workflow.strategy.BusinessAuditWorkflowStrategyHolder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xujun
 */
@Service
public class BusinessAuditServiceImpl implements BusinessAuditService {
    private static final Logger logger = LoggerFactory.getLogger(BusinessAuditServiceImpl.class);

    @Autowired
    private BusinessAuditMapper businessAuditMapper;


    @Autowired
    private WorkflowService workflowService;

    @Autowired
    private BusinessAuditProgressMapper businessAuditProgressMapper;

    @Autowired
    private BusinessAuditWorkflowStrategyHolder businessAuditWorkflowStrategyHolder;

    @Autowired
    private BusinessAuditTodoListMapper businessAuditTodoListMapper;
    @Autowired
    private List<BusinessAuditResultHandle> businessAuditResultHandleList;



    @Override
    @Transactional
    public String userApplyBusinessAudit(BusinessAuditApplyDTO auditApplyDTO) {
        BusinessAuditPO businessAuditPo = buildBusinessAuditPO(auditApplyDTO);
        int rows = businessAuditMapper.insert(businessAuditPo);
        if (rows < 1) {
            throw new BaseException(BaseCode.DB_INSERT_ERROR, "业务审核流程提交失败");
        }
        progressApprovedHandle(businessAuditPo.getAuditUid(), auditApplyDTO.getApplyUserUid(), auditApplyDTO.getNextAuditorList());
        return businessAuditPo.getAuditUid();
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void userAuditProgressHandle(ProgressAuditDTO progressAuditDTO) {
        BusinessAuditProgressPO progress = businessAuditProgressMapper.getAuditProgressByProgressUid(progressAuditDTO.getAuditProgressUid());
        if (Objects.isNull(progress)) {
            throw new BaseException(BaseCode.WORKFLOW_PROGRESS_NOT_EXISTS, "审核流程不存在");
        }
        if (!Objects.equals(progress.getAuditStatus(), AuditStatusEnum.TYP_PENDING)) {
            logger.error("审核流程状态错误，正确状态为：TYP_PENDING，实际状态为：{}", progress.getAuditStatus());
            throw new BaseException(BaseCode.WORKFLOW_AUDIT_STATUS_ERROR, "审核流程状态错误");
        }
        BusinessAuditTodoListPO todoRecord = businessAuditTodoListMapper.getTodoRecordByProgressUidAndUserUid(progressAuditDTO.getAuditProgressUid(), progressAuditDTO.getAuditUserUid());
        if (Objects.isNull(todoRecord)) {
            throw new BaseException(BaseCode.WORKFLOW_AUDITOR_ERROR);
        }

        businessAuditPreVerify(progress.getAuditUid(), progressAuditDTO.getAuditStatus());

        int rows = businessAuditProgressMapper.userAuditUpdate(progressAuditDTO);
        if (rows < 1) {
            throw new BaseException(BaseCode.DB_UPDATE_ERROR, "更新审核信息出错");
        }
        businessAuditTodoListMapper.progressAuditDone(progressAuditDTO.getAuditProgressUid(), progressAuditDTO.getAuditUserUid());

        switch (progressAuditDTO.getAuditStatus()) {
            case TYP_APPROVED: {
                progressApprovedHandle(progress.getAuditUid(), progressAuditDTO.getAuditUserUid(), progressAuditDTO.getNextAuditorList());
                break;
            }
            case TYP_REJECTED: {
                progressRejectedHandle(progress.getAuditUid(), progressAuditDTO.getAuditUserUid());
                break;
            }
            default: {
                throw new BaseException(BaseCode.WORKFLOW_AUDIT_STATUS_ERROR, "审核操作不支持");
            }
        }

//        workflowNotifier.notifyWorkflowStepResult(progress.getProgressUid());
    }

    private void progressRejectedHandle(String businessAuditUid, String auditUserUid) {
        businessAuditMapper.businessAuditFail(businessAuditUid, auditUserUid);
    }

    private void businessAuditPreVerify(String auditUid, AuditStatusEnum auditStatus) {
        AuditOperationEnum auditOperation = null;
        if (AuditStatusEnum.TYP_APPROVED.equals(auditStatus)) {
            auditOperation = AuditOperationEnum.APPROVED;
        }
        if (AuditStatusEnum.TYP_REJECTED.equals(auditStatus)) {
            auditOperation = AuditOperationEnum.REJECTED;
        }
        if (Objects.isNull(auditOperation)) {
            throw new BaseException(BaseCode.WORKFLOW_AUDIT_STATUS_ERROR, "审核操作不支持");
        }
        String verifyResult = Constants.SUCCESS;
        try {
            BusinessAuditPO businessAuditApply = businessAuditMapper.getBusinessAuditByAduitUid(auditUid);
            for (BusinessAuditResultHandle handler : businessAuditResultHandleList) {
                if (handler.support(businessAuditApply)) {
                    verifyResult = handler.businessAuditPreVerify(businessAuditApply, auditOperation);
                    break;
                }
            }
        } catch (Exception e) {
            logger.error("回调业务校验异常", e);
//            throw new BaseException(BaseCode.WORKFLOW_AUDIT_PER_VERIFY_ERROR, "回调业务校验异常");
        }
        if (!Constants.SUCCESS.equalsIgnoreCase(verifyResult)) {
//            throw new BaseException(BaseCode.WORKFLOW_AUDIT_PER_VERIFY_REFUSE, verifyResult);
        }
    }




    private void progressApprovedHandle(String businessAuditUid, String auditUserUid, List<String> nextAuditorList) {
        BusinessAuditPO businessAuditApply = businessAuditMapper.getBusinessAuditByAduitUid(businessAuditUid);
        WorkflowStepPO nextStep = getNextWorkflowStep(businessAuditUid, businessAuditApply);
        if (Objects.isNull(nextStep)) {
            businessAuditMapper.businessAuditSuccess(businessAuditUid, auditUserUid);
        } else {
            workflowNextStepHandle(nextStep, businessAuditApply, nextAuditorList);
        }
    }

    private void workflowNextStepHandle(WorkflowStepPO nextStep, BusinessAuditPO businessAuditApply, List<String> nextAuditorList) {
        BusinessAuditWorkflowStrategy strategy = businessAuditWorkflowStrategyHolder.selectStrategy(nextStep, businessAuditApply);
        strategy.handle(nextStep, businessAuditApply, nextAuditorList);
    }


    private WorkflowStepPO getNextWorkflowStep(String businessAuditUid, BusinessAuditPO businessAuditApply) {
        List<BusinessAuditProgressPO> progressList = businessAuditProgressMapper.listAuditProgressByAuditUid(businessAuditUid);
        WorkflowPO workflow = workflowService.getWorkflowByWorkflowUid(businessAuditApply.getWorkflowUid());
        List<WorkflowStepPO> workflowStepList = Optional.ofNullable(workflow).map(WorkflowPO::getWorkflowStepPOs).orElse(Collections.emptyList());
        if (CollectionUtils.isEmpty(workflowStepList)) {
            return null;
        }
        //根据传过来的步骤信息，在一直的process中查当前已经到了哪个步骤，如果又查到就返回查到的第一个步骤
        List<WorkflowStepPO> sortedStepList = workflowStepList.stream().sorted(Comparator.comparing(WorkflowStepPO::getStepUid)).collect(Collectors.toList());
        for (WorkflowStepPO stepPO : sortedStepList) {
            if (stepIsSuspending(stepPO, progressList)) {
                return stepPO;
            }
        }
        return null;
    }

    private boolean stepIsSuspending(WorkflowStepPO stepPO, List<BusinessAuditProgressPO> progressList) {
        for (BusinessAuditProgressPO progressPO : progressList) {
            if (Objects.equals(progressPO.getWorkflowStepUid(), stepPO.getStepUid())) {
                return false;
            }
        }
        return true;
    }

    private BusinessAuditPO buildBusinessAuditPO(BusinessAuditApplyDTO auditApplyDTO) {
        WorkflowPO workflow = workflowService.getWorkflowByWorkflowKey(auditApplyDTO.getWorkflowKey().name());
        if (Objects.isNull(workflow)) {
            throw new BaseException(BaseCode.WORKFLOW_PROGRESS_NOT_EXISTS, String.format("未配置key = %s 对应的审核流", auditApplyDTO.getWorkflowKey().name()));
        }
        BusinessAuditPO businessAuditPO = new BusinessAuditPO();
        businessAuditPO.setWorkflowUid(workflow.getWorkflowUid());
        businessAuditPO.setBusinessUid(auditApplyDTO.getBusinessUid());
        businessAuditPO.setBusinessName(auditApplyDTO.getBusinessName());
        businessAuditPO.setBusinessType(auditApplyDTO.getBusinessType());
        businessAuditPO.setBusinessData(auditApplyDTO.getBusinessData());
        businessAuditPO.setAuditStatus(AuditStatusEnum.TYP_PENDING);
        businessAuditPO.setCreatedBy(auditApplyDTO.getApplyUserUid());
        String mallUid = Optional.ofNullable(auditApplyDTO)
                .map(BusinessAuditApplyDTO::getMallUid)
                .filter(StringUtils::isNotBlank)
                .orElse(Constants.DEFAULT_MALL_UID);
        businessAuditPO.setMallUid(mallUid);
        return businessAuditPO;
    }
}
