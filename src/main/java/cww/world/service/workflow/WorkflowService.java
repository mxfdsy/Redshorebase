package cww.world.service.workflow;

import cww.world.pojo.po.workflow.WorkflowPO;

import java.util.List;

/**
 * 工作流service
 */
public interface WorkflowService {

    WorkflowPO getWorkflowByWorkflowKey(String workflowKey);

    WorkflowPO getWorkflowByWorkflowUid(String workflowUid);
}
