package com.example.usermanagement.mapper;

import com.example.usermanagement.entity.Userline;

public interface UserlineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userline record);

    int insertSelective(Userline record);

    Userline selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userline record);

    int updateByPrimaryKey(Userline record);
}