package com.example.edianzuwfs.controller;

import com.example.edianzuwfs.entities.FollowUpTable;
import com.example.edianzuwfs.entities.Message;
import com.example.edianzuwfs.service.FollowUpTableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class FollowUpTableController {
    @Resource
    FollowUpTableService followUpTableService;

    /**
     * 跟进表
     * @return 跟进表页面
     */
    @GetMapping("/wfs/followUpTable")
    public String followUpTable(){

        return "followUpTable";
    }
    @ResponseBody
    @GetMapping("/wfs/getFollowUpTableData")
    public Message getFollowUpTableData(int userID){
        Message message=new Message();
        message.setCode(0);
        message.setMsg("");
        List<FollowUpTable> followUpTables= followUpTableService.getFollowUpTableData(userID);
        message.setData(followUpTables);
        message.setCount(followUpTables.size());
        return message;
    }
}
