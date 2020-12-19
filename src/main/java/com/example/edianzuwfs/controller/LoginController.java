package com.example.edianzuwfs.controller;

import com.example.edianzuwfs.entities.Employee;
import com.example.edianzuwfs.service.LoginService;
import org.springframework.http.HttpRequest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * 登录
 */
@Controller
public class LoginController {
    /**
     * 登录服务
     */
    @Resource
    private LoginService loginService;
    /**
     * 邮件发送者
     */
    @Resource
    private JavaMailSender mailSender;
    /**
     * 员工登录
     * @param employee 员工
     * @return 如果存在则返回success，如果不存在则返回fail
     */
    @ResponseBody
    @PostMapping("/wfs/employeelogin")
    public String employeeLogin(Employee employee, HttpServletRequest request){
        Employee login = loginService.employeeLogin(employee);
        Random random=new Random();
        String code="";
        for (int i=0;i<6;i++){
            int c=random.nextInt(10);
            code=code+c;
        }
        request.getSession().setAttribute("code",code);
        if (login!=null){
            sendMail(code,login.getEmail());
            return "success";
        }
        return "fail";
    }

    /**
     * 跳转登录页面
      * @return 返回登录页面
     */
    @GetMapping("/")
    public String login(){
        return "login";
    }

    /**
     * 跳转主页
     * @return 返回主页
     */
    @GetMapping("/wfs/home")
    public String loginSuccess(){
        return "home";
    }
    @ResponseBody
    @PostMapping("/wfs/loginCode")
    public String loginCode(HttpServletRequest request,String code){
        String code1 = (String) request.getSession().getAttribute("code");
        if (code1.equals(code)){
            return "success";
        }
        return "fail";
    }

    /**
     * 主页请求
     * @return 主页
     */
    @ResponseBody
    @RequestMapping("/wfs/main")
    public String main(){
        return "欢迎来到易点租库外管理系统！暂时不知道应该有点什么功能，如果有想法，请留言";
    }

    /**
     * 去注册页
     * @return 注册页
     */
    @GetMapping("/wfs/register")
    public String register(){
        return "register";
    }
    /**
     * 注册
     * @param employee 员工信息
     * @return
     */

    @ResponseBody
    @PostMapping("/wfs/register")
    public String register(Employee employee){
        int i = loginService.employeeRegister(employee);
        if (i>0){
            return "success";
        }
        return "fail";
    }
    /**
     * 发送邮件
     * @param code 验证码
     * @param email 邮箱
     */
    public  void sendMail(String code,String email){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("3283903579@qq.com"); // 必须要和上文配置的spring.mail.username内容相同

        message.setTo(email);

        message.setSubject("易点租");

        message.setText(code);

        mailSender.send(message);
    }
}
