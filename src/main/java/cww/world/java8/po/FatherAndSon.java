package cww.world.java8.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FatherAndSon {

    public static  List<Son> getSons() {
        Son son1 = new Son();
        son1.setName("1");
        son1.setBigDecimal(new BigDecimal("1.100"));
        son1.setAge(11);
        son1.setBusinessType("cww");

        Son son2 = new Son();
        son2.setName("1");
        son2.setBigDecimal(new BigDecimal("2"));
        son2.setBusinessType("cww");

        Son son3 = new Son();
        son3.setName("1");
        son3.setBigDecimal(new BigDecimal("3"));
        son3.setAge(11);
        son3.setBusinessType("55");

        List<Son> sons = new ArrayList<>();
        sons.add(son1);
        sons.add(son2);
        sons.add(son3);
        return sons;
    }


    public static List<Father> getFathers() {
        Father father1 = new Father();
        father1.setName("1");
        father1.setBigDecimal(new BigDecimal("1.100"));
        father1.setAge(11);
        father1.setBusinessType("cww");

        Father father2 = new Father();
        father2.setName("1");
        father2.setBigDecimal(new BigDecimal("2"));
        father2.setBusinessType("cww");

        Father father3 = new Father();
        father3.setName("1");
        father3.setBigDecimal(new BigDecimal("3"));
        father3.setAge(11);
        father3.setBusinessType("55");

        List<Father> fathers = new ArrayList<>();
        fathers.add(father1);
        fathers.add(father2);
        fathers.add(father3);
        return fathers;
    }
}
