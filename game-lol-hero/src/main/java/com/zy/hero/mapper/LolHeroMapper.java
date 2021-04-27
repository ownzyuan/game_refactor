package com.zy.hero.mapper;

import com.zy.common.entity.LolHero;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface LolHeroMapper {

    List<LolHero> query(LolHero lolHero);

    int insert(LolHero lolHero);
}
