package com.zy.hero.rpc;

import com.zy.common.entity.LolHero;
import com.zy.hero.DO.LolHeroDO;
import com.zy.hero.service.LolHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/hero")
public class LolHeroRest {

    @Autowired
    private LolHeroService lolHeroService;

    @GetMapping("/query")
    public String query() {
        LolHeroDO lolHeroDO = new LolHeroDO();
        lolHeroDO.setId(3L);
        List<LolHero> lolHeroList = lolHeroService.query(lolHeroDO);
        System.out.println(lolHeroList);
        return "true";
    }

}
