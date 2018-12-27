package cww.world.java8.po;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Son {
    String name;

    Integer age;

    String businessType;

    BigDecimal bigDecimal;

    List<Father> fatherList = new ArrayList<>();

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString(Son s) {
        return JSON.toJSONString(s);
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public List<Father> getFatherList() {
        return fatherList;
    }

    public void setFatherList(List<Father> fatherList) {
        this.fatherList = fatherList;
    }
}
