package com.zy.web.service;


import com.zy.common.entity.LolProfession;

import java.util.List;

public interface WebLolProfessionService {

    List<LolProfession> query(LolProfession lolProfession);

    int insert(LolProfession lolProfession);

    int update(LolProfession lolProfession);

    int delete(Long id);

}
