package cww.world.otherInfo;

import cww.world.otherInfo.java8.lambda.Person;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        Person person4 = new Person();

        person1.setAge(1);
        person2.setAge(2);
        person3.setAge(3);

        person4.setAge(3);

        ArrayList<Person> objects = new ArrayList<>();
        objects.add(person1);
        objects.add(person2);
        objects.add(person3);

        ArrayList<Person> objects2 = new ArrayList<>();
        objects2.add(person4);

        System.out.println(objects);
        objects.removeAll(objects2);

        System.out.println(objects);
    }
}
