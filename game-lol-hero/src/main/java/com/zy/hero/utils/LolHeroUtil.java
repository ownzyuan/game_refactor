package com.zy.hero.utils;

import com.zy.common.entity.LolHero;
import com.zy.hero.DO.LolHeroDO;
import org.springframework.beans.BeanUtils;

public class LolHeroUtil {

    public static LolHero LolHeroDoToEntity(LolHeroDO DO) {
        LolHero lolHero = new LolHero();
        BeanUtils.copyProperties(DO, lolHero);
        if (DO.getId() != null) {
            lolHero.setId(DO.getId());
        }
        if (DO.getStatus() != null) {
            lolHero.setStatus(DO.getStatus());
        }
        if (DO.getCreateTime() != null) {
            lolHero.setCreateTime(DO.getCreateTime());
        }
        if (DO.getUpdateTime() != null) {
            lolHero.setUpdateTime(DO.getUpdateTime());
        }
        return lolHero;
    }

    public static LolHeroDO LolHeroToDO(LolHero lolHero) {
        LolHeroDO DO = new LolHeroDO();
        BeanUtils.copyProperties(lolHero, DO);
        if (lolHero.getId() != null) {
            DO.setId(lolHero.getId());
        }
        if (lolHero.getStatus() != null) {
            DO.setStatus(lolHero.getStatus());
        }
        if (lolHero.getCreateTime() != null) {
            DO.setCreateTime(lolHero.getCreateTime());
        }
        if (lolHero.getUpdateTime() != null) {
            DO.setUpdateTime(lolHero.getUpdateTime());
        }
        return DO;
    }

    public static LolHeroDO setTime(LolHeroDO DO) {
        long nowTime = System.currentTimeMillis();
        if (DO.getCreateTime() == null) {
            DO.setCreateTime(nowTime);
        }
        DO.setUpdateTime(nowTime);
        return DO;
    }

}
