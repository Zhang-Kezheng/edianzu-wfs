package com.example.edianzuwfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 章可政
 * @date 2020/12/17 20:45
 */
@Controller
public class HomeController {

    @RequestMapping("/wfs/connect")
    public String Connect(){
        return "connect";
    }
    @ResponseBody
    @PostMapping("/wfs/advice")
    public String advice(){
        return "success";
    }
}
