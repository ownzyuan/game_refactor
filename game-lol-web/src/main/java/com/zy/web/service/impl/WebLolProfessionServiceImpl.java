package com.zy.web.service.impl;

import com.zy.common.entity.LolProfession;
import com.zy.web.api.LolProfessionApi;
import com.zy.web.service.WebLolProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Service
public class WebLolProfessionServiceImpl implements WebLolProfessionService {

    @Autowired
    private LolProfessionApi lolProfessionApi;

    @Override
    public List<LolProfession> query(LolProfession lolProfession) {
        List<LolProfession> lolProfessionList = lolProfessionApi.query(lolProfession);
        if (CollectionUtils.isEmpty(lolProfessionList)) {
            return Collections.EMPTY_LIST;
        }
        return lolProfessionList;
    }

    @Override
    public int insert(LolProfession lolProfession) {
        return isExist(lolProfession) ? 0 : lolProfessionApi.insert(lolProfession);
    }

    @Override
    public int update(LolProfession lolProfession) {
        LolProfession query = new LolProfession();
        query.setId(lolProfession.getId());
        return isExist(query) ? lolProfessionApi.update(lolProfession) : 0;
    }

    @Override
    public int delete(Long id) {
        LolProfession lolProfession = new LolProfession();
        lolProfession.setId(id);
        return isExist(lolProfession) ? lolProfessionApi.delete(id) : 0;
    }

    private Boolean isExist(LolProfession lolProfession) {
        // 先通过添加条件搜索是否已存在，为空说明数据一定不存在
        List<LolProfession> lolProfessionList = lolProfessionApi.query(lolProfession);
        if (CollectionUtils.isEmpty(lolProfessionList)) {
            return false;
        }
        LolProfession queryResult = lolProfessionList.get(0);
        // 如果能查询到的数据是status == 1的，说明他是真的存在的（返回true），否则就是不存在的（返回false）
        return queryResult.getStatus() == 1;
    }

}
