package cww.world.service.workflow.strategy;

import cww.world.common.Enum.workflow.AuditStatusEnum;
import cww.world.common.Enum.workflow.UserAuditStatusEnum;
import cww.world.common.constant.BaseCode;
import cww.world.common.constant.Constants;
import cww.world.common.exception.BaseException;
import cww.world.mapper.workflow.BusinessAuditProgressMapper;
import cww.world.mapper.workflow.BusinessAuditTodoListMapper;
import cww.world.pojo.po.account.UserAccountPO;
import cww.world.pojo.po.workflow.BusinessAuditPO;
import cww.world.pojo.po.workflow.BusinessAuditProgressPO;
import cww.world.pojo.po.workflow.BusinessAuditTodoListPO;
import cww.world.pojo.po.workflow.WorkflowStepPO;
import cww.world.service.account.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class AbstractAuditWorkflowStrategy implements BusinessAuditWorkflowStrategy {
    @Autowired
    private BusinessAuditProgressMapper businessAuditProgressMapper;

    @Autowired
    private UserAccountService userAccountService;

    @Autowired
    private BusinessAuditTodoListMapper businessAuditTodoListMapper;

    @Override
    public void handle(WorkflowStepPO nextStep, BusinessAuditPO businessAuditApply, List<String> nextAuditorList) {
        if (!support(nextStep, businessAuditApply)) {
            throw new BaseException(BaseCode.WORKFLOW_AUDIT_STRATEGY_NOT_SUPPORT);
        }

        BusinessAuditProgressPO businessAuditProgressPO = insertAuditProgress(nextStep, businessAuditApply);

        List<UserAccountPO> userAccountList = getWaitingAuditorList(nextStep, businessAuditApply);

        List<UserAccountPO> additionalAuditorList = Collections.emptyList();
        if (!CollectionUtils.isEmpty(nextAuditorList)) {
            additionalAuditorList = userAccountService.searchUserAccountByUserUids(nextAuditorList);
        }

        List<UserAccountPO> auditorList = Stream.of(userAccountList, additionalAuditorList)
                .filter(Objects::nonNull)
                .flatMap(List::stream)
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(UserAccountPO::getUserUid))), ArrayList::new));

        if (CollectionUtils.isEmpty(auditorList)) {
            throw new BaseException(BaseCode.WORKFLOW_AUDITOR_LIST_IS_EMPTY, "审核候选人为空");
        }
        saveTodoUser(nextStep, businessAuditProgressPO, auditorList, nextAuditorList);
    }
    private void saveTodoUser(WorkflowStepPO nextStep, BusinessAuditProgressPO businessAuditProgressPO, List<UserAccountPO> auditorUidSet, List<String> nextAuditorList) {
        List<BusinessAuditTodoListPO> todoList = new ArrayList<>(auditorUidSet.size());
        for (UserAccountPO user : auditorUidSet) {
            BusinessAuditTodoListPO businessAuditTodoListPO = new BusinessAuditTodoListPO();
            businessAuditTodoListPO.setAuditProgressUid(businessAuditProgressPO.getProgressUid());
            businessAuditTodoListPO.setStatus(UserAuditStatusEnum.TODO);
            businessAuditTodoListPO.setAuditorUserUid(user.getUserUid());
            businessAuditTodoListPO.setAuditorUserName(user.getName());
            businessAuditTodoListPO.setCreatedBy(nextStep.getStepUid());
            businessAuditTodoListPO.setSource(getSource(user.getUserUid(), nextAuditorList));
            todoList.add(businessAuditTodoListPO);
        }
        businessAuditTodoListMapper.batchInsert(todoList);
    }

    private String getSource(String userUid, List<String> nextAuditorList) {
        if (!CollectionUtils.isEmpty(nextAuditorList)
                && nextAuditorList.contains(userUid)) {
            return Constants.AUDUTOR_LIST_SOUCE_MANUAL;
        }
        return Constants.AUDUTOR_LIST_SOUCE_WORKFLOWSTEP;
    }



    private BusinessAuditProgressPO insertAuditProgress(WorkflowStepPO nextStep, BusinessAuditPO businessAuditApply) {
        BusinessAuditProgressPO businessAuditProgressPO = new BusinessAuditProgressPO();
        businessAuditProgressPO.setAuditUid(businessAuditApply.getAuditUid());
        businessAuditProgressPO.setWorkflowStepUid(nextStep.getStepUid());
        businessAuditProgressPO.setWorkflowStep(nextStep.getStep());
        businessAuditProgressPO.setAuditStatus(AuditStatusEnum.TYP_PENDING);
        businessAuditProgressPO.setWorkflowStepDesc(nextStep.getStepDesc());
        businessAuditProgressMapper.insert(businessAuditProgressPO);
        return businessAuditProgressPO;
    }

}
