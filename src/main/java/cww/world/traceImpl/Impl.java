package cww.world.traceImpl;

import cww.world.pojo.po.trace.ModuleOperationTraceDetailPO;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 操作记录：发q（解耦）-到不同的实现类（多态）-字段比较-反射-具体的变化值：enum类
 */
public class Impl {

    public static void main(String[] args) {

        //多态的实现
//        ModuleOperationTraceService moduleOperationTraceServiceImpl = moduleOperationTraceServiceImplMap.getOrDefault(
//                moduleOperationTraceMessage.getHandlerServiceName().toUpperCase(), defaultModuleOperationTraceServiceImpl);
//        moduleOperationTraceServiceImpl.insertModuleOperationTrace(moduleOperationTraceMessage);
//
        //字段比较

//        public List<ModuleOperationTraceDetailPO> generateDetail(Generic newValue, Generic oldValue) {
//            List<ModuleOperationTraceDetailPO> messageDTOS = new ArrayList<>();
//            try {
//                Field[] fields = newValue.getKey().getClass().getDeclaredFields();
//                for (Field field : fields) {
//                    PropertyDescriptor pd = new PropertyDescriptor(field.getName(), newValue.getKey().getClass());
//                    Method getMethod = pd.getReadMethod();
//                    Object o1 = getMethod.invoke(newValue.getKey());
//                    Object o2 = getMethod.invoke(oldValue.getKey());
//                    String s1 = o1 == null ? "" : o1.toString();
//                    String s2 = o2 == null ? "" : o2.toString();
//                    if (!s1.equals(s2)) {
//                        ModuleOperationTraceDetailPO messageDTO = new ModuleOperationTraceDetailPO();
//                        messageDTO.setItem(field.getName());
//                        messageDTO.setNewValue(s1);
//                        messageDTO.setOldValue(s2);
//                        messageDTOS.add(messageDTO);
//                    }
//                }
//            } catch (Exception e) {
//                throw new BaseException(BaseCode.INVALID_ARGUMENT, e.getMessage());
//            }
//            return messageDTOS;
//        }


        //具体的变化值：enum类
        ArrayList<Object> billMessageList = new ArrayList<>();
        //过滤账单中不必要的字段
        Iterator iterator = billMessageList.iterator();
        while (iterator.hasNext()) {
            ModuleOperationTraceDetailPO module = ((ModuleOperationTraceDetailPO) iterator.next());
            BillItemNameEnum billItemNameEnum = BillItemNameEnum.valueOfKeyStr(module.getItem());

            //过滤未知字段
            if (billItemNameEnum.equals(billItemNameEnum.unknow)) {
                iterator.remove();
            }
        }

        //数据库表设计
        //主表（主键-业务主键）-关联表（详细信息）
    }
}
