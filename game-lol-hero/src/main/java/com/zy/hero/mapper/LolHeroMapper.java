package com.zy.hero.mapper;

import com.zy.hero.DO.LolHeroDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface LolHeroMapper {

    List<LolHeroDO> query(LolHeroDO lolHeroDO);

    int insert(LolHeroDO lolHeroDO);

    int update(LolHeroDO lolHeroDO);

}
