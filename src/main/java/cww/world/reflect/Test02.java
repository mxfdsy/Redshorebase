package cww.world.reflect;

import cww.world.elasticsearch.bean.Person;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException, SQLException {
        Person person1 = new Person();
        person1.setAge(01);
        person1.setName("cww1");
        System.out.println(person1);


        Person person2 = new Person();
        person2.setAge(02);
        person2.setName("cww2");
        System.out.println(person2);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

        Iterator<Person> iterator = personList.iterator();
        Person person = iterator.next().getClass().getConstructor().newInstance();
        System.out.println(person);

        Method age =  ReflectionUtils.findMethod(person1.getClass(), "getAge");
        Object o = ReflectionUtils.invokeJdbcMethod(age, person1);
        System.out.println(o.toString()+ "1111");

        List<String> strings = new ArrayList<>();
        strings.add("age");
        strings.add("name");
        for (String string : strings) {
            for (Person person3 : personList) {
                Field declaredField = person3.getClass().getDeclaredField(string);
                declaredField.setAccessible(true);
                if (declaredField.getType().getName().equals("java.lang.String")) {
                    declaredField.set(person,"cwww");
                }
                if (declaredField.getType().getName().equals("java.lang.Integer")) {
                    declaredField.set(person,55);
                }
            }

        }
        System.out.println(person);

    }
}
