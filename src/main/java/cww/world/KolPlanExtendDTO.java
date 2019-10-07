package cww.world;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author tab
 * @date 2019-03-26 17:40
 */
@Getter
@Setter
@ToString
public class KolPlanExtendDTO {

    @JSONField(name = "valuation_model_type")
    private String valuationModelType;

    @JSONField(name = "base_price")
    private BigDecimal basePrice;

    @JSONField(name = "promotion_product_list")
    private List<PromotionProductInfoDTO> promotionProductList;


    public String getValuationModelType() {
        return valuationModelType;
    }

    public void setValuationModelType(String valuationModelType) {
        this.valuationModelType = valuationModelType;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public List<PromotionProductInfoDTO> getPromotionProductList() {
        return promotionProductList;
    }

    public void setPromotionProductList(List<PromotionProductInfoDTO> promotionProductList) {
        this.promotionProductList = promotionProductList;
    }
}