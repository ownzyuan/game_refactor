package com.zy.profession.service;


import com.zy.common.entity.LolProfession;
import com.zy.profession.DO.LolProfessionDO;

import java.util.List;

public interface LolProfessionService {

    List<LolProfession> query(LolProfessionDO DO);
    int insert(LolProfessionDO DO);
    int update(LolProfessionDO DO);
    int delete(Long id);

}
