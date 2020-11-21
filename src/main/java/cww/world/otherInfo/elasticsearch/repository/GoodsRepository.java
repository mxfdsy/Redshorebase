//package cww.world.otherInfo.elasticsearch.repository;
//
//import cww.world.otherInfo.elasticsearch.bean.Goods;
//import org.springframework.data.elasticsearch.annotations.Query;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//
//import java.math.BigDecimal;
//import java.util.Collection;
//import java.util.List;
//
//public interface GoodsRepository extends ElasticsearchRepository<Goods, String> {
//    @Query("{\n" +
//            "  \"sort\": [\n" +
//            "    {\n" +
//            "      \"date\": {\n" +
//            "        \"order\": \"desc\"\n" +
//            "      }\n" +
//            "    }\n" +
//            "  ]\n" +
//            "}")
//    List<Goods> getAllGoods();
//
//    List<Goods> findByGoodUidIn(Collection<String> promotionProductUids);
//
//    Goods findByGoodUid(String goodUid);
//
//
//    Goods findByNameAndAndGoodPrice(String name, BigDecimal decimal);
//
//    List<Goods> findByGoodPriceBetween(BigDecimal decimal, BigDecimal decimal1);
//}
