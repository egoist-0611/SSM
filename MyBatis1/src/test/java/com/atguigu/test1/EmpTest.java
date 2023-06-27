package com.atguigu.test1;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class EmpTest {
    @Test
    public void test5() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.selectLikeByName("J");
        System.out.println(employees);
    }
    @Test
    public void test4() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Map<String, Object> map = mapper.selectMaxAgeOnMap();
        System.out.println(map);
    }

    @Test
    public void test3() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Integer integer = mapper.selectMaxAge();
        System.out.println(integer);
    }

    @Test
    public void test2() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Map<String, Map<String, Object>> map = mapper.getAllUserOnMap();
        System.out.println(map);
    }

    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
//        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        int rows = mapper.insertEmp();
        int rows = sqlSession.insert("com.atguigu.mapper.EmployeeMapper.insertEmp");
        System.out.println(rows);
        sqlSession.close();
    }
}
