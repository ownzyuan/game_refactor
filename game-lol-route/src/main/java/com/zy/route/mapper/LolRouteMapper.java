package com.zy.route.mapper;

import com.zy.route.DO.LolRouteDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LolRouteMapper {

    List<LolRouteDO> query(LolRouteDO DO);

    int insert(LolRouteDO DO);

    int update(LolRouteDO DO);

}
