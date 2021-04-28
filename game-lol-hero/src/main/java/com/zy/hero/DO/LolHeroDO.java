package com.zy.hero.DO;

import lombok.Data;
import java.util.Date;

@Data
public class LolHeroDO {

    // 主键 id
    private Long id;

    // 英雄称号
    private String designation;

    // 英雄名
    private String heroName;

    // 性别 @see GenderEnum
    private Integer gender;

    // 势力编号
    private Long forceId;

    // 职业（主）
    private Long occupationOne;
    // 职业（次）
    private Long occupationTwo;

    // 推荐分路一
    private Long routeOne;
    // 推荐分路二
    private Long routeTwo;

    // 逻辑删除 1：未删除 0：已删除
    private Integer status;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date updateTime;
}
