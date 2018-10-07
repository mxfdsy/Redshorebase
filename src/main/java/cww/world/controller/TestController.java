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

//
//    @Autowired
//    @Qualifier(value = "async_message_channel")
//    private MessageChannel testMessageChannel;
//
//    @Autowired
//    @Qualifier(value = "async_message_fanout_channel")
//    private MessageChannel testMessageChanne2;


    /**
     *  rabbitmq 自产自销 消息发送(异步q)
     * @return
     */
//    @PostMapping("/sendDirectMessage")
//    @ResponseBody
//    public  String sendDirect() {
//        testMessageChannel.send(MessageBuilder.withPayload("sendDirectMessage").build());
//        return ResultBuilderUtils.buildSuccess(Constants.SUCCESS);
//    }
//
//    @PostMapping("/sendFanoutMessage")
//    @ResponseBody
//    public  String sendFanout() {
//        testMessageChanne2.send(MessageBuilder.withPayload("sendFanoutMessage:").build());
//        return ResultBuilderUtils.buildSuccess(Constants.SUCCESS);
//    }

    /**
     * thymeleaf 自定以方言
     * @return
     */
    @PostMapping("/diy")
    public String test() {
        return "demo/diy";
    }

}
