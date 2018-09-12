package cww.world.service.workflow.strategy;

import cww.world.common.Enum.workflow.ApprovalGroupTypeEnum;
import cww.world.pojo.po.account.UserAccountPO;
import cww.world.pojo.po.workflow.BusinessAuditPO;
import cww.world.pojo.po.workflow.WorkflowStepPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author xujun
 */
@Component
public class IndividualBusinessAuditWorkflowStrategy extends AbstractAuditWorkflowStrategy {


    @Override
    public boolean support(WorkflowStepPO nextStep, BusinessAuditPO businessAuditApply) {
        return Objects.equals(nextStep.getApprovalGroupType(), ApprovalGroupTypeEnum.TYP_INDIVIDUAL.name());
    }

    @Override
    public List<UserAccountPO> getWaitingAuditorList(WorkflowStepPO nextStep, BusinessAuditPO businessAuditApply) {
        return null;
    }
}
