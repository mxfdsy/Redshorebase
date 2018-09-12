package cww.world.service.workflow.impl;

import cww.world.mapper.workflow.WorkflowMapper;
import cww.world.pojo.po.workflow.WorkflowPO;
import cww.world.service.workflow.BusinessAuditService;
import cww.world.service.workflow.WorkflowService;
import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 工作流service实现
 *
 * @author greatwall
 */
@Service
public class WorkflowServiceImpl implements WorkflowService {

    @Autowired
    private WorkflowMapper workflowMapper;


    @Autowired
    private BusinessAuditService businessAuditService;

    @Override
    public WorkflowPO getWorkflowByWorkflowKey(String workflowKey) {
        return workflowMapper.getByWorkflowKey(workflowKey);
    }

    @Override
    public WorkflowPO getWorkflowByWorkflowUid(String workflowUid) {
        return workflowMapper.getByWorkflowUid(workflowUid);
    }


}
