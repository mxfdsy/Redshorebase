package cww.world.mapper.workflow;


import cww.world.common.Enum.workflow.AuditOperationEnum;
import cww.world.pojo.po.workflow.BusinessAuditPO;
import cww.world.pojo.po.workflow.BusinessAuditProgressNotifyMessageDTO;

public interface BusinessAuditResultHandle {
    /**
     * 判断是否支持下面的方法
     *
     * @param businessAuditPO
     * @return
     */
    boolean support(BusinessAuditPO businessAuditPO);

    /**
     * 审批最后状态的回调
     *
     * @param businessAuditPO
     */
    void handle(BusinessAuditPO businessAuditPO);

    /**
     * 审批中每步的审核结果回调
     *
     * @param businessAuditProgressNotifyMessageDTO
     */
    void auditProgressResultHandle(BusinessAuditProgressNotifyMessageDTO businessAuditProgressNotifyMessageDTO);

    /**
     * 审核前的业务校验回调，如果没有业务校验请返回Constants.SUCCESS
     *
     * @param businessAuditPO 审批记录
     * @param auditOperation  审核操作(表示这个审核是通过操作还是拒绝操作)
     * @return 如果校验通过，返回 Constants.SUCCESS ,失败返回失败原因（error_msg）
     */
    String businessAuditPreVerify(BusinessAuditPO businessAuditPO, AuditOperationEnum auditOperation);
}
