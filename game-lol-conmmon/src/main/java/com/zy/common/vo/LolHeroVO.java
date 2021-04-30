package com.zy.common.vo;

import lombok.Data;

@Data
public class LolHeroVO {

    //英雄编号
    private Long id;

    //英雄称号
    private String designation;
    //英雄名
    private String heroName;
    //性别
    private Integer gender;
    //势力名
    private String forceName;

    //职业名（主）
    private String professionNameOne;
    //职业名（次）
    private String professionNameTwo;

    //推荐分路名一
    private String routeNameOne;
    //推荐分路名二
    private String routeNameTwo;

}
