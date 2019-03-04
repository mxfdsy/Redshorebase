package cww.world.java8.stream;

import com.alibaba.fastjson.JSON;
import cww.world.java8.po.Father;
import cww.world.java8.po.Son;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamDemo {
    public static void main(String[] args) {
        /**
         * 创建stream的方式
         *
         */
//        createStream();

        /**
         * 转化Stream
         */
        Father father = getFather();
        toStream(father);
    }

    private static Father getFather() {
        Father father = new Father();
        father.setAge(1111);

        Son son1 = new Son();
        son1.setAge(19);

        Son son2 = new Son();
        son2.setAge(20);

        father.setSonList(Arrays.asList(son1, son2));
        return father;
    }

    private static void toStream(Father father) {
        System.out.println("distinct -------------------------去重");
        distinctDemo();


        System.out.println("filter-------------------------过滤函数");
        filterDemo();


        System.out.println("mapStream -------------------------转化后生成新的数值");
        mapDemo(father);

//        System.out.println("mapStream- mapToInt -------------------------转化后生成新的数值");
//        System.out.println(Stream.of(father)
//                .mapToInt(Father::getAge).collect(Collectors.toList());


        System.out.println("flatMap -----和map类似，它主要拿过来做转化如下 List<List<Son>> 转化为 List<Son>  转化后我们的.xx方法才可以使用");

        flatMapDemo(father);

        System.out.println("peek ----------------------新Stream每个元素被消费的时候都会执行给定的消费函数；");
        List<Integer> integers = peekDemo();


        System.out.println("skip ----------------------返回一个丢弃原Stream的前N个元素后剩下元素组成的新Stream,如果原Stream中包含的元素个数小于N，那么返回空Stream；");
        skipDemo(integers);

        System.out.println("limit ---------------------- 对一个Stream进行截断操作，获取其前N个元素，如果原Stream中包含的元素个数小于N，那就获取其所有的元素");
        limitDemo(integers);

    }

    private static void limitDemo(List<Integer> integers) {
        List<Integer> integers3 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers.stream().limit(2).collect(Collectors.toList()));
    }

    private static void skipDemo(List<Integer> integers) {
        List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers.stream().skip(2).collect(Collectors.toList()));
    }

    private static List<Integer> peekDemo() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.stream().filter(x -> x > 3).peek(e -> System.out.println(e)).collect(Collectors.toList());


        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        return integers;
    }

    private static void flatMapDemo(Father father) {
        System.out.println(" List<List<Son>> ");
        List<List<Son>> collect1 = Stream.of(father)
                .map(Father -> Father.getSonList()).collect(Collectors.toList());

        System.out.println(" List<Son>");
        List<Son> collect = Stream.of(father)
                .map(Father::getSonList)
                .flatMap(x -> x.stream()).collect(Collectors.toList());

        collect.forEach(item -> System.out.println(JSON.toJSON(item)));
    }

    private static void mapDemo(Father father) {
        System.out.println(Stream.of(father)
                .map(Father::getAge)
                .collect(Collectors.toList()));
    }

    private static void filterDemo() {
        Stream<Integer> filterStream = Stream.of(1, 2, 2, 5);
        System.out.println(filterStream
                .filter(item -> item > 2)
                .collect(Collectors.toList()));
    }

    private static void distinctDemo() {
        Stream<Integer> distinctStream = Stream.of(1, 2, 2, 5);
        System.out.println(distinctStream
                .distinct()
                .collect(Collectors.toList()));
    }

    private static void createStream() {

        //1. of方法：
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 5);
        Stream<String> stringStream = Stream.of("taobao");


        // 2 generator方法
        Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        });
        Stream.generate(() -> Math.random());
        Stream.generate(Math::random);


        //3. iterate方法
        Stream.iterate(1, item -> item + 1).limit(10).forEach(System.out::println);


        // Collection子类获取Stream

    }
}
