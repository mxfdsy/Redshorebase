package cww.world;

import java.util.HashSet;
import java.util.Set;

public class Goods {
    private long goodsId;

    private Set<Long> userIdList = new HashSet<>();

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public Set<Long> getUserIdList() {

        return userIdList;
    }

    public void setUserIdList(Set<Long> userIdList) {
        this.userIdList = userIdList;
    }
}
