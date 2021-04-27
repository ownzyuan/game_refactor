package com.zy.hero.service.impl;

import com.zy.common.entity.LolHero;
import com.zy.hero.mapper.LolHeroMapper;
import com.zy.hero.service.LolHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LolHeroServiceImpl implements LolHeroService {

    @Autowired
    private LolHeroMapper lolHeroMapper;

    @Override
    public List<LolHero> query(LolHero lolHero) {
        return lolHeroMapper.query(lolHero);
    }
}
