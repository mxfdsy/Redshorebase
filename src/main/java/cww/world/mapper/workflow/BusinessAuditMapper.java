package cww.world.mapper.workflow;

import cww.world.common.Enum.workflow.BusinessType;
import cww.world.pojo.po.workflow.BusinessAuditPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface BusinessAuditMapper {
    int insert(BusinessAuditPO businessAuditPO);

    BusinessAuditPO getBusinessAuditByAduitUid(@Param("businessAuditUid") String businessAuditUid);

    int businessAuditSuccess(@Param("businessAuditUid") String businessAuditUid, @Param("auditUserUid") String auditUserUid);

    int businessAuditFail(@Param("businessAuditUid") String businessAuditUid, @Param("auditUserUid") String auditUserUid);

    Integer businessAuditCancel(@Param("businessAuditUid") String businessAuditUid, @Param("auditUserUid") String auditUserUid);

    List<BusinessAuditPO> listPendingAuditByWorkflowUid(@Param("workflowUid") String workflowUid);

    List<BusinessAuditPO> listPendingAuditByBusinessType(@Param("businessType") String businessType);

    int cancelPendingAuditByWorkflowUid(@Param("workflowUid") String workflowUid);

    List<BusinessAuditPO> listPendingAuditByUserUid(@Param("auditor_user_uid") String auditorUserUid);

    List<BusinessAuditPO> listPendingAuditByAuditUidsAndBusinessTypes(@Param("audit_uid_list") Collection<String> auditUidList, @Param("business_type_list") Collection<BusinessType> businessTypeList);

    int countPendingAuditByUserUidAndBusinessType(@Param("auditor_user_uid") String userUid, @Param("business_type") BusinessType businessType);

    int countBusinessAuditByWorkflowUid(@Param("workflow_uid") String workflowUid);

    BusinessAuditPO getPendingBusinessAuditByWorkflowKeyAndBusinessUid(@Param("workflow_key") String workflowKey, @Param("business_uid") String businessUid);
}
