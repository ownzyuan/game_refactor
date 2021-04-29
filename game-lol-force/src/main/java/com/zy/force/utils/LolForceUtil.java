package com.zy.force.utils;

import com.zy.common.entity.LolForce;
import com.zy.force.DO.LolForceDO;
import org.springframework.beans.BeanUtils;

public class LolForceUtil {

    public static LolForce LolForceDoToEntity(LolForceDO DO) {
        LolForce lolForce = new LolForce();
        BeanUtils.copyProperties(DO, lolForce);
        if (DO.getId() != null) {
            lolForce.setId(DO.getId());
        }
        if (DO.getStatus() != null) {
            lolForce.setStatus(DO.getStatus());
        }
        if (DO.getCreateTime() != null) {
            lolForce.setCreateTime(DO.getCreateTime());
        }
        if (DO.getUpdateTime() != null) {
            lolForce.setUpdateTime(DO.getUpdateTime());
        }
        return lolForce;
    }
    
    public static LolForceDO LolForceToDO(LolForce lolForce) {
        LolForceDO DO = new LolForceDO();
        BeanUtils.copyProperties(lolForce, DO);
        if (lolForce.getId() != null) {
            DO.setId(lolForce.getId());
        }
        if (lolForce.getStatus() != null) {
            DO.setStatus(lolForce.getStatus());
        }
        if (lolForce.getCreateTime() != null) {
            DO.setCreateTime(lolForce.getCreateTime());
        }
        if (lolForce.getUpdateTime() != null) {
            DO.setUpdateTime(lolForce.getUpdateTime());
        }
        return DO;
    }

    public static LolForceDO setTime(LolForceDO DO) {
        long nowTime = System.currentTimeMillis();
        if (DO.getCreateTime() == null) {
            DO.setCreateTime(nowTime);
        }
        DO.setUpdateTime(nowTime);
        return DO;
    }

}
