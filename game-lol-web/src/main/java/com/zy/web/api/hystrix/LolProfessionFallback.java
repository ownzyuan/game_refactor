package com.zy.web.api.hystrix;


import com.zy.common.entity.LolProfession;
import com.zy.web.api.LolProfessionApi;

import java.util.List;

public class LolProfessionFallback implements LolProfessionApi {


    @Override
    public List<LolProfession> query(LolProfession lolProfession) {
        return null;
    }

    @Override
    public LolProfession queryById(Long id) {
        return null;
    }

    @Override
    public int insert(LolProfession lolProfession) {
        return 0;
    }

    @Override
    public int update(LolProfession lolProfession) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }
}
