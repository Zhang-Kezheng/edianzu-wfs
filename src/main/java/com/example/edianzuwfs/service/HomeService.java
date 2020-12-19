package com.example.edianzuwfs.service;

import com.example.edianzuwfs.entities.Advice;
import org.springframework.stereotype.Service;

@Service
public interface HomeService {
    int advice(Advice advice);
}
