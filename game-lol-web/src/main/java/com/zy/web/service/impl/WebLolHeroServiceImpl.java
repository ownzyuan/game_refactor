package com.zy.web.service.impl;

import com.zy.common.entity.LolForce;
import com.zy.common.entity.LolHero;
import com.zy.common.entity.LolProfession;
import com.zy.common.entity.LolRoute;
import com.zy.common.vo.LolHeroVO;
import com.zy.web.api.LolForceApi;
import com.zy.web.api.LolHeroApi;
import com.zy.web.api.LolProfessionApi;
import com.zy.web.api.LolRouteApi;
import com.zy.web.service.WebLolHeroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WebLolHeroServiceImpl implements WebLolHeroService {

    @Autowired
    private LolHeroApi lolHeroApi;

    @Autowired
    private LolForceApi lolForceApi;

    @Autowired
    private LolProfessionApi lolProfessionApi;

    @Autowired
    private LolRouteApi lolRouteApi;

    @Override
    public List<LolHeroVO> query(LolHero lolHero) {
        List<LolHero> lolHeroList = lolHeroApi.query(lolHero);
        if (CollectionUtils.isEmpty(lolHeroList)) {
            return Collections.EMPTY_LIST;
        }
        return lolHeroList.stream()
                .map(this::setValueToVO)
                .collect(Collectors.toList());
    }

    @Override
    public int insert(LolHero lolHero) {
        return isExist(lolHero) ? 0 : lolHeroApi.insert(lolHero);
    }

    @Override
    public int update(LolHero lolHero) {
        LolHero query = new LolHero();
        query.setId(lolHero.getId());
        return isExist(query) ? lolHeroApi.update(lolHero) : 0;
    }

    @Override
    public int delete(Long id) {
        LolHero lolHero = new LolHero();
        lolHero.setId(id);
        return isExist(lolHero) ? lolHeroApi.delete(id) : 0;
    }

    private Boolean isExist(LolHero lolHero) {
        // 先通过添加条件搜索是否已存在，为空说明数据一定不存在
        List<LolHero> lolHeroList = lolHeroApi.query(lolHero);
        if (CollectionUtils.isEmpty(lolHeroList)) {
            return false;
        }
        LolHero queryResult = lolHeroList.get(0);
        // 如果能查询到的数据是status == 1的，说明他是真的存在的（返回true），否则就是不存在的（返回false）
        return queryResult.getStatus() == 1;
    }

    private LolHeroVO setValueToVO(LolHero lolHero) {
        LolHeroVO lolHeroVO = new LolHeroVO();
        BeanUtils.copyProperties(lolHero, lolHeroVO);
        lolHeroVO.setId(lolHero.getId());
        // force
        LolForce lolForce = lolForceApi.queryById(lolHero.getForceId());
        if (!ObjectUtils.isEmpty(lolForce)) {
            lolHeroVO.setForceName(lolForce.getForceName());
        }

        // profession
        LolProfession lolProfessionOne = lolProfessionApi.queryById(lolHero.getProfessionOne());
        LolProfession lolProfessionTwo = lolProfessionApi.queryById(lolHero.getProfessionTwo());
        if (!ObjectUtils.isEmpty(lolProfessionOne)) {
            lolHeroVO.setProfessionNameOne(lolProfessionOne.getNameCn());
        }
        if (!ObjectUtils.isEmpty(lolProfessionTwo)) {
            lolHeroVO.setProfessionNameTwo(lolProfessionTwo.getNameCn());
        }

        // route
        LolRoute lolRouteOne = lolRouteApi.queryById(lolHero.getRouteOne());
        LolRoute lolRouteTwo = lolRouteApi.queryById(lolHero.getRouteTwo());
        if (!ObjectUtils.isEmpty(lolRouteOne)) {
            lolHeroVO.setRouteNameOne(lolRouteOne.getRouteName());
        }
        if (!ObjectUtils.isEmpty(lolRouteTwo)) {
            lolHeroVO.setRouteNameTwo(lolRouteTwo.getRouteName());
        }

        return lolHeroVO;
    }

}
