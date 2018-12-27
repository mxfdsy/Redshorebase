package com.cww.world.EventTest.bean;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationEvent;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext-indexConfig-test.xml")
public class StudentAddEventTest extends ApplicationEvent {
    private String name;

    public StudentAddEventTest(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
