package cww.world.message;

import cww.world.common.util.FastJsonUtils;
import cww.world.common.validate.EntityValidator;
import cww.world.common.validate.ValidateResult;
import cww.world.pojo.dto.workflow.BusinessAuditApplyDTO;
import cww.world.service.workflow.BusinessAuditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 小武 on 2018/9/12.
 */
public class WorkflowActivator {

    @Autowired
    private BusinessAuditService businessAuditService;

    private static final Logger logger = LoggerFactory.getLogger(WorkflowActivator.class);

    public void businessAuditApplyHandle(String payload) {
        logger.info("[申请审核] ::: {}", payload);
        BusinessAuditApplyDTO param = FastJsonUtils.toBean(payload, BusinessAuditApplyDTO.class);
        ValidateResult validateResult = EntityValidator.validate(param);
        if (validateResult.hasError()) {
            logger.error("审核申请入参校验失败，error = {}", validateResult.getErrorMessages());
            return;
        }
        businessAuditService.userApplyBusinessAudit(param);
    }
}
