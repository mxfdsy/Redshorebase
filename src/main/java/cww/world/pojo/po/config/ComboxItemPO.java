package cww.world.pojo.po.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import cww.world.common.validate.group.Insert;
import cww.world.pojo.po.BasePO;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @Descriptions: 所有下拉菜单统一在一张表中管理
 * @Author: daijl
 * @Date : 2018-06-13 14:46
 */
public class ComboxItemPO extends BasePO {

    @JSONField(name = "text")
    private String text;

    @JSONField(name = "memo")
    private String memo;

    @NotBlank(message="缺少下拉type", groups={Insert.class})
    @JSONField(name = "type")
    private String type;

    @JSONField(name = "flag")
    private String flag;

    @JSONField(name = "sort_order")
    private Integer sortOrder;

    @JSONField(name = "combox_item_uid")
    private String comboxItemUid;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getComboxItemUid() {
        return comboxItemUid;
    }

    public void setComboxItemUid(String comboxItemUid) {
        this.comboxItemUid = comboxItemUid;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
