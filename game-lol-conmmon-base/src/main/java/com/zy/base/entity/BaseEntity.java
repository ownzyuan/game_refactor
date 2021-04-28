package com.zy.base.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 114514114514L;

    // 主键 id
    private Long id;

    // 逻辑删除 1：未删除 0：已删除
    private Integer status;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date updateTime;

}
