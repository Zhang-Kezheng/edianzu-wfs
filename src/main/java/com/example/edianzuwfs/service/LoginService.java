package com.example.edianzuwfs.service;

import com.example.edianzuwfs.entities.Employee;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    /**
     * 员工登录
     */
    Employee employeeLogin(Employee employee);

    /**
     * 员工注册
     * @param employee 员工信息
     * @return 1为成功，0为失败
     */
    int employeeRegister(Employee employee);
}
