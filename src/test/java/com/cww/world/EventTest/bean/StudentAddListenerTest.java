package com.cww.world.EventTest.bean;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext-indexConfig-test.xml")
@Component
public class StudentAddListenerTest implements ApplicationListener<StudentAddEventTest> {

    @Override
    public void onApplicationEvent(StudentAddEventTest studentAddEventTest) {
        String sname = studentAddEventTest.getName();
        System.out.println("增加的学生的名字为：：："+sname);
    }
}
