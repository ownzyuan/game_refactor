package com.zy.web.api;

import com.zy.common.entity.LolForce;
import com.zy.web.api.hystrix.LolForceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "lol-force", fallback = LolForceFallback.class)
public interface LolForceApi {

    @PostMapping("/api/force/query")
    List<LolForce> query(@RequestBody LolForce lolForce);

    @PostMapping("/api/force/queryById")
    LolForce queryById(@RequestBody Long id);

    @PostMapping("/api/force/insert")
    int insert(@RequestBody LolForce lolForce);

    @PostMapping("/api/force/update")
    int update(@RequestBody LolForce lolForce);

    @PostMapping("/api/force/delete")
    int delete(@RequestBody Long id);

}
