package com.example.edianzuwfs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message {
    private int code;
    private String msg;
    private int count;
    private List<FollowUpTable> data;
}
