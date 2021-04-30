package com.zy.route.service.impl;

import com.zy.common.entity.LolRoute;
import com.zy.route.DO.LolRouteDO;
import com.zy.route.mapper.LolRouteMapper;
import com.zy.route.service.LolRouteService;
import com.zy.route.utils.LolRouteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.zy.route.utils.LolRouteUtil.setTime;


@Service
public class LolRouteServiceImpl implements LolRouteService {

    @Autowired
    private LolRouteMapper lolRouteMapper;

    @Override
    public List<LolRoute> query(LolRouteDO DO) {
        List<LolRouteDO> lolRouteDOList = lolRouteMapper.query(DO);
        if (CollectionUtils.isEmpty(lolRouteDOList)) {
            return Collections.EMPTY_LIST;
        }
        return lolRouteDOList.stream()
                .map(LolRouteUtil::LolRouteDoToEntity)
                .collect(Collectors.toList());
    }

    @Override
    public int insert(LolRouteDO DO) {
        LolRouteDO afterSetTime = setTime(DO);
        return lolRouteMapper.insert(afterSetTime);
    }

    @Override
    public int update(LolRouteDO DO) {
        LolRouteDO afterSetTime = setTime(DO);
        return lolRouteMapper.update(afterSetTime);
    }

    @Override
    public int delete(Long id) {
        LolRouteDO DO = new LolRouteDO();
        DO.setId(id);
        DO.setStatus(0)
                .setUpdateTime(System.currentTimeMillis());
        return lolRouteMapper.update(DO);
    }
}
