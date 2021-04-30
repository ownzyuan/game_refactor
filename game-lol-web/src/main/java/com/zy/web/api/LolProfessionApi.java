package com.zy.web.api;

import com.zy.common.entity.LolProfession;
import com.zy.web.api.hystrix.LolProfessionFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "lol-profession", fallback = LolProfessionFallback.class)
public interface LolProfessionApi {

    @PostMapping("/api/profession/query")
    List<LolProfession> query(@RequestBody LolProfession lolProfession);

    @PostMapping("/api/profession/queryById")
    LolProfession queryById(@RequestBody Long id);

    @PostMapping("/api/profession/insert")
    int insert(@RequestBody LolProfession lolProfession);

    @PostMapping("/api/profession/update")
    int update(@RequestBody LolProfession lolProfession);

    @PostMapping("/api/profession/delete")
    int delete(@RequestBody Long id);

}
