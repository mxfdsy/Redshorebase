package cww.world.service.workflow.strategy;

import cww.world.pojo.po.account.UserAccountPO;
import cww.world.pojo.po.workflow.BusinessAuditPO;
import cww.world.pojo.po.workflow.WorkflowStepPO;

import java.util.List;

public interface BusinessAuditWorkflowStrategy {
    boolean support(WorkflowStepPO nextStep, BusinessAuditPO businessAuditApply);

    void handle(WorkflowStepPO nextStep, BusinessAuditPO businessAuditApply, List<String> nextAuditorList);

    List<UserAccountPO> getWaitingAuditorList(WorkflowStepPO nextStep, BusinessAuditPO businessAuditApply);
}
