package cww.world.otherInfo.java8.reflection;

import java.lang.reflect.Field;

public class ReflectionTest {

    public static void main(String[] args) {
        Father father = new Father();
        father.setName("cww");
        father.setAge(18);

        Field[] declaredFields = Father.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {

            System.out.println(declaredField.getName());
            declaredField.setAccessible(true);
//            declaredField.get();
//            if (declaredField instanceof String) {
//
//            }
//        }
        }
    }
}
