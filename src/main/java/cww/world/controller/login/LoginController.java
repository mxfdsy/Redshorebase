package cww.world.controller.login;


import com.alibaba.fastjson.JSONObject;
import cww.world.common.constant.BaseCode;
import cww.world.common.exception.BaseException;
import cww.world.common.validate.EntityValidator;
import cww.world.common.validate.ValidateResult;
import cww.world.common.validate.group.Insert;
import cww.world.pojo.po.account.UserAccountPO;
import cww.world.pojo.po.user.UserPO;
import cww.world.service.user.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 小武 on 2018/8/16.
 */
@Controller
@RequestMapping("/login")
@Log4j
public class LoginController {
    protected static final String JSON_UTF8 = "application/json;charset=UTF-8";

    @Autowired
    UserService userService;


    @ApiOperation(value="用戶登陆校验",notes = "用戶登陆校验",httpMethod = "POST")
    @ApiImplicitParam(name = "payload",value = "用户登陆信息",required = true,dataType = "String")
    @RequestMapping(value = "/check" , method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String check(@RequestBody String payload, HttpServletRequest request) {
        String field = JSONObject.parseObject(payload).getString("field");
        UserPO loginUser = JSONObject.parseObject(field, UserPO.class);
        ValidateResult validateResult = EntityValidator.validate(request, Insert.class);
        if (validateResult.hasError()) {
            throw new BaseException(BaseCode.INVALID_ARGUMENT,validateResult.getErrorMessages());
        }

        return  userService.login(loginUser, request);
    }


    @RequestMapping("/index")
    public String index(Model model) throws Exception {
        return "/login/index2";
    }

    @RequestMapping("/user")
    public String userIndex(Model model) throws Exception {
        return "/user/list2";
    }




    @RequestMapping("/login")
    public String login(Model model) throws Exception {
        return "/login/login";
    }
}
