package com.example.edianzuwfs.mapper;

import com.example.edianzuwfs.entities.FollowUpTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FollowUpTableMapper {
    @Select("select * from followUpTable where userID=#{userID}")
    List<FollowUpTable> getFollowUpTableData(int userID);
}
