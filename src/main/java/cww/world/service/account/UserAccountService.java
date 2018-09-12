package cww.world.service.account;


import cww.world.pojo.po.account.UserAccountPO;

import java.util.List;

public interface UserAccountService {
    List<UserAccountPO> searchUserAccountByUserUids(List<String> userUids);

    UserAccountPO searchUserAccountByUserUid(String userUid);
}
