package com.example.usermanagement.entity;

//import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Userstatus {
//    @TableId
    private Integer id;

    private String username;

    private String phone;

    /**
    * 1代表实名，0代表未实名
    */
    private Integer realNameStatus;

    /**
    * 1代表联系人已认证，0代表未认证
    */
    private Integer contactStatus;

    /**
    * 1代表运营商已认证，0代表未认证
    */
    private Integer operatorStatus;

    /**
    * 1代表银行卡已认证，0代表未认证
    */
    private Integer bankCardStatus;
}