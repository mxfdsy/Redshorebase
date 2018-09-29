package cww.world.pojo.po.account;

import cww.world.pojo.po.BasePO;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
@Data
public class UserAccountPO extends BasePO {

    private String userUid;

    private String name;

    private String loginName;

    private String password;

    private String phone;

    private String status;

    private String memo;

    private String gender;

    private String email;

    private String wechatNo;

    private String identity;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
