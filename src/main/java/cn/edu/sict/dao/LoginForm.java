package cn.edu.sict.dao;

import lombok.Data;

/**
 * @description: 用户登录表单
 */
@Data
public class LoginForm {
    private String username;
    private String password;
    private String verificationCode;  //验证码
    private Integer userType;  //用户类别
}
