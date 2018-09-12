package cww.world.mapper.workflow;

import cww.world.pojo.dto.workflow.BusinessAuditConditionDTO;
import cww.world.pojo.dto.workflow.NeedSyncAuditProgressDTO;
import cww.world.pojo.dto.workflow.ProgressAuditDTO;
import cww.world.pojo.po.workflow.BusinessAuditProgressPO;
import cww.world.pojo.po.workflow.MyApproveDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

/**
 * @author xujun
 */
@Mapper
public interface BusinessAuditProgressMapper {
    int insert(BusinessAuditProgressPO businessAuditProgressPO);

    List<BusinessAuditProgressPO> listAuditProgressByAuditUid(@Param("auditUid") String auditUid);

    BusinessAuditProgressPO getAuditProgressByProgressUid(@Param("progressUid") String auditProgressUid);

    int userAuditUpdate(ProgressAuditDTO progressAuditDTO);

    Integer countMyApproveListByCondition(BusinessAuditConditionDTO condition);

    List<MyApproveDTO> listMyApproveListByCondition(BusinessAuditConditionDTO condition);

    Integer countMyAppliedListByCondition(BusinessAuditConditionDTO condition);

    List<MyApproveDTO> listMyAppliedListByCondition(BusinessAuditConditionDTO condition);

    List<NeedSyncAuditProgressDTO> fetchNeedSyncBusinessAuditProgress(@Param("groupType") String groupType, @Param("groupUidList") Collection<String> groupUidList);
}
