package cww.world.otherInfo;

import cww.world.pojo.CreateReturnReceiptDTO;
import cww.world.pojo.ReceiptFeeInfoPO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumStreamDemo {
    public static void main(String[] args) {
        CreateReturnReceiptDTO createReturnReceiptDTO = new CreateReturnReceiptDTO();
        List<ReceiptFeeInfoPO> receiptFeeInfoList = createReturnReceiptDTO.getReceiptFeeInfoList();
        //baseSum
        BigDecimal reduce = createReturnReceiptDTO.getReceiptFeeInfoList()
                .stream()
                .map(receiptFeeInfoPO ->
                        "add".equals(receiptFeeInfoPO.getBusinessType()) ? receiptFeeInfoPO.getCurrentReceived() : receiptFeeInfoPO.getCurrentReceived().negate())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        //------------------
        createReturnReceiptDTO.getReceiptFeeInfoList()
                .stream()
                .reduce((o1, o2) -> {
                    ReceiptFeeInfoPO receiptFeeInfoPO = new ReceiptFeeInfoPO();
                    receiptFeeInfoPO.setCurrentReceived(o1.getCurrentReceived().add(o2.getCurrentReceived()));
                    return receiptFeeInfoPO;
                }).ifPresent(receiptFeeInfoPO -> {
            ReceiptFeeInfoPO receiptFeeInfoPO1 = new ReceiptFeeInfoPO();
            receiptFeeInfoPO1.setCurrentReceived(receiptFeeInfoPO1.getCurrentReceived());
        });

        //groupBySum
        createReturnReceiptDTO.getReceiptFeeInfoList().stream()
                .collect(Collectors.groupingBy(ReceiptFeeInfoPO::getFeeUid,
                        CollectorsUtil.summingBigDecimal(ReceiptFeeInfoPO::getCurrentReceived)));


        Map<String, BigDecimal> collect4 = receiptFeeInfoList.stream()
                .collect(Collectors.groupingBy(ReceiptFeeInfoPO::getFeeCode, CollectorsUtil.summingBigDecimal(ReceiptFeeInfoPO::getCurrentReceived)));

        Map<String, Integer> collect5 = receiptFeeInfoList.stream()
                .collect(Collectors.groupingBy(ReceiptFeeInfoPO::getFeeCode, Collectors.summingInt(ReceiptFeeInfoPO::getIsDeposit)));

    }
}
