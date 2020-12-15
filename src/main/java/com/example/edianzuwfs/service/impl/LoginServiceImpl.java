package com.example.edianzuwfs.service.impl;

import com.example.edianzuwfs.entities.Employee;
import com.example.edianzuwfs.mapper.LoginMapper;
import com.example.edianzuwfs.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginMapper loginMapper;
    /**
     * 员工登录
     */
    @Override
    public Employee employeeLogin(Employee employee) {
        return loginMapper.employeeLogin(employee) ;
    }
}
