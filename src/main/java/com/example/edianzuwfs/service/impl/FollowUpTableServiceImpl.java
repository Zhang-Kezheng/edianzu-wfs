package com.example.edianzuwfs.service.impl;

import com.example.edianzuwfs.entities.FollowUpTable;
import com.example.edianzuwfs.mapper.FollowUpTableMapper;
import com.example.edianzuwfs.service.FollowUpTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FollowUpTableServiceImpl implements FollowUpTableService {
    @Resource
    FollowUpTableMapper followUpTableMapper;
    @Override
    public List<FollowUpTable> getFollowUpTableData(int userID) {
        return followUpTableMapper.getFollowUpTableData(userID);
    }
}
