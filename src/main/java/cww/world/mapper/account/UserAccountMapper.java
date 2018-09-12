package cww.world.mapper.account;

import cww.world.pojo.po.account.UserAccountPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserAccountMapper {

    List<UserAccountPO> searchUserAccountByUserUids(@Param("userUids") List<String> userUids);

    UserAccountPO searchUserAccountByUserUid(@Param("userUid")String userUid);
}
