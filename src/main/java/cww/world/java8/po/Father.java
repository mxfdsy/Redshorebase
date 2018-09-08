package cww.world.java8.po;

import java.util.List;

public class Father {
    String name;
    Integer age;

    List<son> sonList;

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

    public List<son> getSonList() {
        return sonList;
    }

    public void setSonList(List<son> sonList) {
        this.sonList = sonList;
    }
}
