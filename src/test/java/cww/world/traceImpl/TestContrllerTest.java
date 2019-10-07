package cww.world.traceImpl;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestContrllerTest {

    @Test
    public void test1() {

        String list = "1,2,3,4";
        String[] split = list.split(",");
        int length = split.length;
        List<String> strings = Arrays.asList(split);

        List<String> strings1 = strings.subList(0,2);

        System.out.println(strings1);

    }


    @Test
    public void test2() {

        String s = String.valueOf((Math.random() * 9 + 1) * 100000).substring(0,6);
        System.out.println(s);


    }
}