package com.zy.force.service;

import com.zy.common.entity.LolForce;
import com.zy.force.DO.LolForceDO;

import java.util.List;

public interface LolForceService {

    List<LolForce> query(LolForceDO DO);
    int insert(LolForceDO DO);
    int update(LolForceDO DO);
    int delete(Long id);

}
