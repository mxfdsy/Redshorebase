package cww.world.java8.groupandsum;

import cww.world.java8.po.Father;
import cww.world.java8.po.Son;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Group {
    public static void main(String[] args) {
        Father father1 = new Father();
        father1.setName("1");
        father1.setBigDecimal(new BigDecimal("1.100"));
        father1.setAge(11);

        Father father2 = new Father();
        father2.setName("1");
        father2.setBigDecimal(new BigDecimal("2"));
        father1.setAge(11);
        Father father3 = new Father();
        father3.setName("1");
        father3.setBigDecimal(new BigDecimal("3"));
        father1.setAge(11);

        List<Father> fathers = new ArrayList<>();
        fathers.add(father1);
        fathers.add(father2);
        fathers.add(father3);

        Son son = new Son();
        son.setFatherList(Collections.EMPTY_LIST);

//        System.out.println(collect);
//        Group predicateTest = new Group();
//        List<Integer> result = predicateTest.conditionFilter(fathers.stream().map(Father::getAge).collect(Collectors.toList()),
//                integer -> integer > 5);


    }

    public List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
