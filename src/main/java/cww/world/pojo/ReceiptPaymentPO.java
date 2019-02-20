package cww.world.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import cww.world.pojo.po.BasePO;

import java.math.BigDecimal;

public class ReceiptPaymentPO extends BasePO {
    private String id;

    private String receiptPaymentUid;

    private String receiptUid;

    private String paymentUid;

    private String paymentName;

    private String status;

    private BigDecimal paymentAmount;


    @JSONField(name = "business_type")
    private String businessType;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiptPaymentUid() {
        return receiptPaymentUid;
    }

    public void setReceiptPaymentUid(String receiptPaymentUid) {
        this.receiptPaymentUid = receiptPaymentUid;
    }

    public String getReceiptUid() {
        return receiptUid;
    }

    public void setReceiptUid(String receiptUid) {
        this.receiptUid = receiptUid;
    }

    public String getPaymentUid() {
        return paymentUid;
    }

    public void setPaymentUid(String paymentUid) {
        this.paymentUid = paymentUid;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}