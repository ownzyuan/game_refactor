package com.zy.profession.utils;

import com.zy.common.entity.LolProfession;
import com.zy.profession.DO.LolProfessionDO;
import org.springframework.beans.BeanUtils;

public class LolProfessionUtil {

    public static LolProfession LolProfessionDoToEntity(LolProfessionDO DO) {
        LolProfession lolProfession = new LolProfession();
        BeanUtils.copyProperties(DO, lolProfession);
        if (DO.getId() != null) {
            lolProfession.setId(DO.getId());
        }
        if (DO.getStatus() != null) {
            lolProfession.setStatus(DO.getStatus());
        }
        if (DO.getCreateTime() != null) {
            lolProfession.setCreateTime(DO.getCreateTime());
        }
        if (DO.getUpdateTime() != null) {
            lolProfession.setUpdateTime(DO.getUpdateTime());
        }
        return lolProfession;
    }

    public static LolProfessionDO LolProfessionToDO(LolProfession lolProfession) {
        LolProfessionDO DO = new LolProfessionDO();
        BeanUtils.copyProperties(lolProfession, DO);
        if (lolProfession.getId() != null) {
            DO.setId(lolProfession.getId());
        }
        if (lolProfession.getStatus() != null) {
            DO.setStatus(lolProfession.getStatus());
        }
        if (lolProfession.getCreateTime() != null) {
            DO.setCreateTime(lolProfession.getCreateTime());
        }
        if (lolProfession.getUpdateTime() != null) {
            DO.setUpdateTime(lolProfession.getUpdateTime());
        }
        return DO;
    }

    public static LolProfessionDO setTime(LolProfessionDO DO) {
        long nowTime = System.currentTimeMillis();
        if (DO.getCreateTime() == null) {
            DO.setCreateTime(nowTime);
        }
        DO.setUpdateTime(nowTime);
        return DO;
    }
    
}
