package cww.world.java8.consumer;

import cww.world.java8.po.Father;

import java.math.BigDecimal;

public class Consumer {
    public static void main(String[] args) {
        /**
         * 该在对传进来的类做特定的操作
         */
        java.util.function.Consumer<Father> fatherConsumer = (father -> father.setBigDecimal(father.getBigDecimal().add(BigDecimal.TEN)));
        fatherConsumer.accept(new Father("cww",233, BigDecimal.ZERO));
    }
}
