package cww.world;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@Getter
@Setter
@ToString
public class PromotionProductInfoDTO {

    @NotBlank(message = "promotion_product_uid 不能为空")
    @JSONField(name = "promotion_product_uid")
    private String promotionProductUid;

    @JSONField(name = "product_name")
    private String productName;

    @JSONField(name = "product_image")
    private String productImage;

    @JSONField(name = "status")
    private String status;

    @JSONField(name = "logistics_company")
    private String logisticsCompany;

    @JSONField(name = "logistics_no")
    private String logisticsNo;


    public String getPromotionProductUid() {
        return promotionProductUid;
    }

    public void setPromotionProductUid(String promotionProductUid) {
        this.promotionProductUid = promotionProductUid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }
}