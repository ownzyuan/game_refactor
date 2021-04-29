package com.zy.web.api.hystrix;

import com.zy.common.entity.LolHero;
import com.zy.web.api.LolHeroApi;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LolHeroFallback implements LolHeroApi {

    @Override
    public List<LolHero> query(LolHero lolHero) {
        return null;
    }

    @Override
    public int insert(LolHero lolHero) {
        return 0;
    }

    @Override
    public int update(LolHero lolHero) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

}
