package com.zy.web.api;

import com.zy.common.entity.Admin;
import com.zy.web.api.hystrix.AdminFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "lol-admin", fallback = AdminFallback.class)
public interface AdminApi {

    @PostMapping("/api/admin/query")
    Admin query(@RequestBody String username);

}
