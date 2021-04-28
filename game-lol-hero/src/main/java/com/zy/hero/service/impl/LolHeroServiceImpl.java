package com.zy.hero.service.impl;

import com.zy.common.entity.LolHero;
import com.zy.hero.DO.LolHeroDO;
import com.zy.hero.mapper.LolHeroMapper;
import com.zy.hero.service.LolHeroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LolHeroServiceImpl implements LolHeroService {

    @Autowired
    private LolHeroMapper lolHeroMapper;

    @Override
    public List<LolHero> query(LolHeroDO lolHeroDO) {
        List<LolHeroDO> lolHeroDOList = lolHeroMapper.query(lolHeroDO);
        return lolHeroDOList.stream()
                .map(DO -> LolHeroDoToEntity(DO))
                .collect(Collectors.toList());
    }

    private LolHero LolHeroDoToEntity(LolHeroDO DO) {
        LolHero lolHero = new LolHero();
        BeanUtils.copyProperties(DO, lolHero);
        if (DO.getId() != null) {
            lolHero.setId(DO.getId());
        }
        if (DO.getStatus() != null) {
            lolHero.setStatus(DO.getStatus());
        }
        return lolHero;
    }
}
