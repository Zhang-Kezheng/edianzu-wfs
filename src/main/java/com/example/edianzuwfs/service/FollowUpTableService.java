package com.example.edianzuwfs.service;

import com.example.edianzuwfs.entities.FollowUpTable;

import java.util.List;

public interface FollowUpTableService {
    List<FollowUpTable> getFollowUpTableData(int userID);
}
