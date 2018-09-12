package cww.world.service.workflow;


import cww.world.pojo.dto.workflow.BusinessAuditApplyDTO;
import cww.world.pojo.dto.workflow.ProgressAuditDTO;

import java.util.Collection;
import java.util.List;

public interface BusinessAuditService {

    /**
     * 用户提交业务审核
     *
     * @param auditApplyDTO 业务审核申请DTO
     * @return 业务审核记录uid
     */
    String userApplyBusinessAudit(BusinessAuditApplyDTO auditApplyDTO);

    /**
     * 用户处理审核（同意或拒绝操作）
     */
    void userAuditProgressHandle(ProgressAuditDTO progressAuditDTO);

}
