package cww.world.otherInfo;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.time.DateUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {

        List<ReceiptFeeInfoPO> objects = new ArrayList<>();

        ReceiptFeeInfoPO receiptFeeInfoPO = new ReceiptFeeInfoPO();
        receiptFeeInfoPO.setPayOrder(BigDecimal.ONE);
        receiptFeeInfoPO.setBillSetDate(DateUtils.addDays(new Date(), -3));

        ReceiptFeeInfoPO receiptFeeInfoPO1 = new ReceiptFeeInfoPO();
        receiptFeeInfoPO1.setPayOrder(BigDecimal.TEN);

        ReceiptFeeInfoPO receiptFeeInfoPO4 = new ReceiptFeeInfoPO();
        receiptFeeInfoPO4.setPayOrder(BigDecimal.TEN.add(BigDecimal.ONE));

        ReceiptFeeInfoPO receiptFeeInfoPO2 = new ReceiptFeeInfoPO();
        receiptFeeInfoPO2.setPayOrder(BigDecimal.ONE);
        receiptFeeInfoPO2.setBillSetDate(new Date());
        receiptFeeInfoPO2.setFeeOutstandingAmount(BigDecimal.ONE);

        ReceiptFeeInfoPO receiptFeeInfoPO3 = new ReceiptFeeInfoPO();
        receiptFeeInfoPO3.setPayOrder(BigDecimal.ONE);
        receiptFeeInfoPO3.setBillSetDate(new Date());
        receiptFeeInfoPO3.setFeeOutstandingAmount(BigDecimal.ZERO);


        objects.add(receiptFeeInfoPO3);
        objects.add(receiptFeeInfoPO);
        objects.add(receiptFeeInfoPO1);
        objects.add(receiptFeeInfoPO2);
        objects.add(receiptFeeInfoPO4);


        System.out.println(JSON.toJSONString(objects));

        objects.sort(Comparator.comparing(ReceiptFeeInfoPO::getPayOrder).reversed()
                .thenComparing(ReceiptFeeInfoPO::getBillSetDate)
                .thenComparing(ReceiptFeeInfoPO::getFeeOutstandingAmount));

        System.out.println(JSON.toJSONString(objects));


    }
}
