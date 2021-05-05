package com.zy.web.service.impl;

import com.zy.common.entity.Admin;
import com.zy.web.api.AdminApi;
import com.zy.web.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminApi adminApi;

    /**
     * 通过username查询Admin
     * @param username
     * @return
     */
    @Override
    public Admin getByUserName(String username) {
        return adminApi.query(username);
    }
}
