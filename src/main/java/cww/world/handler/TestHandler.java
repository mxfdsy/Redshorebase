package cww.world.handler;

import org.springframework.stereotype.Component;

/**
 * @author 小武 on 2018/9/6.
 */
@Component
public class TestHandler {
    public void test(String payload) {
        System.out.println(payload+"给老子起来");
    }
}
