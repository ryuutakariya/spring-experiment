package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Parent;

@Mapper
public interface HogeRepositoryMapper {
    
    List<Parent> selectTest();
}
