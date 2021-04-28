package com.zy.hero.service;

import com.zy.common.entity.LolHero;
import com.zy.hero.DO.LolHeroDO;

import java.util.List;

public interface LolHeroService {

    List<LolHero> query(LolHeroDO lolHeroDO);
    int insert(LolHeroDO lolHeroDO);
    int update(LolHeroDO lolHeroDO);
    int delete(Long id);

}
