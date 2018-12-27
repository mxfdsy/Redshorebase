package cww.world.elasticsearch.repository;

import cww.world.elasticsearch.bean.Goods;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Collection;
import java.util.List;

public interface GoodsRepository extends ElasticsearchRepository<Goods,String> {
    @Query("{\n" +
            "  \"sort\": [\n" +
            "    {\n" +
            "      \"date\": {\n" +
            "        \"order\": \"desc\"\n" +
            "      }\n" +
            "    }\n" +
            "  ]\n" +
            "}")
    List<Goods> getAllGoods();

    List<Goods> findByGoodUidIn(Collection<String> promotionProductUids);

}
