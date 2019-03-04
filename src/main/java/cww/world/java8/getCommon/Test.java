package cww.world.java8.getCommon;

import cww.world.java8.po.Father;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);


        Father father1 = new Father();
        father1.setAge(100);

        Father father2 = new Father();
        father2.setAge(300);


        ArrayList<Father> f1 = new ArrayList<>();
        f1.add(father1);

        ArrayList<Father> f2 = new ArrayList<>();

        f2.add(father2);

        System.out.println("====求交集对象===");

//        List<Integer> list=f1.stream().filter(t->t.equals(getItem(f2))).collect(Collectors.toList());
//        list.stream().forEach(System.out::println);


        System.out.println("====求交集===");

        List<Integer> list = list1.stream().filter(t -> list2.contains(t)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);

        System.out.println("====求差集===");
        list = list1.stream().filter(t -> !list2.contains(t)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);

        System.out.println("====求并集===");
        list.addAll(list1);
        list.addAll(list2);
        list = list.stream().distinct().collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }


}
