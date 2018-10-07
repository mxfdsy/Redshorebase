package cww.world.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import cww.world.common.constant.BaseCode;
import cww.world.common.constant.Constants;
import cww.world.common.exception.BaseException;
import cww.world.common.util.ResultBuilderUtils;
import cww.world.common.validate.EntityValidator;
import cww.world.common.validate.ValidateResult;
import cww.world.common.validate.group.Insert;
import cww.world.pojo.po.account.UserAccountPO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/Demo")
public class Demo {
    private static final Logger logger = LoggerFactory.getLogger(Demo.class);

    @RequestMapping(value = "/demo", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String test(@RequestBody String payload) {
        logger.info("test请求，入参：{}", payload);
        UserAccountPO userAccountPO = JSONObject.parseObject(payload, UserAccountPO.class);
        ValidateResult validateResult = EntityValidator.validate(userAccountPO, Insert.class);
        if (validateResult.hasError()) {
            logger.error("validateResult请求入参错误，入参：{}", JSON.toJSONString(userAccountPO));
            throw new BaseException(BaseCode.INVALID_ARGUMENT, validateResult.getErrorMessages());
        }

        return ResultBuilderUtils.buildSuccess(Constants.SUCCESS);
    }
}
