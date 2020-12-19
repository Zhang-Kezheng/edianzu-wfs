package com.example.edianzuwfs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Advice {
    private int index;
    private String name;
    private String phone;
    private String advice;
    private Date date;
}
