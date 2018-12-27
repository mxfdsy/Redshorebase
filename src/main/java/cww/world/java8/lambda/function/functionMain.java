package cww.world.java8.lambda.function;

import java.util.function.Function;

public class functionMain {
    public static void main(String[] args) {
        /**
         * 需求：
         *    已知String 中有一个实例的方法（非静态方法）endWith
         *    想写一个方法封装该方法
         *
         *    借助 java8 提供Function接口t
         */
        //使用匿名内部类的方式
        Function function1 = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String t) {
                return null;
            }
        };

        String str = "hellow.xxx";
        Function<String, Boolean> function2 = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String suffix) {
                return str.endsWith(suffix);
            }
        };

        System.out.println(function2.apply("xxx"));


        //使用lambda
        Function<String, Boolean> function3 = suffix ->str.endsWith(suffix);

        //简写 实例方法引用
        Function<String, Boolean> function4 = str::endsWith;
        function4.apply("xx");


    }
}
