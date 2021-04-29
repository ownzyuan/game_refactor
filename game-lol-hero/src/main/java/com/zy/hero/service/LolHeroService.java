package com.zy.hero.service;

import com.zy.common.entity.LolHero;
import com.zy.hero.DO.LolHeroDO;

import java.util.List;

public interface LolHeroService {

    List<LolHero> query(LolHeroDO DO);
    int insert(LolHeroDO DO);
    int update(LolHeroDO DO);
    int delete(Long id);

}
