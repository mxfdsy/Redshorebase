package cww.world.otherInfo;

import cww.world.pojo.CreateReturnReceiptDTO;
import cww.world.pojo.ReceiptFeeInfoPO;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByStreamDemo {
    public static void main(String[] args) {
        //
        CreateReturnReceiptDTO createReturnReceiptDTO = new CreateReturnReceiptDTO();
        List<ReceiptFeeInfoPO> receiptFeeInfoList = createReturnReceiptDTO.getReceiptFeeInfoList();
        //groupingBy
        Map<String, List<ReceiptFeeInfoPO>> collect = receiptFeeInfoList.stream()
                .collect(Collectors.groupingBy(n -> n.getFeeCode().substring(0, 1)));


        Map<String, List<ReceiptFeeInfoPO>> collect3 = receiptFeeInfoList.stream()
                .collect(Collectors.groupingBy(ReceiptFeeInfoPO::getBillCode));

        // groupingBy-mapping
        receiptFeeInfoList.stream().collect(
                Collectors.groupingBy(ReceiptFeeInfoPO::getCurrentReceived,
                        Collectors.mapping(ReceiptFeeInfoPO::getBillShopName, Collectors.toSet()))
        );


        // toMap
        Map<String, ReceiptFeeInfoPO> collect1 = receiptFeeInfoList.stream().collect(Collectors.toMap(ReceiptFeeInfoPO::getFeeUid, Function.identity()));
        Map<String, String> collect2 = receiptFeeInfoList.stream().collect(Collectors.toMap(ReceiptFeeInfoPO::getFeeUid, x -> x.getFeeCode()));


    }
}
