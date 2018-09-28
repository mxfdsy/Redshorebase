package cww.world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 小武 on 2018/9/27.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @PostMapping("/diy")
    public String test() {
        return "demo/diy";
    }
}
