package com.zy.force.mapper;

import com.zy.force.DO.LolForceDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LolForceMapper {

    List<LolForceDO> query(LolForceDO lolForceDO);

    int insert(LolForceDO lolForceDO);

    int update(LolForceDO lolForceDO);

}
