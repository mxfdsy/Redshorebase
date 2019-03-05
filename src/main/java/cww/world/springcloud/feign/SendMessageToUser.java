package cww.world.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value ="feign-user")
public interface SendMessageToUser {

    @RequestMapping("/getUserInfo")
    String getUserInfo();
}
