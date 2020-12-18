package com.example.edianzuwfs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    private Integer index;
    private String loginname;
    private String password;
    private String username;
    private String email;
}
