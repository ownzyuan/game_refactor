package com.zy.web.service;

import com.zy.common.entity.LolHero;

import java.util.List;

public interface WebLolHeroService {

    List<LolHero> query(LolHero lolHero);
    int insert(LolHero lolHero);
    int update(LolHero lolHero);
    int delete(Long id);

}
