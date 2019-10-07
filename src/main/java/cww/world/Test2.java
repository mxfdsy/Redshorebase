package cww.world;

import cww.world.java8.po.Son;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class Test2 {
    public static void main(String[] args) {

        /**
         * 循环引用-是一种错误的编程，而不是一种技巧
         */
        cycleUse();


        /**
         * 是浅拷贝
         */
        littleCopy();
    }

    private static void cycleUse() {

        Son son1 = new Son();
        son1.setAge(2);
        Son son2 = new Son();
        son2.setAge(2);
        Son son3 = new Son();
        son3.setAge(2);

        Son son4 = new Son();
        son2.setAge(2);
        Son son5 = new Son();
        son3.setAge(2);

        List<Son> sonsList1 = Arrays.asList(son1, son2, son3);
        List<Son> sonsList2 = Arrays.asList(son4, son5);

        ArrayList<Son> objects = new ArrayList<>();
        sonsList1.forEach(n -> {
            List<Son> belongGuideEcSaleList = new ArrayList<>();
            sonsList2.forEach(n2->{
                    n2.setAge(5);
                belongGuideEcSaleList.add(n2);
                });


            Son finalSon = new Son();
//            Son finalSon = belongGuideEcSaleList.stream().findFirst().get();
            finalSon.setAge(10);
            objects.add(finalSon);

                }
        );

        System.out.println("");

    }

    private static void littleCopy() {
        Son son1 = new Son();
        son1.setName("cww");
        Son son2 = new Son();
        Son son4 = new Son();


        List<Son> sons = Arrays.asList(son1, son2, son4);
        List<Son> collect = sons.stream().filter(n -> "cww".equals(n.getName())).collect(Collectors.toList());
        collect.forEach(n -> n.setAge(18));
        System.out.println("xxxx");
    }
}
