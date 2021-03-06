package com.zy.profession.DO;

import com.zy.base.DO.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class LolProfessionDO extends BaseDO {

    // 主键 id
    private Long id;

    // 职业名(英文)
    private String nameUs;

    // 职业名(中文)
    private String nameCn;

    // 逻辑删除 1：未删除 0：已删除
    private Integer status;

    // 创建时间
    private Long createTime;

    // 修改时间
    private Long updateTime;

}
