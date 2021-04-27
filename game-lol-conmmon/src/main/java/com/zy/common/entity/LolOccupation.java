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
public class LolOccupation extends BaseEntity {

    // 职业名(英文)
    private String nameUs;

    // 职业名(中文)
    private String nameCn;

}
