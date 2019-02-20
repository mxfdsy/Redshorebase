package cww.world.otherInfo.reflect;

import cww.world.otherInfo.elasticsearch.bean.Person;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Person person = new Person();
        person.setAge(11);
        person.setName("cww");
        System.out.println(person);

        Person person2 = new Person();
        person2.setAge(18);
        person2.setName("cww003");
        System.out.println(person2);

//        Field name = person.getClass().getDeclaredField("age");
//        System.out.println(name.getName());
        Field[] declaredFields = person.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            PropertyDescriptor pd = new PropertyDescriptor(declaredField.getName(), person.getClass());
            Method readMethod = pd.getReadMethod();
            declaredField.setAccessible(true);
            declaredField.set(person2, "3");
            Object invoke = readMethod.invoke(person2);
            System.out.println(person2);
            String s1 = invoke.toString();
            System.out.println(s1);
        }

        reflectTest02();


    }

    private static void reflectTest02() {


    }
}
