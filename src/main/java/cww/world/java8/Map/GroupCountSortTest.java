package cww.world.java8.Map;

import cww.world.CollectorsUtil;
import cww.world.java8.Map.bean.Item;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupCountSortTest {
    public static void main(String[] args) {


        groupTest1();

        //Group by the name + Count or Sum the Qty.
        groupTest2();

        //Group by Price – Collectors.groupingBy and Collectors.mapping example.
        groupTest3();

    }

    private static void groupTest3() {
        System.out.println("test3------------");
        List<Item> items = getItems();

        Map<BigDecimal, List<Item>> groupByPriceMap = items.stream().collect(
                Collectors.groupingBy(Item::getPrice)
        );

        System.out.println(groupByPriceMap);

        Map<BigDecimal, Set<String>> result = items.stream().collect(
                Collectors.groupingBy(Item::getPrice,
                        Collectors.mapping(Item::getName, Collectors.toSet()))
        );


        Map<String, BigDecimal> collect = items.stream().collect(
                Collectors.groupingBy(Item::getName,
                        CollectorsUtil.summingBigDecimal(e -> "add".equals(e.getBusinessType()) ? e.getPrice() : e.getPrice().negate()))
        );

        Map<String, Item> collect1 = items.stream().collect(
                Collectors.toMap(Item::getName, Function.identity())
        );

        collect1.values().stream()
                .forEach(e -> {
                    e.setPrice(collect.get(e.getName()));
                });

        List<Item> collect2 = collect1.values().stream().collect(Collectors.toList());
        System.out.println(result);


    }

    private static void groupTest2() {

        System.out.println("---------test2 ---------");
        //3 apple, 2 banana, others 1
        List<Item> items = getItems();

        Map<String, Long> counting = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.counting())
        );
        System.out.println("count :" + counting);

//
//        Map<String, Integer> sum = items.stream().collect(
//                Collectors.groupingBy(Item::getName, Collectors.summingInt)
//        );


//        System.out.println("sum :" + sum );

        Map<String, List<Item>> map = items.stream().collect(
                Collectors.groupingBy(Item::getName)
        );

        map.forEach((k, v) -> {
            BigDecimal value = v.stream()
                    .map(e -> "".equals(e.getBusinessType()) ? e.getPrice() : e.getPrice().negate())
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

        });


    }

    private static List<Item> getItems() {
        return Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99"), "TYPE_REFUND"),
                new Item("banana", 20, new BigDecimal("19.99"), "TYPE_ADD"),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
    }

    private static void groupTest1() {
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya", "c");

        Map<String, Long> result = items.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ));
        System.out.println(result);

        Map<String, Long> finalMap = new LinkedHashMap<>();

        result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));


        System.out.println(finalMap);

    }
}
