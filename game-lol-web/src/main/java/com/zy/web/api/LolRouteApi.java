package com.zy.web.api;

import com.zy.common.entity.LolRoute;
import com.zy.web.api.hystrix.LolRouteFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "lol-route", fallback = LolRouteFallback.class)
public interface LolRouteApi {

    @PostMapping("/api/route/query")
    List<LolRoute> query(@RequestBody LolRoute lolRoute);

    @PostMapping("/api/route/insert")
    int insert(@RequestBody LolRoute lolRoute);

    @PostMapping("/api/route/update")
    int update(@RequestBody LolRoute lolRoute);

    @PostMapping("/api/route/delete")
    int delete(@RequestBody Long id);

}
