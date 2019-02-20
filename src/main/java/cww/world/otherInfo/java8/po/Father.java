package cww.world.otherInfo.java8.po;

import java.math.BigDecimal;
import java.util.List;

public class Father {
    String name;
    Integer age;
    BigDecimal bigDecimal;

    List<Son> sonList;

    String businessType;


    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
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

    public List<Son> getSonList() {
        return sonList;
    }

    public void setSonList(List<Son> sonList) {
        this.sonList = sonList;
    }


    public Father(String name, Integer age, BigDecimal bigDecimal) {
        this.name = name;
        this.age = age;
        this.bigDecimal = bigDecimal;
    }

    public Father() {
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bigDecimal=" + bigDecimal +
                ", sonList=" + sonList +
                ", businessType='" + businessType + '\'' +
                '}';
    }
}
