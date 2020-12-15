package com.example.edianzuwfs.service;

import com.example.edianzuwfs.entities.Employee;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    /**
     * 员工登录
     */
    Employee employeeLogin(Employee employee);
}
