package com.example.edianzuwfs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FollowUpTable {
    private int ID;
    private String customer_name;
    private String region_kliencki;
    private String push_people;
    private String policy_marker;
    private String contact_way;
    private String company_address;
    private String customer_main_business;
    private String last_follow_up_time;
    private String follow_up_case;
    private int userID;
}
