package cww.world.java8.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static void main(String[] args) {
        //Uses java.util.TreeMap, it will sort the Map by keys automatically.
        test01();

        //Yet another java.util.TreeMap example, provide a custom Comparator to sort the key in descending order.
        test02();
    }

    private static void test02() {

        System.out.println("test02");

        Map<Integer, String> unsortMap = new HashMap<Integer, String>();
        unsortMap.put(10, "z");
        unsortMap.put(5, "b");
        unsortMap.put(6, "a");
        unsortMap.put(20, "c");
        unsortMap.put(1, "d");
        unsortMap.put(7, "e");
        unsortMap.put(8, "y");
        unsortMap.put(99, "n");
        unsortMap.put(50, "j");
        unsortMap.put(2, "m");
        unsortMap.put(9, "f");

        System.out.println("Unsort Map......");
        printMap(unsortMap);

        Map<Integer, String> treeMap = new TreeMap<>(
                (Comparator<Integer>) (o1, o2) -> o2.compareTo(o1)
        );

        treeMap.putAll(unsortMap);


    }

    private static void test01() {

        HashMap<String, String> unsortMap = new HashMap<>();
        unsortMap.put("Z", "z");
        unsortMap.put("B", "b");
        unsortMap.put("A", "a");
        unsortMap.put("C", "c");
        unsortMap.put("D", "d");
        unsortMap.put("E", "e");
        unsortMap.put("Y", "y");
        unsortMap.put("N", "n");
        unsortMap.put("J", "j");
        unsortMap.put("M", "m");
        unsortMap.put("F", "f");

        System.out.println("Unsort MapTest......");
        printMap(unsortMap);

        System.out.println("\nSorted MapTest......By Key");
        TreeMap<String, String> treeMap = new TreeMap<>(unsortMap);
        printMap(treeMap);
    }

    //pretty print a map
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }
}
