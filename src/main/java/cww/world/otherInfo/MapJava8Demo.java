package cww.world.otherInfo;


import cww.world.pojo.CreateReturnReceiptDTO;
import cww.world.pojo.ReceiptFeeInfoPO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapJava8Demo {
    public static void main(String[] args) {
        CreateReturnReceiptDTO createReturnReceiptDTO = new CreateReturnReceiptDTO();
        List<ReceiptFeeInfoPO> receiptFeeInfoList = createReturnReceiptDTO.getReceiptFeeInfoList();

        Map<String, BigDecimal> collect4 = receiptFeeInfoList.stream()
                .collect(Collectors.groupingBy(ReceiptFeeInfoPO::getFeeCode, CollectorsUtil.summingBigDecimal(ReceiptFeeInfoPO::getCurrentReceived)));

        //map to list
        List<BigDecimal> collect = collect4.values().stream().collect(Collectors.toList());

        //foreach map
        collect4.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

        //sort map


    }
}
