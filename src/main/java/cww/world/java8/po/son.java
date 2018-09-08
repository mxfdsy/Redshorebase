package cww.world.java8.po;

import com.alibaba.fastjson.JSON;

public class son {
    String name;
    Integer age;

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

    public String toString(son s) {
        return JSON.toJSONString(s);
    }
}
