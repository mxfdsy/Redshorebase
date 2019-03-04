package cww.world.reflect;

import cww.world.common.constant.BaseCode;
import cww.world.common.exception.BaseException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUtil {

    public static List<?> sort(List<?> list, String fieldName) throws Exception {

        if (CollectionUtils.isEmpty(list)) {
            return list;
        }

        if (StringUtils.isBlank(fieldName)) {
            throw new Exception("排序方法，参数（字段名）不能为空");
        }


        if (ReflectionUtils.findField(list.get(0).getClass(), fieldName) == null) {
            throw new BaseException(BaseCode.INTERNAL_ERROR, "实体类中不存在该字段名称");
        }

        Method method = ReflectionUtils.findMethod(list.get(0).getClass(), fieldName);
        Object o = ReflectionUtils.invokeMethod(method, fieldName);

        if (o instanceof String) {

        }

        if (o instanceof Integer || o instanceof BigDecimal) {


        }

        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {

                //反射获取集合元素的类型
                Class<?> c1 = o1.getClass();
                Class<?> c2 = o2.getClass();

                //反射得到对象的属性
                Field f1 = null;
                Field f2 = null;

                //field对应属性值
                String value1 = null;
                String value2 = null;

                int isExistFiled = 0;
                Field[] fields = c1.getDeclaredFields();
                for (Field f : fields) {
                    if (f.getName() == fieldName) {
                        isExistFiled++;
                    }
                }

                if (isExistFiled == 0) {
                    try {
                        throw new Exception("调用排序方法时出错，原因：集合元素不存在该属性");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                try {
                    f1 = c1.getDeclaredField(fieldName);
                    f2 = c2.getDeclaredField(fieldName);

                    f1.setAccessible(true);//设置访问私有属性权限
                    f2.setAccessible(true);
                    value1 = (String) f1.get(o1);
                    value2 = (String) f2.get(o2);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return compair(value1, value2, "");
            }

        });
        return list;
    }

    public static List<?> sort(List<?> list, String fieldName, String desc) throws Exception {


        if (list == null) {
            return null;
        }

        if (fieldName == null || fieldName.trim() == "") {
            throw new Exception("排序方法，参数（字段名）不能为空");
        }
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {

                //反射获取集合元素的类型
                Class<?> c1 = o1.getClass();
                Class<?> c2 = o2.getClass();

                //反射得到对象的属性
                Field f1 = null;
                Field f2 = null;

                //field对应属性值
                String value1 = null;
                String value2 = null;

                int isExistFiled = 0;
                Field[] fields = c1.getDeclaredFields();
                for (Field f : fields) {
                    if (f.getName() == fieldName) {
                        isExistFiled++;
                    }
                }

                if (isExistFiled == 0) {
                    try {
                        throw new Exception("调用排序方法时出错，原因：集合元素不存在该属性");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                try {
                    f1 = c1.getDeclaredField(fieldName);
                    f2 = c2.getDeclaredField(fieldName);

                    f1.setAccessible(true);//设置访问私有属性权限
                    f2.setAccessible(true);
                    value1 = (String) f1.get(o1);
                    value2 = (String) f2.get(o2);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return compair(value1, value2, desc);
            }

        });
        return list;
    }

    public static String[] sort(String[] strs) {

        String temp;
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = 0; j < strs.length - 1 - i; j++) {
                int ai = ascii(strs[j], 0);
                int aj = ascii(strs[j + 1], 0);
                if (ai > aj) {
                    temp = strs[j];
                    strs[j] = strs[j + 1];
                    strs[j + 1] = temp;
                }
                if (ai == aj) {
                    int iNum = Integer.valueOf(strs[j].substring(1, strs[j].length()));
                    int jNum = Integer.valueOf(strs[j + 1].substring(1, strs[j + 1].length()));
                    if (iNum > jNum) {
                        temp = strs[j];
                        strs[j] = strs[j + 1];
                        strs[j + 1] = temp;
                    }
                }
                for (String a : strs) {
                    System.out.print(a + ",");
                }

            }
        }
        return strs;

    }

    private static int compair(String value1, String value2, String desc) {

        int result = 1;

        if (desc.trim() == "desc") {
            result = -1;
        }

        if (ascii(value1, 0) > ascii(value2, 0)) {
            System.out.println("result的值" + result);
            return result;
        }
        if (ascii(value1, 0) == ascii(value2, 0)) {
            int o1Num = Integer.valueOf(value1.substring(1, value1.length()));
            int o2Num = Integer.valueOf(value2.substring(1, value2.length()));
            if (o1Num > o2Num) {
                System.out.println("result的值" + result);
                return result;
            }
            if (o1Num < o2Num) {
                return (-result);
            }
        }
        if ((ascii(value1, 0) < ascii(value2, 0))) {
            return (-result);
        }
        return 0;
    }

    //str中的第index值的Asll值
    //1~9是49~57，A~Z 是65~90
    public static int ascii(String str, int index) {
        return (int) str.toCharArray()[index];


    }
}
