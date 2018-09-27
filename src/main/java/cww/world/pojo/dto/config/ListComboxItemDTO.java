package cww.world.pojo.dto.config;

import com.alibaba.fastjson.annotation.JSONField;
import cww.world.pojo.dto.PageableRequestDTO;

public class ListComboxItemDTO extends PageableRequestDTO {

    @JSONField(name = "type")
    private String type;

    @JSONField(name = "text")
    private String text;

    @JSONField(name = "combox_item_uid")
    private String comboxItemUid;

    public ListComboxItemDTO() {
    }

    public ListComboxItemDTO(String type, String text) {
        this.type = type;
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComboxItemUid() {
        return comboxItemUid;
    }

    public void setComboxItemUid(String comboxItemUid) {
        this.comboxItemUid = comboxItemUid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListComboxItemDTO{");
        sb.append("type='").append(type).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", comboxItemUid='").append(comboxItemUid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
