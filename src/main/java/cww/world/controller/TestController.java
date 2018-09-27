package cww.world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 小武 on 2018/9/27.
 */
@Controller("/test")
public class TestController {

    @PostMapping("/diy")
    public String test() {
        return "demo/diy";
    }
}
