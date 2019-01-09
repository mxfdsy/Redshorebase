package cww.world.traceImpl;

import cww.world.common.constant.BaseCode;
import cww.world.common.exception.BaseException;
import cww.world.pojo.po.trace.ModuleOperationTraceDetailPO;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 反射获取字段比较不同的字段值
 */
public class UserOperationTraceServiceImpl implements UserOperationTraceService {
    @Override
    public List<ModuleOperationTraceDetailPO> generateDetail(Generic newValue, Generic oldValue) {
        List<ModuleOperationTraceDetailPO> messageDTOS = new ArrayList<>();
        try {
            Field[] fields = newValue.getKey().getClass().getDeclaredFields();
            for (Field field : fields) {
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(), newValue.getKey().getClass());
                Method getMethod = pd.getReadMethod();
                Object o1 = getMethod.invoke(newValue.getKey());
                Object o2 = getMethod.invoke(oldValue.getKey());
                String s1 = o1 == null ? "" : o1.toString();
                String s2 = o2 == null ? "" : o2.toString();
                if (!s1.equals(s2)) {
                    ModuleOperationTraceDetailPO messageDTO = new ModuleOperationTraceDetailPO();
                    messageDTO.setItem(field.getName());
                    messageDTO.setNewValue(s1);
                    messageDTO.setOldValue(s2);
                    messageDTOS.add(messageDTO);
                }
            }
        } catch (Exception e) {
            throw new BaseException(BaseCode.INVALID_ARGUMENT, e.getMessage());
        }
        return messageDTOS;
    }
}
