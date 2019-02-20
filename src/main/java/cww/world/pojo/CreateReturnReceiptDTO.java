package cww.world.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import cww.world.pojo.dto.BaseDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CreateReturnReceiptDTO extends BaseDTO {
    @JSONField(name = "return_uid")
    private String returnUid;

    @JSONField(name = "return_code")
    private String returnCode;

    @JSONField(name = "program_name")
    private String programName;

    @JSONField(name = "mall_uid")
    private String mallUid;

    @JSONField(name = "vendor_code")
    private String vendorCode;

    @JSONField(name = "vendor_name")
    private String vendorName;
    //开始日期
    @JSONField(name = "start_at", format = "yyyy-MM-dd")
    private Date startAt;
    //结束日期
    @JSONField(name = "end_at", format = "yyyy-MM-dd")
    private Date endAt;

    //返款日期
    @JSONField(name = "return_date", format = "yyyy-MM-dd")
    private Date returnDate;

    //返款金额
    @JSONField(name = "return_amount")
    private BigDecimal returnAmount;

    //欠款总额
    @JSONField(name = "vendor_debts")
    private BigDecimal vendorDebts;


    @JSONField(name = "fee_receivable_amount")
    private BigDecimal feeReceivableAmount;


    @JSONField(name = "fee_amount_received")
    private BigDecimal feeAmountReceived;

    //未收总额
    @JSONField(name = "fee_outstanding_amount")
    private BigDecimal feeOutstandingAmount;

    //本次抵扣总额
    @JSONField(name = "fee_total_current_received_amount")
    BigDecimal feeTotalCurrentReceivedAmount;

    //交易总额
    @JSONField(name = "order_total_amount")
    private BigDecimal orderTotalAmount;

    //手续费
    @JSONField(name = "order_total_service_amount")
    private BigDecimal orderTotalServiceAmount;

    //代收总额
    @JSONField(name = "order_total_collection_amount")
    private BigDecimal orderTotalCollectionAmount;

    @JSONField(name = "create_type")
    String createType;

    @JSONField(name = "business_type")
    private String businessType;

    @JSONField(name = "vendor_uid_list")
    private List<String> vendorUidList;

    @JSONField(name = "vendor_uid")
    private String vendorUid;

    @JSONField(name = "bank_name")
    private String bankName;

    @JSONField(name = "bank_account")
    private String bankAccount;

    @JSONField(name = "bank_account_name")
    private String bankAccountName;


    @JSONField(name = "return_status")
    private String returnStatus;

    @JSONField(name = "payment_status")
    private String paymentStatus;

    //立账日期
    @JSONField(name = "set_date", format = "yyyy-MM-dd")
    private Date setDate;

    @JSONField(name = "shop_uid_list")
    private List<String> shopUidList = new ArrayList<>();

    @JSONField(name = "receipt_fee_info_list")
    private List<ReceiptFeeInfoPO> receiptFeeInfoList = new ArrayList<>();

    @JSONField(name = "return_receipt_order_list")
    private List<ReturnReceiptOrderPO> returnReceiptOrderList = new ArrayList<>();

    @JSONField(name = "shop_name")
    private String shopName;

    @JSONField(name = "shop_code")
    private String shopCode;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public BigDecimal getFeeTotalCurrentReceivedAmount() {
        return feeTotalCurrentReceivedAmount;
    }

    public void setFeeTotalCurrentReceivedAmount(BigDecimal feeTotalCurrentReceivedAmount) {
        this.feeTotalCurrentReceivedAmount = feeTotalCurrentReceivedAmount;
    }

    public String getReturnUid() {
        return returnUid;
    }

    public void setReturnUid(String returnUid) {
        this.returnUid = returnUid;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getMallUid() {
        return mallUid;
    }

    public void setMallUid(String mallUid) {
        this.mallUid = mallUid;
    }

    public String getVendorUid() {
        return vendorUid;
    }

    public void setVendorUid(String vendorUid) {
        this.vendorUid = vendorUid;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }


    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public BigDecimal getVendorDebts() {
        return vendorDebts;
    }

    public void setVendorDebts(BigDecimal vendorDebts) {
        this.vendorDebts = vendorDebts;
    }

    public BigDecimal getFeeReceivableAmount() {
        return feeReceivableAmount;
    }

    public void setFeeReceivableAmount(BigDecimal feeReceivableAmount) {
        this.feeReceivableAmount = feeReceivableAmount;
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

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setFeeOutstandingAmount(BigDecimal feeOutstandingAmount) {
        this.feeOutstandingAmount = feeOutstandingAmount;
    }

    public BigDecimal getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public void setOrderTotalAmount(BigDecimal orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    public BigDecimal getOrderTotalServiceAmount() {
        return orderTotalServiceAmount;
    }

    public void setOrderTotalServiceAmount(BigDecimal orderTotalServiceAmount) {
        this.orderTotalServiceAmount = orderTotalServiceAmount;
    }

    public BigDecimal getOrderTotalCollectionAmount() {
        return orderTotalCollectionAmount;
    }

    public void setOrderTotalCollectionAmount(BigDecimal orderTotalCollectionAmount) {
        this.orderTotalCollectionAmount = orderTotalCollectionAmount;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public List<ReceiptFeeInfoPO> getReceiptFeeInfoList() {
        return receiptFeeInfoList;
    }

    public void setReceiptFeeInfoList(List<ReceiptFeeInfoPO> receiptFeeInfoList) {
        this.receiptFeeInfoList = receiptFeeInfoList;
    }

    public List<ReturnReceiptOrderPO> getReturnReceiptOrderList() {
        return returnReceiptOrderList;
    }

    public void setReturnReceiptOrderList(List<ReturnReceiptOrderPO> returnReceiptOrderList) {
        this.returnReceiptOrderList = returnReceiptOrderList;
    }

    public List<String> getVendorUidList() {
        return vendorUidList;
    }

    public void setVendorUidList(List<String> vendorUidList) {
        this.vendorUidList = vendorUidList;
    }

    public List<String> getShopUidList() {
        return shopUidList;
    }

    public void setShopUidList(List<String> shopUidList) {
        this.shopUidList = shopUidList;
    }
}
