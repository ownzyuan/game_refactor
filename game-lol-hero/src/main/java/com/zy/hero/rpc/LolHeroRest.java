package com.zy.hero.rpc;

import com.zy.common.entity.LolHero;
import com.zy.hero.service.LolHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.zy.hero.utils.LolHeroUtil.LolHeroToDO;

@RestController
@RequestMapping(value = "/api/hero")
public class LolHeroRest {

    @Autowired
    private LolHeroService lolHeroService;

    @PostMapping("/query")
    public List<LolHero> query(@RequestBody LolHero lolHero) {
        return lolHeroService.query(LolHeroToDO(lolHero));
    }

    @PostMapping("/insert")
    public int insert(@RequestBody LolHero lolHero) {
        return lolHeroService.insert(LolHeroToDO(lolHero));
    }

    @PostMapping("/update")
    public int update(@RequestBody LolHero lolHero) {
        return lolHeroService.update(LolHeroToDO(lolHero));
    }

    @GetMapping("/delete")
    public int delete(@RequestParam("id") Long id) {
        return lolHeroService.delete(id);
    }

}
