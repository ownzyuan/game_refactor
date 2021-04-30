package com.zy.hero.service.impl;

import com.zy.common.entity.LolHero;
import com.zy.hero.DO.LolHeroDO;
import com.zy.hero.mapper.LolHeroMapper;
import com.zy.hero.service.LolHeroService;
import com.zy.hero.utils.LolHeroUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
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
        if (CollectionUtils.isEmpty(lolHeroDOList)) {
            return Collections.EMPTY_LIST;
        }
        return lolHeroDOList.stream()
                .map(LolHeroUtil::LolHeroDoToEntity)
                .collect(Collectors.toList());
    }

    @Override
    public int insert(LolHeroDO DO) {
        LolHeroDO afterSetTime = setTime(DO);
        return lolHeroMapper.insert(afterSetTime);
    }

    @Override
    public int update(LolHeroDO DO) {
        LolHeroDO afterSetTime = setTime(DO);
        return lolHeroMapper.update(afterSetTime);
    }

    @Override
    public int delete(Long id) {
        LolHeroDO DO = new LolHeroDO();
        DO.setId(id);
        DO.setStatus(0)
                .setUpdateTime(System.currentTimeMillis());
        return lolHeroMapper.update(DO);
    }

}
