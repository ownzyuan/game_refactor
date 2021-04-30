package com.zy.web.service;


import com.zy.common.entity.LolRoute;

import java.util.List;

public interface WebLolRouteService {

    List<LolRoute> query(LolRoute lolRoute);

    int insert(LolRoute lolRoute);

    int update(LolRoute lolRoute);

    int delete(Long id);

}
