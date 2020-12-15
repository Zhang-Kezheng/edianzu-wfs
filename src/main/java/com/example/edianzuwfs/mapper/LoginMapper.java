package com.example.edianzuwfs.mapper;

import com.example.edianzuwfs.entities.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select("select * from employee where loginname=#{loginname} and password=#{password}")
    Employee  employeeLogin(Employee employee);
}
