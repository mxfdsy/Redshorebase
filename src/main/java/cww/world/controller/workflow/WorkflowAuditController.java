package cww.world.controller.workflow;

import cww.world.common.Enum.workflow.AuditOperationEnum;
import cww.world.common.Enum.workflow.AuditStatusEnum;
import cww.world.common.constant.BaseCode;
import cww.world.common.exception.BaseException;
import cww.world.common.util.FastJsonUtils;
import cww.world.common.util.ResultBuilderUtils;
import cww.world.common.util.SessionGetter;
import cww.world.common.validate.EntityValidator;
import cww.world.common.validate.ValidateResult;
import cww.world.controller.BaseController;
import cww.world.pojo.dto.workflow.*;
import cww.world.pojo.po.account.UserAccountPO;
import cww.world.service.account.UserAccountService;
import cww.world.service.workflow.BusinessAuditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Controller
@RequestMapping("workflow/audit")
public class WorkflowAuditController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(WorkflowAuditController.class);


    @Autowired
    private UserAccountService userAccountService;

    @Autowired
    private BusinessAuditService businessAuditService;

    @ResponseBody
    @RequestMapping(value = "/progress", method = RequestMethod.POST, produces = JSON_UTF8)
    public String auditOperation(@RequestBody String payload) {
        String currentUserUid = SessionGetter.getLoginUserUid();
        logger.warn("{}用户进行审核操作，payload = {}", currentUserUid, payload);
        AuditOperationDTO auditOperationDTO = FastJsonUtils.toBean(payload, AuditOperationDTO.class);
        auditOperationDTO.setAuditorUserUid(currentUserUid);
        ValidateResult validateResult = EntityValidator.validate(auditOperationDTO);
        if (validateResult.hasError()) {
            throw new BaseException(BaseCode.INVALID_ARGUMENT, validateResult.getErrorMessages());
        }
        UserAccountPO auditor = userAccountService.searchUserAccountByUserUid(auditOperationDTO.getAuditorUserUid());
        List<AuditOperationItem> progressList = auditOperationDTO.getProgressList();
        ArrayList<AuditOperationErrorDetailItemDTO> failList = new ArrayList<>(progressList.size());
        for (AuditOperationItem progress : progressList) {
            ProgressAuditDTO param = getProgressAuditDTO(auditOperationDTO, auditor, progress);
            try {
                businessAuditService.userAuditProgressHandle(param);
            } catch (Exception e) {
                logger.error("审核处理错误，param = {}", param, e);
                if (e instanceof BaseException) {
                    BaseException be = (BaseException) e;
                    int errorCode = be.getError().getCode();
                    String errorMsg = be.getLocalizedMessage();
                    failList.add(new AuditOperationErrorDetailItemDTO(progress, errorCode, errorMsg));
                } else {
                    failList.add(new AuditOperationErrorDetailItemDTO(progress, e.getLocalizedMessage()));
                }
            }
        }
        AuditOperationResultDTO result = new AuditOperationResultDTO();
        result.setFailDetails(failList);
        result.setFail(failList.size());
        result.setSuccess(progressList.size() - failList.size());
        return ResultBuilderUtils.buildSuccess(result);
    }

    private ProgressAuditDTO getProgressAuditDTO(AuditOperationDTO auditOperationDTO, UserAccountPO auditor, AuditOperationItem progress) {
        ProgressAuditDTO param = new ProgressAuditDTO();
        param.setAuditProgressUid(progress.getProgressUid());
        param.setAuditUserUid(auditor.getUserUid());
        param.setAuditUserName(auditor.getName());
        param.setAuditUserPhone(auditor.getPhone());
        if (Objects.equals(auditOperationDTO.getOperation(), AuditOperationEnum.APPROVED)) {
            param.setAuditStatus(AuditStatusEnum.TYP_APPROVED);
        }
        if (Objects.equals(auditOperationDTO.getOperation(), AuditOperationEnum.REJECTED)) {
            param.setAuditStatus(AuditStatusEnum.TYP_REJECTED);
        }
        param.setNextAuditorList(auditOperationDTO.getNextAuditorList());
        param.setAuditReason(auditOperationDTO.getReason());
        return param;
    }


}
