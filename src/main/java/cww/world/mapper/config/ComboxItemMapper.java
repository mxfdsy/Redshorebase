package cww.world.mapper.config;

import cww.world.pojo.dto.config.ListComboxItemDTO;
import cww.world.pojo.po.config.ComboxItemPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ComboxItemMapper {

    int createComboxItem(ComboxItemPO comboxItemPO);

    int batchCreateComboxItem(List<ComboxItemPO> comboxItemPOList);

    int deleteComboxItem(@Param("comboxItemUid") String comboxItemUid);

    int updateComboxItem(ComboxItemPO comboxItemPO);

    int updateComboxItemFlag(ComboxItemPO comboxItemPO);

    ComboxItemPO getComboxItemByUid(@Param("comboxItemUid") String comboxItemUid);

    ComboxItemPO getComboxItemByTypeText(@Param("type") String type, @Param("text") String text);

    List<ComboxItemPO> listActiveComboxItemByType(@Param("type") String type);

    List<ComboxItemPO> listComboxItem(ListComboxItemDTO listComboxItemDTO);

    int countComboxItem(ListComboxItemDTO listComboxItemDTO);

    String getComboxItemValueByTypeAndUid(@Param("type") String type, @Param("uid") String uid);
}
