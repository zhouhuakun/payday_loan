package com.example.usermanagement.entity;

import lombok.Data;

@Data
public class Userline {
    private Integer id;

    private String username;

    private String phone;

    private Integer borrowNumber;

    /**
     * 信用额度
     */
    private Integer creditLine;

    /**
     * 已用额度
     */
    private Integer useLine;

    /**
     * 剩余额度
     */
    private Integer residueLine;
}