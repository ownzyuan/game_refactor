package com.zy.route.utils;

import com.zy.common.entity.LolRoute;
import com.zy.route.DO.LolRouteDO;
import org.springframework.beans.BeanUtils;

public class LolRouteUtil {

    public static LolRoute LolRouteDoToEntity(LolRouteDO DO) {
        LolRoute lolRoute = new LolRoute();
        BeanUtils.copyProperties(DO, lolRoute);
        if (DO.getId() != null) {
            lolRoute.setId(DO.getId());
        }
        if (DO.getStatus() != null) {
            lolRoute.setStatus(DO.getStatus());
        }
        if (DO.getCreateTime() != null) {
            lolRoute.setCreateTime(DO.getCreateTime());
        }
        if (DO.getUpdateTime() != null) {
            lolRoute.setUpdateTime(DO.getUpdateTime());
        }
        return lolRoute;
    }

    public static LolRouteDO LolRouteToDO(LolRoute lolRoute) {
        LolRouteDO DO = new LolRouteDO();
        BeanUtils.copyProperties(lolRoute, DO);
        if (lolRoute.getId() != null) {
            DO.setId(lolRoute.getId());
        }
        if (lolRoute.getStatus() != null) {
            DO.setStatus(lolRoute.getStatus());
        }
        if (lolRoute.getCreateTime() != null) {
            DO.setCreateTime(lolRoute.getCreateTime());
        }
        if (lolRoute.getUpdateTime() != null) {
            DO.setUpdateTime(lolRoute.getUpdateTime());
        }
        return DO;
    }

    public static LolRouteDO setTime(LolRouteDO DO) {
        long nowTime = System.currentTimeMillis();
        if (DO.getCreateTime() == null) {
            DO.setCreateTime(nowTime);
        }
        DO.setUpdateTime(nowTime);
        return DO;
    }
    
}
