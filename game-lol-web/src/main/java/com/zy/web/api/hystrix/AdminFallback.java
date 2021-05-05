package com.zy.web.api.hystrix;

import com.zy.common.entity.Admin;
import com.zy.web.api.AdminApi;

public class AdminFallback implements AdminApi {

    @Override
    public Admin query(String username) {
        return null;
    }

}
