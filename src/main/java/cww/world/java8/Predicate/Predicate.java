package cww.world.java8.Predicate;

import cww.world.java8.po.Father;
import cww.world.java8.po.FatherAndSon;
import cww.world.java8.po.Son;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Consumer;

public class Predicate {
    public static void main(String[] args) {
        List<Father> fathers = FatherAndSon.getFathers();
        List<Son> sons = FatherAndSon.getSons();

        Predicate predicateTest = new Predicate();

//        predicateTest.conditionFilter(fathers,father->father)

//        System.out.println(fathers.stream().filter(father -> "cww".equals(father.getBusinessType())).collect(Collectors.toList()));


        Consumer<Father> fatherConsumer = (father -> father.setBigDecimal(father.getBigDecimal().add(BigDecimal.TEN)));

        fatherConsumer.accept(new Father("cww",233, BigDecimal.ZERO));
    }


//    public List<Father> conditionFilter(List<Father> lsit, Predicate<Father> predicate){
//
//    }
}
