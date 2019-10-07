package cww.world;

import cww.world.java8.po.Father;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        BatchUpdatSetDateDTO batchUpdatSetDateDTO = new BatchUpdatSetDateDTO();
////        ReceiptInfoDTO receiptInfoDTO = new ReceiptInfoDTO();
////        System.out.println(JSON.toJSONString(batchUpdatSetDateDTO, SerializerFeature.WriteNullStringAsEmpty));
////        System.out.println(JSON.toJSONString(receiptInfoDTO, SerializerFeature.WriteNullStringAsEmpty));
//        BigDecimal v1 = new BigDecimal("-333");
//        BigDecimal v2 = new BigDecimal("-33");
//        System.out.println(v2.negate());
//        System.out.println(v1.subtract(v2));
//        System.out.println(new Date().getTime());
//
//        MyInterface myInterface = new MyInterface() {
//            @Override
//            public int sum(int num1, int num2) {
//                return num1 + num2;
//            }
//        };
//
//        System.out.println(myInterface.sum(1, 3));
//
//        Father father1 = new Father();
//
//        Son son1 = new Son();
//
//        MyInterface m2 = (sum1, sum2) -> (sum1 + sum2);
//
//
//        Test test = (Test<Son>) son -> son.setAge(55);
//        test.setAge(son1);

        List<Father> list = new ArrayList<>();
        list.addAll(null);
        KolPlanExtendDTO kolPlanExtendDTO = new KolPlanExtendDTO();

        List<KolPlanExtendDTO> kolPlanExtendList1 = Arrays.asList(kolPlanExtendDTO);
        kolPlanExtendList1.stream().flatMap(n -> n.getPromotionProductList().stream()).map(PromotionProductInfoDTO::getPromotionProductUid).collect(Collectors.toList());

        List<KolPlanExtendDTO> kolPlanExtendList2 = Arrays.asList(kolPlanExtendDTO);

        kolPlanExtendList1.stream().map(product1 ->
                kolPlanExtendList2.stream().filter(product2 -> product2.getBasePrice().equals(product1.getBasePrice()))
                        .findFirst().map(findproduct -> {
                    KolPlanExtendDTO kolPlanExtendDTO1 = new KolPlanExtendDTO();
                    kolPlanExtendDTO1.setBasePrice(BigDecimal.ZERO);
                    return kolPlanExtendDTO1;
                })).collect(Collectors.toList());
    }


}
