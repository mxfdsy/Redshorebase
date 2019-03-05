package cww.world.springcloud.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReceiveFeignMessage {

    @RequestMapping("/helloRedFeign")
    public String getHello() {
        return "hello red feign";
    }

    @RequestMapping("/helloRedFeignUser")
    public List<User> getRedFeignUser() {
        ArrayList<User> objects = new ArrayList<>();
        User user = new User();
        user.setAge(18);
        user.setName("cww");

        User user2 = new User();
        user2.setAge(17);
        user2.setName("ccc");

        objects.add(user);
        objects.add(user2);
        return objects;
    }


}
