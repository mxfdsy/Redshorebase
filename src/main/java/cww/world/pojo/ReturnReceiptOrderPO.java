package cww.world.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import cww.world.pojo.po.BasePO;

import java.math.BigDecimal;
import java.util.Date;

public class ReturnReceiptOrderPO extends BasePO {
    @JSONField(name = "return_order_uid")
    private String returnOrderUid;

    @JSONField(name = "return_uid")
    private String returnUid;

    @JSONField(name = "order_at", format = "yyyy-MM-dd")
    private Date orderAt;

    @JSONField(name = "order_no")
    private String orderNo;

    @JSONField(name = "shop_code")
    private String shopCode;

    @JSONField(name = "shop_name")
    private String shopName;

    @JSONField(name = "total_amount")
    private BigDecimal totalAmount;

    @JSONField(name = "service_amount")
    private BigDecimal serviceAmount;

    @JSONField(name = "collection_amount")
    private BigDecimal collectionAmount;

    @JSONField(name = "ec_sales_uid")
    private String ecSalesUid;

    @JSONField(name = "sale_uid")
    private String saleUid;

    @JSONField(name = "batch_pay_no")
    private String batchPayNo;

    @JSONField(name = "pay_at", format = "yyyy-MM-dd")
    private Date payAt;

    @JSONField(name = "mall_shop_uid")
    private String mallShopUid;

    @JSONField(name = "erp_shop_uid")
    private String erpShopUid;

    @JSONField(name = "vendor_uid")
    private String vendorUid;

    @JSONField(name = "erp_vendor_uid")
    private String erpVendorUid;

    @JSONField(name = "business_uid")
    private String businessUid;

    @JSONField(name = "business_type")
    private String businessType;

    @JSONField(name = "is_checked")
    private String isChecked;

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    public String getEcSalesUid() {
        return ecSalesUid;
    }

    public void setEcSalesUid(String ecSalesUid) {
        this.ecSalesUid = ecSalesUid;
    }

    public String getSaleUid() {
        return saleUid;
    }

    public void setSaleUid(String saleUid) {
        this.saleUid = saleUid;
    }

    public String getBatchPayNo() {
        return batchPayNo;
    }

    public void setBatchPayNo(String batchPayNo) {
        this.batchPayNo = batchPayNo;
    }

    public Date getPayAt() {
        return payAt;
    }

    public void setPayAt(Date payAt) {
        this.payAt = payAt;
    }

    public String getErpShopUid() {
        return erpShopUid;
    }

    public void setErpShopUid(String erpShopUid) {
        this.erpShopUid = erpShopUid;
    }

    public String getMallShopUid() {
        return mallShopUid;
    }

    public void setMallShopUid(String mallShopUid) {
        this.mallShopUid = mallShopUid;
    }

    public String getErpVendorUid() {
        return erpVendorUid;
    }

    public void setErpVendorUid(String erpVendorUid) {
        this.erpVendorUid = erpVendorUid;
    }


    public String getVendorUid() {
        return vendorUid;
    }

    public void setVendorUid(String vendorUid) {
        this.vendorUid = vendorUid;
    }

    public String getReturnOrderUid() {
        return returnOrderUid;
    }

    public void setReturnOrderUid(String returnOrderUid) {
        this.returnOrderUid = returnOrderUid;
    }

    public String getReturnUid() {
        return returnUid;
    }

    public void setReturnUid(String returnUid) {
        this.returnUid = returnUid;
    }

    public Date getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(Date orderAt) {
        this.orderAt = orderAt;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(BigDecimal serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public BigDecimal getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(BigDecimal collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    public String getBusinessUid() {
        return businessUid;
    }

    public void setBusinessUid(String businessUid) {
        this.businessUid = businessUid;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}