package com.zy.web.api;

import com.zy.common.entity.LolHero;
import com.zy.web.api.hystrix.LolHeroFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "lol-hero", fallback = LolHeroFallback.class)
public interface LolHeroApi {

    @PostMapping("/api/hero/query")
    List<LolHero> query(@RequestBody LolHero lolHero);

    @PostMapping("/api/hero/insert")
    int insert(@RequestBody LolHero lolHero);

    @PostMapping("/api/hero/update")
    int update(@RequestBody LolHero lolHero);

    @PostMapping("/api/hero/delete")
    int delete(@RequestBody Long id);

}
