package com.zy.web.service;

import com.zy.common.entity.Admin;

public interface AdminService {

    /**
     * 通过username查询Admin
     * @param username
     * @return
     */
    Admin getByUserName(String username);

}
