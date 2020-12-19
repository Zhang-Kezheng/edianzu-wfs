package com.example.edianzuwfs.service.impl;

import com.example.edianzuwfs.entities.Advice;
import com.example.edianzuwfs.mapper.HomeMapper;
import com.example.edianzuwfs.service.HomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HomeServiceImpl implements HomeService {
    @Resource
    private HomeMapper homeMapper;
    @Override
    public int advice(Advice advice) {
        return homeMapper.advice(advice);
    }
}
