package com.example.edianzuwfs.controller;

import com.example.edianzuwfs.entities.Advice;
import com.example.edianzuwfs.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author 章可政
 * @date 2020/12/17 20:45
 */
@Controller
public class HomeController {

    @Resource
    private HomeService homeService;


    @RequestMapping("/wfs/connect")
    public String Connect(){
        return "connect";
    }


    @ResponseBody
    @PostMapping("/wfs/advice")
    public String advice(Advice advice){
        Date date=new Date();
        advice.setDate(date);
        int advice1 = homeService.advice(advice);
        if (advice1>0){
            return "success";
        }
        return "fail";
    }
}
