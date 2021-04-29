package com.zy.force.service.impl;

import com.zy.common.entity.LolForce;
import com.zy.force.DO.LolForceDO;
import com.zy.force.mapper.LolForceMapper;
import com.zy.force.service.LolForceService;
import com.zy.force.utils.LolForceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.zy.force.utils.LolForceUtil.setTime;

@Service
public class LolForceServiceImpl implements LolForceService {

    @Autowired
    private LolForceMapper lolForceMapper;

    @Override
    public List<LolForce> query(LolForceDO DO) {
        List<LolForceDO> lolForceDOList = lolForceMapper.query(DO);
        return lolForceDOList.stream()
                .map(LolForceUtil::LolForceDoToEntity)
                .collect(Collectors.toList());
    }

    @Override
    public int insert(LolForceDO DO) {
        LolForceDO afterSetTime = setTime(DO);
        return lolForceMapper.insert(afterSetTime);
    }

    @Override
    public int update(LolForceDO DO) {
        LolForceDO afterSetTime = setTime(DO);
        return lolForceMapper.update(afterSetTime);
    }

    @Override
    public int delete(Long id) {
        LolForceDO DO = new LolForceDO();
        DO.setId(id);
        DO.setStatus(0)
                .setUpdateTime(System.currentTimeMillis());
        return lolForceMapper.update(DO);
    }
}
