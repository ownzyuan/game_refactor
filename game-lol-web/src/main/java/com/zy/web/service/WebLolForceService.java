package com.zy.web.service;


import com.zy.common.entity.LolForce;

import java.util.List;

public interface WebLolForceService {

    List<LolForce> query(LolForce lolHero);
    int insert(LolForce lolHero);
    int update(LolForce lolHero);
    int delete(Long id);

}
