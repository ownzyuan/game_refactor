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
        LolHeroDO lolHeroDO = new LolHeroDO();
        BeanUtils.copyProperties(lolHero, lolHeroDO);
        if (lolHero.getId() != null) {
            lolHeroDO.setId(lolHero.getId());
        }
        if (lolHero.getStatus() != null) {
            lolHeroDO.setStatus(lolHero.getStatus());
        }
        if (lolHero.getCreateTime() != null) {
            lolHeroDO.setCreateTime(lolHero.getCreateTime());
        }
        if (lolHero.getUpdateTime() != null) {
            lolHeroDO.setUpdateTime(lolHero.getUpdateTime());
        }
        return lolHeroDO;
    }

    public static LolHeroDO setTime(LolHeroDO lolHeroDO) {
        long nowTime = System.currentTimeMillis();
        if (lolHeroDO.getCreateTime() == null) {
            lolHeroDO.setCreateTime(nowTime);
        }
        lolHeroDO.setUpdateTime(nowTime);
        return lolHeroDO;
    }

}
