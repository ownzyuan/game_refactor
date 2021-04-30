package com.zy.web.service.impl;

import com.zy.common.entity.LolForce;
import com.zy.web.api.LolForceApi;
import com.zy.web.service.WebLolForceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Service
public class WebLolForceServiceImpl implements WebLolForceService {

    @Autowired
    private LolForceApi lolForceApi;

    @Override
    public List<LolForce> query(LolForce lolForce) {
        List<LolForce> lolForceList = lolForceApi.query(lolForce);
        if (CollectionUtils.isEmpty(lolForceList)) {
            return Collections.EMPTY_LIST;
        }
        return lolForceList;
    }

    @Override
    public int insert(LolForce lolForce) {
        return isExist(lolForce) ? 0 : lolForceApi.insert(lolForce);
    }

    @Override
    public int update(LolForce lolForce) {
        LolForce query = new LolForce();
        query.setId(lolForce.getId());
        return isExist(query) ? lolForceApi.update(lolForce) : 0;
    }

    @Override
    public int delete(Long id) {
        LolForce lolForce = new LolForce();
        lolForce.setId(id);
        return isExist(lolForce) ? lolForceApi.delete(id) : 0;
    }

    private Boolean isExist(LolForce lolForce) {
        // 先通过添加条件搜索是否已存在，为空说明数据一定不存在
        List<LolForce> lolForceList = lolForceApi.query(lolForce);
        if (CollectionUtils.isEmpty(lolForceList)) {
            return false;
        }
        LolForce queryResult = lolForceList.get(0);
        // 如果能查询到的数据是status == 1的，说明他是真的存在的（返回true），否则就是不存在的（返回false）
        return queryResult.getStatus() == 1;
    }

}
