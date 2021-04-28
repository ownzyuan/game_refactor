package com.zy.hero.service.impl;

import com.zy.common.entity.LolHero;
import com.zy.hero.DO.LolHeroDO;
import com.zy.hero.mapper.LolHeroMapper;
import com.zy.hero.service.LolHeroService;
import com.zy.hero.utils.LolHeroUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.zy.hero.utils.LolHeroUtil.setTime;

@Service
public class LolHeroServiceImpl implements LolHeroService {

    @Autowired
    private LolHeroMapper lolHeroMapper;

    @Override
    public List<LolHero> query(LolHeroDO DO) {
        List<LolHeroDO> lolHeroDOList = lolHeroMapper.query(DO);
        return lolHeroDOList.stream()
                .map(LolHeroUtil::LolHeroDoToEntity)
                .collect(Collectors.toList());
    }

    @Override
    public int insert(LolHeroDO DO) {
        LolHeroDO lolHeroDO = setTime(DO);
        return lolHeroMapper.insert(lolHeroDO);
    }

    @Override
    public int update(LolHeroDO DO) {
        LolHeroDO lolHeroDO = setTime(DO);
        return lolHeroMapper.update(lolHeroDO);
    }

    @Override
    public int delete(Long id) {
        LolHeroDO lolHeroDO = new LolHeroDO();
        lolHeroDO.setId(id);
        lolHeroDO.setStatus(0)
                .setUpdateTime(System.currentTimeMillis());
        return lolHeroMapper.update(lolHeroDO);
    }

}
