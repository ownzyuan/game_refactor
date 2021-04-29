package com.zy.route.service;

import com.zy.common.entity.LolRoute;
import com.zy.route.DO.LolRouteDO;

import java.util.List;

public interface LolRouteService {

    List<LolRoute> query(LolRouteDO DO);
    int insert(LolRouteDO DO);
    int update(LolRouteDO DO);
    int delete(Long id);

}
