package cww.world.pojo.dto.user;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import cww.world.pojo.dto.PageableRequestDTO;

/**
 * @author 小武 on 2018/8/24.
 */
public class ListUserDTO extends PageableRequestDTO {

    @JSONField(name = "loginName")
    private String loginName;

    @JSONField(name = "userName")
    private String userName;

    @JSONField(name = "phone")
    private String phone;

    @JSONField(name = "status")
    private String status;

    @JSONField(name = "gender")
    private String gender;

    @JSONField(name = "email")
    private String email;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return  JSON.toJSONString(this);
    }
}
