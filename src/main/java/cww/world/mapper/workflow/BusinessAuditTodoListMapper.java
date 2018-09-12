package cww.world.mapper.workflow;

import cww.world.pojo.po.workflow.BusinessAuditTodoListPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xujun
 */
@Mapper
public interface BusinessAuditTodoListMapper {

    int batchInsert(List<BusinessAuditTodoListPO> businessAuditTodoListPO);

    int progressAuditDone(@Param("progressUid") String progressUid, @Param("auditUserUid") String auditUserUid);

    BusinessAuditTodoListPO getTodoRecordByProgressUidAndUserUid(@Param("progressUid") String progressUid, @Param("userUid") String userUid);

    List<BusinessAuditTodoListPO> listAuditorListByProgressUid(@Param("progressUid") String progressUid);

    List<String> listUserAuditBusiness(@Param("userUid") String userUid);

    void batchDeletedTodoList(@Param("progressUid") String progressUid, @Param("deletedList") List<String> deletedList);
}
