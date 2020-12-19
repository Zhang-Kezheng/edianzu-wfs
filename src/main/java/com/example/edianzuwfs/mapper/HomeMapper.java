package com.example.edianzuwfs.mapper;

import com.example.edianzuwfs.entities.Advice;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {
    @Insert("insert into advice value(default,#{name},#{phone},#{advice},#{date})")
    int advice(Advice advice);
}
