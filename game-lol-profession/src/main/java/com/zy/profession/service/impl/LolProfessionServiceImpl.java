package com.zy.profession.service.impl;

import com.zy.common.entity.LolProfession;
import com.zy.profession.DO.LolProfessionDO;
import com.zy.profession.mapper.LolProfessionMapper;
import com.zy.profession.service.LolProfessionService;
import com.zy.profession.utils.LolProfessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.zy.profession.utils.LolProfessionUtil.setTime;


@Service
public class LolProfessionServiceImpl implements LolProfessionService {

    @Autowired
    private LolProfessionMapper lolProfessionMapper;

    @Override
    public List<LolProfession> query(LolProfessionDO DO) {
        List<LolProfessionDO> lolProfessionDOList = lolProfessionMapper.query(DO);
        return lolProfessionDOList.stream()
                .map(LolProfessionUtil::LolProfessionDoToEntity)
                .collect(Collectors.toList());
    }

    @Override
    public int insert(LolProfessionDO DO) {
        LolProfessionDO afterSetTime = setTime(DO);
        return lolProfessionMapper.insert(afterSetTime);
    }

    @Override
    public int update(LolProfessionDO DO) {
        LolProfessionDO afterSetTime = setTime(DO);
        return lolProfessionMapper.update(afterSetTime);
    }

    @Override
    public int delete(Long id) {
        LolProfessionDO DO = new LolProfessionDO();
        DO.setId(id);
        DO.setStatus(0)
                .setUpdateTime(System.currentTimeMillis());
        return lolProfessionMapper.update(DO);
    }
}
