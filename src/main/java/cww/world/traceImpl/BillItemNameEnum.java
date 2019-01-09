package cww.world.traceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @date: 2018/9/12 13:31
 * @description:
 */
public enum BillItemNameEnum {
    amountReceived("amountReceived","账单已收金额"),
    receivableAmount("receivableAmount","账单应收金额"),
    outstandingAmount("outstandingAmount","账单未收金额"),
    paymentStatus("paymentStatus","账单付款状态"),
    billStatus("billStatus","账单账单状态"),
    billSetDate("billSetDate","账单立账日期"),
    memo("memo","账单摘要"),
    unknow("unknow","未知字段"),

    FEE("FEE", "费用单"),

    FEE_startAt("FEE_startAt", "费用单的开始日期"),
    FEE_endAt("FEE_endAt", "费用单的结束日期"),
    FEE_expenses("FEE_expenses", "费用单的费用金额"),
    FEE_amountReceived("FEE_amountReceived", "费用单的已收金额"),
    FEE_outstandingAmount("FEE_outstandingAmount", "费用单的未收金额"),
    FEE_feeSetDate("FEE_feeSetDate", "费用单的立账日期"),
    FEE_feeType("FEE_feeType", "费用单的费用类型"),
    FEE_feePayType("FEE_feePayType", "费用单的收费性质"),
    FEE_memo("FEE_memo", "费用单的摘要");


    private String key;
    private String itemName;

    BillItemNameEnum(String key, String itemName) {
        this.key = key;
        this.itemName = itemName;
    }

    public static BillItemNameEnum valueOfKeyStr(String keyStr) {
        try {
            BillItemNameEnum ec = values.get(keyStr);
            if (ec != null) {
                return ec;
            }
            return unknow;
        } catch (Exception e) {
            return unknow;
        }

    }

    private static final Map<String, BillItemNameEnum> values = new HashMap<String, BillItemNameEnum>();

    static {
        for (BillItemNameEnum ec : BillItemNameEnum.values()) {
            values.put(ec.key, ec);
        }
    }

    public String getKey() {
        return key;
    }

    public String getItemName() {
        return itemName;
    }





}
