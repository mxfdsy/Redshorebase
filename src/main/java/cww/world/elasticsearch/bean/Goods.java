package cww.world.elasticsearch.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Document(indexName = "color", type = "redGoods", shards = 1, replicas = 1)
public class Goods {
    private static final long serialVersionUID = 1L;

    @Id
    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    String goodUid;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    String name;
    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    String belong;

    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    BigDecimal goodPrice;

    @Field(type = FieldType.String)
    List<String> contianlist;

    @Field(type = FieldType.Nested)
    List<Person> personList;

    @Field(type = FieldType.Date, index = FieldIndex.not_analyzed)
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public String getGoodUid() {
        return goodUid;
    }

    public void setGoodUid(String goodUid) {
        this.goodUid = goodUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public List<String> getContianlist() {
        return contianlist;
    }

    public void setContianlist(List<String> contianlist) {
        this.contianlist = contianlist;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
