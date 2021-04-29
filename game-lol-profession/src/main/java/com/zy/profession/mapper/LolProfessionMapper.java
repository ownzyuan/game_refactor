package com.zy.profession.mapper;

import com.zy.profession.DO.LolProfessionDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LolProfessionMapper {

    List<LolProfessionDO> query(LolProfessionDO DO);

    int insert(LolProfessionDO DO);

    int update(LolProfessionDO DO);

}
