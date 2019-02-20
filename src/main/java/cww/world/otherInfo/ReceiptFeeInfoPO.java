package cww.world.otherInfo;

import com.alibaba.fastjson.annotation.JSONField;
import cww.world.pojo.po.BasePO;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.Date;

public class ReceiptFeeInfoPO extends BasePO {
    @JSONField(name = "id")
    private String id;

    @JSONField(name = "receipt_uid")
    private String receiptUid;

    @JSONField(name = "receipt_fee_uid")
    private String receiptFeeUid;

    @JSONField(name = "receipt_code")
    private String receiptCode;

    @JSONField(name = "bill_uid")
    private String billUid;

    @JSONField(name = "bill_code")
    private String billCode;

    @JSONField(name = "bill_shop_uid")
    private String billShopUid;

    @JSONField(name = "bill_shop_code")
    private String billShopCode;

    @JSONField(name = "bill_shop_name")
    private String billShopName;


    @JSONField(name = "fee_receivable_amount")
    private BigDecimal feeReceivableAmount;

    @JSONField(name = "fee_payload_amount_received")
    private BigDecimal feePayloadAmountReceived;

    @JSONField(name = "fee_amount_received")
    private BigDecimal feeAmountReceived;

    @JSONField(name = "fee_outstanding_amount")
    private BigDecimal feeOutstandingAmount;

    @JSONField(name = "fee_uid")
    private String feeUid;

    @JSONField(name = "fee_code")
    private String feeCode;

    @JSONField(name = "fee_set_date", format = "yyyy-MM-dd")
    private Date feeSetDate;

    @JSONField(name = "fee_start_at", format = "yyyy-MM-dd")
    private Date feeStartAt;

    @JSONField(name = "fee_end_at", format = "yyyy-MM-dd")
    private Date feeEndAt;

    @JSONField(name = "memo")
    private String feeMemo;

    @JSONField(name = "fee_type_name")
    private String feeTypeName;//费用名称

    @JSONField(name = "fee_property")
    private String feeProperty;

    @JSONField(name = "fee_type_uid")
    private String feeTypeUid;

    @JSONField(name = "invoice_type")
    private String invoiceType;

    @JSONField(name = "contract_code")
    private String contractCode;

    @JSONField(name = "business_type")
    private String businessType;

    @JSONField(name = "vendor_uid")
    private String vendorUid;

    @JSONField(name = "mall_uid")
    private String mallUid;

    @JSONField(name = "erp_vendor_uid")
    private String erpVendorUid;

    @JSONField(name = "current_received")
    private BigDecimal currentReceived;

    @JSONField(name = "pay_order")
    private BigDecimal payOrder;

    @JSONField(name = "is_deposit")
    private int isDeposit;

    @JSONField(name = "is_checked")
    private String isChecked;

    @JSONField(name = "status")
    private String status;

    @JSONField(name = "payment_step")
    private BigDecimal paymentStep;//抵用金额

    @JSONField(name = "bill_set_date", format = "yyyy-MM-dd")
    private Date billSetDate;

    public Date getBillSetDate() {
        return billSetDate;
    }

    public void setBillSetDate(Date billSetDate) {
        this.billSetDate = billSetDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiptUid() {
        return receiptUid;
    }

    public void setReceiptUid(String receiptUid) {
        this.receiptUid = receiptUid;
    }

    public String getReceiptFeeUid() {
        return receiptFeeUid;
    }

    public void setReceiptFeeUid(String receiptFeeUid) {
        this.receiptFeeUid = receiptFeeUid;
    }

    public String getReceiptCode() {
        return receiptCode;
    }

    public void setReceiptCode(String receiptCode) {
        this.receiptCode = receiptCode;
    }

    public String getBillUid() {
        return billUid;
    }

    public void setBillUid(String billUid) {
        this.billUid = billUid;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getBillShopUid() {
        return billShopUid;
    }

    public void setBillShopUid(String billShopUid) {
        this.billShopUid = billShopUid;
    }

    public String getBillShopCode() {
        return billShopCode;
    }

    public void setBillShopCode(String billShopCode) {
        this.billShopCode = billShopCode;
    }

    public String getBillShopName() {
        return billShopName;
    }

    public void setBillShopName(String billShopName) {
        this.billShopName = billShopName;
    }

    public BigDecimal getFeeReceivableAmount() {
        return feeReceivableAmount;
    }

    public void setFeeReceivableAmount(BigDecimal feeReceivableAmount) {
        this.feeReceivableAmount = feeReceivableAmount;
    }

    public BigDecimal getFeePayloadAmountReceived() {
        return feePayloadAmountReceived;
    }

    public void setFeePayloadAmountReceived(BigDecimal feePayloadAmountReceived) {
        this.feePayloadAmountReceived = feePayloadAmountReceived;
    }

    public BigDecimal getFeeAmountReceived() {
        return feeAmountReceived;
    }

    public void setFeeAmountReceived(BigDecimal feeAmountReceived) {
        this.feeAmountReceived = feeAmountReceived;
    }

    public BigDecimal getFeeOutstandingAmount() {
        return feeOutstandingAmount;
    }

    public void setFeeOutstandingAmount(BigDecimal feeOutstandingAmount) {
        this.feeOutstandingAmount = feeOutstandingAmount;
    }

    public String getFeeUid() {
        return feeUid;
    }

    public void setFeeUid(String feeUid) {
        this.feeUid = feeUid;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public Date getFeeSetDate() {
        return feeSetDate;
    }

    public void setFeeSetDate(Date feeSetDate) {
        this.feeSetDate = feeSetDate;
    }

    public Date getFeeStartAt() {
        return feeStartAt;
    }

    public void setFeeStartAt(Date feeStartAt) {
        this.feeStartAt = feeStartAt;
    }

    public Date getFeeEndAt() {
        return feeEndAt;
    }

    public void setFeeEndAt(Date feeEndAt) {
        this.feeEndAt = feeEndAt;
    }

    public String getFeeMemo() {
        return feeMemo;
    }

    public void setFeeMemo(String feeMemo) {
        this.feeMemo = feeMemo;
    }

    public String getFeeTypeName() {
        return feeTypeName;
    }

    public void setFeeTypeName(String feeTypeName) {
        this.feeTypeName = feeTypeName;
    }

    public String getFeeProperty() {
        return feeProperty;
    }

    public void setFeeProperty(String feeProperty) {
        this.feeProperty = feeProperty;
    }

    public String getFeeTypeUid() {
        return feeTypeUid;
    }

    public void setFeeTypeUid(String feeTypeUid) {
        this.feeTypeUid = feeTypeUid;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getVendorUid() {
        return vendorUid;
    }

    public void setVendorUid(String vendorUid) {
        this.vendorUid = vendorUid;
    }

    public String getMallUid() {
        return mallUid;
    }

    public void setMallUid(String mallUid) {
        this.mallUid = mallUid;
    }

    public String getErpVendorUid() {
        return erpVendorUid;
    }

    public void setErpVendorUid(String erpVendorUid) {
        this.erpVendorUid = erpVendorUid;
    }

    public BigDecimal getCurrentReceived() {
        return currentReceived;
    }

    public void setCurrentReceived(BigDecimal currentReceived) {
        this.currentReceived = currentReceived;
    }

    public BigDecimal getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(BigDecimal payOrder) {
        this.payOrder = payOrder;
    }

    public int getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(int isDeposit) {
        this.isDeposit = isDeposit;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getPaymentStep() {
        return paymentStep;
    }

    public void setPaymentStep(BigDecimal paymentStep) {
        this.paymentStep = paymentStep;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}