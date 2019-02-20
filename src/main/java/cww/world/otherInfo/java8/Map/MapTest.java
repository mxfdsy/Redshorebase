package cww.world.otherInfo.java8.Map;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, "val" + i);
        }

        map.forEach((id, val) -> {
            if (val.equals("val1")) {
                System.out.println("第一个");
            }
        });


        map.computeIfPresent(555, (num, val) -> val + "555");
        map.remove(3);
        map.merge(3, "vww", (value, newValue) -> value.concat(newValue));

        map.forEach((id, val) -> {
            System.out.println(val);
        });


    }
}
