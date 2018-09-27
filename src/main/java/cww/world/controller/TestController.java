package cww.world.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小武 on 2018/9/27.
 */
@RestController
public class TestController {
    @PostMapping("/test")
    public String test() {
        return "/demo/test";
    }
}
