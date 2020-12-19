package com.example.edianzuwfs.mapper;

import com.example.edianzuwfs.entities.Advice;
import com.example.edianzuwfs.entities.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select("select * from employee where email=#{email} and password=#{password}")
    Employee  employeeLogin(Employee employee);

    @Insert("insert into employee values(default,#{password},#{username},#{email})")
    int employeeRegister(Employee employee);
}
