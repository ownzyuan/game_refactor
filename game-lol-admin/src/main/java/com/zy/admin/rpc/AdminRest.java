package com.zy.admin.rpc;

import com.zy.admin.mapper.AdminMapper;
import com.zy.common.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/admin")
public class AdminRest {

    @Autowired
    private AdminMapper adminMapper;

    @PostMapping("/query")
    public Admin query(@RequestBody String username) {
        return adminMapper.query(username);
    }

}
