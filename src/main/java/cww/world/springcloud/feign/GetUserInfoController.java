//package cww.world.springcloud.feign;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class GetUserInfoController {
//
//    @Autowired
//    private GetInfoFromUserServer getInfoFromUserServer;
//
//    @RequestMapping("/getUserInfoFromUser")
//    public String getUserInfoFromUser() {
//        String userInfo = getInfoFromUserServer.getUserInfo();
//        return userInfo;
//    }
//}
