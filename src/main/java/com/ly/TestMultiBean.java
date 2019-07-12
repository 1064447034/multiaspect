package com.ly;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMultiBean {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MultiConfig.class);
        MultiBean multiBean = (MultiBean)context.getBean("multiBean");
        multiBean.testMulti();
    }
}
