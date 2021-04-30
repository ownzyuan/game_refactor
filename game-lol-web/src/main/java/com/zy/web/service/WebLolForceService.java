package com.zy.web.service;


import com.zy.common.entity.LolForce;

import java.util.List;

public interface WebLolForceService {

    List<LolForce> query(LolForce lolForce);

    int insert(LolForce lolForce);

    int update(LolForce lolForce);

    int delete(Long id);

}
