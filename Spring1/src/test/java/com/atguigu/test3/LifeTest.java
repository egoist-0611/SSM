package com.atguigu.test3;

import com.atguigu.pojo.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest {
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Book book = context.getBean("book2", Book.class);
        System.out.println(book);
    }

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Book book = context.getBean("book1", Book.class);
        System.out.println(book);
        context.close();
    }
}
