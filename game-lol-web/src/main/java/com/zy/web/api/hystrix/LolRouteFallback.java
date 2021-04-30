package com.zy.web.api.hystrix;

import com.zy.common.entity.LolRoute;
import com.zy.web.api.LolRouteApi;

import java.util.List;

public class LolRouteFallback implements LolRouteApi {


    @Override
    public List<LolRoute> query(LolRoute lolRoute) {
        return null;
    }

    @Override
    public int insert(LolRoute lolRoute) {
        return 0;
    }

    @Override
    public int update(LolRoute lolRoute) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }
}
