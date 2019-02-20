package cww.world.otherInfo.elasticsearch.controller;

import cww.world.common.constant.Constants;
import cww.world.common.util.ResultBuilderUtils;
import cww.world.otherInfo.elasticsearch.bean.Goods;
import cww.world.otherInfo.elasticsearch.bean.Person;
import cww.world.otherInfo.elasticsearch.repository.GoodsRepository;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.*;

@Controller
@RequestMapping(value = "/es")
public class EsController {

    @Autowired
    private GoodsRepository repository;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String testES() {
        Goods goods = new Goods();
        goods.setGoodUid("2222222");
        goods.setBelong("cww02");
        goods.setName("mac02");
        goods.setGoodPrice(BigDecimal.ONE);

        Person person01 = new Person();
        person01.setName("cww03");

        Person person02 = new Person();
        person02.setName("cww04");

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person01);
        personList.add(person02);


        List<String> list = new ArrayList<>();
        list.add("3");
        list.add("4");
        goods.setContianlist(list);
        goods.setPersonList(personList);
        goods.setDate(DateUtils.addDays(new Date(), 1));
        repository.save(goods);
        return ResultBuilderUtils.buildSuccess(Constants.SUCCESS);
    }


    @RequestMapping(value = "/getGoodsInfo", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getGoodsInfo(@RequestBody String payload) {
        Iterable<Goods> all = repository.findAll();
        Iterable<Goods> all1 = repository.findAll(Collections.singleton("2222222"));
        List<Goods> byGoodUidIn = repository.findByGoodUidIn(Arrays.asList("2222222"));
        Goods byGoodUid = repository.findByGoodUid("2222222");
        Goods mac02 = repository.findByNameAndAndGoodPrice("mac02", BigDecimal.ONE);
        List<Goods> byGoodPriceBetween = repository.findByGoodPriceBetween(BigDecimal.ZERO, BigDecimal.TEN);
        return ResultBuilderUtils.buildSuccess(Constants.SUCCESS);
    }
}
