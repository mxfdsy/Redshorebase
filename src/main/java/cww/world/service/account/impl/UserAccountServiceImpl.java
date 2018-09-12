package cww.world.service.account.impl;

import cww.world.mapper.account.UserAccountMapper;
import cww.world.pojo.po.account.UserAccountPO;
import cww.world.service.account.UserAccountService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


@Service
public class UserAccountServiceImpl  implements UserAccountService {
    private static final Logger logger = LoggerFactory.getLogger(UserAccountServiceImpl.class);
    @Autowired
    private UserAccountMapper userAccountMapper;


    @Override
    public List<UserAccountPO> searchUserAccountByUserUids(List<String> userUids) {
        if (CollectionUtils.isEmpty(userUids)) {
            return Collections.emptyList();
        }
        return userAccountMapper.searchUserAccountByUserUids(userUids);
    }


    @Override
    public UserAccountPO searchUserAccountByUserUid(String userUid) {
        return userAccountMapper.searchUserAccountByUserUid(userUid);
    }

}
