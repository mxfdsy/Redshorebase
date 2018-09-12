package cww.world.service.workflow.strategy;

import cww.world.common.constant.BaseCode;
import cww.world.common.exception.BaseException;
import cww.world.pojo.po.workflow.BusinessAuditPO;
import cww.world.pojo.po.workflow.WorkflowStepPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BusinessAuditWorkflowStrategyHolder {

    @Autowired
    private List<BusinessAuditWorkflowStrategy> strategyList;

    public BusinessAuditWorkflowStrategy selectStrategy(WorkflowStepPO nextStep, BusinessAuditPO businessAuditApply) {
        for (BusinessAuditWorkflowStrategy strategy : strategyList) {
            if (strategy.support(nextStep, businessAuditApply)) {
                return strategy;
            }
        }
        throw new BaseException(BaseCode.OPERATION_NOT_SUPPORT, "没有找到支持的策略");
    }
}
