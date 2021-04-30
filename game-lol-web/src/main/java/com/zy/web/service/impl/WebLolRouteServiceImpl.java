package com.zy.web.service.impl;

import com.zy.common.entity.LolRoute;
import com.zy.web.api.LolRouteApi;
import com.zy.web.service.WebLolRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Service
public class WebLolRouteServiceImpl implements WebLolRouteService {

    @Autowired
    private LolRouteApi lolRouteApi;

    @Override
    public List<LolRoute> query(LolRoute lolRoute) {
        List<LolRoute> lolRouteList = lolRouteApi.query(lolRoute);
        if (CollectionUtils.isEmpty(lolRouteList)) {
            return Collections.EMPTY_LIST;
        }
        return lolRouteList;
    }

    @Override
    public int insert(LolRoute lolRoute) {
        return isExist(lolRoute) ? 0 : lolRouteApi.insert(lolRoute);
    }

    @Override
    public int update(LolRoute lolRoute) {
        LolRoute query = new LolRoute();
        query.setId(lolRoute.getId());
        return isExist(query) ? lolRouteApi.update(lolRoute) : 0;
    }

    @Override
    public int delete(Long id) {
        LolRoute lolRoute = new LolRoute();
        lolRoute.setId(id);
        return isExist(lolRoute) ? lolRouteApi.delete(id) : 0;
    }

    private Boolean isExist(LolRoute lolRoute) {
        // 先通过添加条件搜索是否已存在，为空说明数据一定不存在
        List<LolRoute> lolRouteList = lolRouteApi.query(lolRoute);
        if (CollectionUtils.isEmpty(lolRouteList)) {
            return false;
        }
        LolRoute queryResult = lolRouteList.get(0);
        // 如果能查询到的数据是status == 1的，说明他是真的存在的（返回true），否则就是不存在的（返回false）
        return queryResult.getStatus() == 1;
    }

}
