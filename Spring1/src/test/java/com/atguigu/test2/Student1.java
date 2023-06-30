package com.atguigu.test2;

import com.atguigu.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student1 {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student1 = context.getBean("student1", Student.class);
//        Student student2 = context.getBean("student2", Student.class);
        Student student3 = context.getBean("student3", Student.class);
        System.out.println(student3);
    }
}
