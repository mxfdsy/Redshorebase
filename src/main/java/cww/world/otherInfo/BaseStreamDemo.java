package cww.world.otherInfo;

import cww.world.common.constant.BaseCode;
import cww.world.common.exception.BaseException;
import cww.world.pojo.CreateReturnReceiptDTO;
import cww.world.pojo.ReceiptFeeInfoPO;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseStreamDemo {
    public static void main(String[] args) {
        //base stream
        CreateReturnReceiptDTO createReturnReceiptDTO = new CreateReturnReceiptDTO();
        Stream.of(createReturnReceiptDTO)
                .map(CreateReturnReceiptDTO::getReceiptFeeInfoList)
                .flatMap(List::stream)
                .filter(Objects::nonNull)
                .max(Comparator.comparing(ReceiptFeeInfoPO::getPaymentStep))
//                .ifPresent(receiptFeeInfoPO -> receiptFeeInfoPO.setBillCode("xxx"));
//                .orElse(new ReceiptFeeInfoPO());
//                .orElseGet()
                .orElseThrow(() -> new BaseException(BaseCode.DATE_ERROR, ""));


        createReturnReceiptDTO.getReceiptFeeInfoList().stream().collect(Collectors.collectingAndThen(
                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(ReceiptFeeInfoPO::getFeeUid))), ArrayList::new));
    }


}
