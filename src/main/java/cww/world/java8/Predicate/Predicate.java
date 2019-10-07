package cww.world.java8.Predicate;

import cww.world.common.constant.BaseCode;
import cww.world.common.exception.BaseException;
import cww.world.java8.po.Father;
import cww.world.java8.po.FatherAndSon;
import cww.world.java8.po.Son;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Predicate {
    public static void main(String[] args) {
        List<Father> fathers = FatherAndSon.getFathers();
        List<Son> sons = FatherAndSon.getSons();


        List<CompletableFuture<Object>> collect = sons.stream().map(e -> CompletableFuture.supplyAsync(() -> {
            if (1 == 1) {
                throw new BaseException(BaseCode.DATE_ERROR);
            }
            return null;
        })).collect(Collectors.toList());

        List<Object> collect1 = collect.stream().map(item -> {
            return item.join();

        }).collect(Collectors.toList());


        Predicate predicateTest = new Predicate();

//        predicateTest.conditionFilter(fathers,father->father)

//        System.out.println(fathers.stream().filter(father -> "cww".equals(father.getBusinessType())).collect(Collectors.toList()));


        Consumer<Father> fatherConsumer = (father -> father.setBigDecimal(father.getBigDecimal().add(BigDecimal.TEN)));

        fatherConsumer.accept(new Father("cww", 233, BigDecimal.ZERO));
    }


//    public List<Father> conditionFilter(List<Father> lsit, Predicate<Father> predicate){
//
//    }
}
