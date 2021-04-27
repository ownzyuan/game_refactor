package com.zy.common.entity;

import com.zy.base.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class LolHero extends BaseEntity {

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

}
