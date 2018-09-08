package cww.world.java8.stream;

import com.alibaba.fastjson.JSON;
import cww.world.java8.po.Father;
import cww.world.java8.po.son;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
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

        son son1 = new son();
        son1.setAge(19);

        son son2 = new son();
        son2.setAge(20);

        father.setSonList(Arrays.asList(son1, son2));
        return father;
    }

    private static void toStream(Father father) {
        System.out.println("distinct -------------------------去重");
        Stream<Integer> distinctStream = Stream.of(1, 2, 2, 5);
        System.out.println(distinctStream
                .distinct()
                .collect(Collectors.toList()));


        System.out.println("filter-------------------------过滤函数");
        Stream<Integer> filterStream = Stream.of(1, 2, 2, 5);
        System.out.println(filterStream
                .filter(item -> item > 2)
                .collect(Collectors.toList()));


        System.out.println("mapStream -------------------------转化后生成新的数值");
        System.out.println(Stream.of(father)
                .map(Father::getAge)
                .collect(Collectors.toList()));

//        System.out.println("mapStream- mapToInt -------------------------转化后生成新的数值");
//        System.out.println(Stream.of(father)
//                .mapToInt(Father::getAge).collect(Collectors.toList());


        System.out.println("flatMap -------------------------和map类似，不同的是其每个元素转换得到的是Stream对象，会把子Stream中的元素压缩到父集合中");

        System.out.println("若直接使用的是map 拿到的就是拿到的数据类型 如下拿到的就是list的Stream流");
        List<List<son>> collect1 = Stream.of(father)
                .map(Father::getSonList).collect(Collectors.toList());

        System.out.println("若直接使用的是flatMap 拿到的就是拿到的数据类型 如下拿到的就是list的Stream流");
        Stream<son> sonStream = Stream.of(father)
                .map(Father::getSonList)
                .flatMap(List::stream);

        List<son> collect = Stream.of(father)
                .map(Father::getSonList)
                .flatMap(List::stream).collect(Collectors.toList());    

        collect.forEach(item -> System.out.println(JSON.toJSON(item)));


        System.out.println(Stream.of(father)
                .map(Father::getSonList)
                .flatMap(List::stream).collect(Collectors.toList()));


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
