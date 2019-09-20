package com.example.usermanagement.common;


public enum StatusTypeEnum {
    SUCCESS(200,"success"),
    ERROR(404,"error");

    private String msg;
    private int status;

    StatusTypeEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }


}
