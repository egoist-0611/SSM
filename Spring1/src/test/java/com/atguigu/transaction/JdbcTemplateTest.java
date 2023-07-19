package com.atguigu.transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:JdbcTemplate-config.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test1(){
        String sql = "INSERT INTO user(name,age,sex) VALUES(?,?,?)";
        int res = jdbcTemplate.update(sql, "Tom", 10, "男");
        System.out.println(res);
    }
}
