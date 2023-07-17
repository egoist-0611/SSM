package com.atguigu.test4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP-config.xml");
//        Calculator bean = context.getBean(CalculatorImpl.class);
        Calculator bean = context.getBean(Calculator.class);
        int res = bean.add(10, 20);
        System.out.println(res);
    }
}
