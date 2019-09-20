package com.example.usermanagement.mapper;

import com.example.usermanagement.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserMapper {
     List<User> selectAll();

     User selectByone(@Param("id") int id);

     int delete(int id);

     int insert(User user);

     int update(User user);
}