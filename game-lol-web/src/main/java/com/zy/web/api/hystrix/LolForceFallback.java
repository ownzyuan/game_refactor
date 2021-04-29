package com.zy.web.api.hystrix;

import com.zy.common.entity.LolForce;
import com.zy.web.api.LolForceApi;

import java.util.List;

public class LolForceFallback implements LolForceApi {


    @Override
    public List<LolForce> query(LolForce lolForce) {
        return null;
    }

    @Override
    public int insert(LolForce lolForce) {
        return 0;
    }

    @Override
    public int update(LolForce lolForce) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }
}
