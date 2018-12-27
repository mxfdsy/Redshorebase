package com.cww.world.EventTest.bean;

import com.cww.world.EventTest.BeanImportConfig;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(value = "com.cww.world.EventTest.bean")
public class StudentAddBeanTest implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext  = applicationContext;
    }

    public void addStudent(String sname){
        StudentAddEventTest addEvent = new StudentAddEventTest(this, sname);
        applicationContext.publishEvent(addEvent);
    }

    @Test
    public void addTest(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(BeanImportConfig.class);
        StudentAddBeanTest studentBean = new StudentAddBeanTest();
        studentBean.addStudent("张三");
        studentBean.addStudent("李四");
    }
}
