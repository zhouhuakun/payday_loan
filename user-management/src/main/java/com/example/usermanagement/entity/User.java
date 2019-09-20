package com.example.usermanagement.entity;

import java.util.Date;

//import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
//    @TableId
    private Integer id;

    /**
    * 用户名
    */
    private String username;

    private String phone;

    private String idCard;

    private String address;

    private Date creatTime;

    /**
    * 注册渠道
    */
    private String channels;

    /**
    * 使用客户端
    */
    private String useClient;
}