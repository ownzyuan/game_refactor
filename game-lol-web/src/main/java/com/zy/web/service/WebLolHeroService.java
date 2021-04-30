package com.zy.web.service;

import com.zy.common.entity.LolHero;
import com.zy.common.vo.LolHeroVO;

import java.util.List;

public interface WebLolHeroService {

    List<LolHeroVO> query(LolHero lolHero);

    int insert(LolHero lolHero);

    int update(LolHero lolHero);

    int delete(Long id);

}
