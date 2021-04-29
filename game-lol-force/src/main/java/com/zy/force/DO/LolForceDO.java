package com.zy.force.DO;

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
public class LolForceDO extends BaseDO {

    // 主键 id
    private Long id;

    // 势力名
    private String forceName;

    // 逻辑删除 1：未删除 0：已删除
    private Integer status;

    // 创建时间
    private Long createTime;

    // 修改时间
    private Long updateTime;
}
