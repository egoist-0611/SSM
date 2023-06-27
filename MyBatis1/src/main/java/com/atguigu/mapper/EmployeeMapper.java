package com.atguigu.mapper;

import com.atguigu.pojo.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    List<Employee> selectLikeByName(@Param("empName")String empName);

    public abstract int insertEmp();

    Integer selectMaxAge();

    Map<String, Object> selectMaxAgeOnMap();

    @MapKey("empName")
//    Map<String, Object> getAllUserOnMap();
    Map<String, Map<String, Object>> getAllUserOnMap();
}
