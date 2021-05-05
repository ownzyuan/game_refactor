package com.zy.common.entity;

import lombok.Data;

@Data
public class Admin {

    //管理员编号
    private Integer id;

    //用户名
    private String username;

    //密码
    private String password;

    //权限
    private String perms;

}
