package cww.world.handler;

import org.springframework.stereotype.Component;

/**
 * @author 小武 on 2018/9/6.
 */
@Component("testHandler")
public class TestHandler {
    public void testDirect(String payload) {
        System.out.println("testDirect收到:payload");
    }

    public void testFanout1(String payload) {
        System.out.println("testFanout1收到:payload" + payload);
    }

    public void testFanout2(String payload) {
        System.out.println("testFanout2收到:payload" + payload);
    }
}
