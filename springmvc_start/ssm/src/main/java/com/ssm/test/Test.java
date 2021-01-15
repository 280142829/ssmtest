package com.ssm.test;


import com.ssm.service.serviceImpl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void run1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountServiceImpl as = (AccountServiceImpl) ac.getBean("accountServiceImpl");
        as.getAllAccount();
        System.out.println("test");
    }
}
