package com.zy.hero.service;

import com.zy.common.entity.LolHero;

import java.util.List;

public interface LolHeroService {

    List<LolHero> query(LolHero lolHero);

}
