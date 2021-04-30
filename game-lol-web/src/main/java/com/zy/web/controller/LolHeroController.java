package com.zy.web.controller;

import com.zy.common.entity.LolHero;
import com.zy.common.vo.LolHeroVO;
import com.zy.web.service.WebLolHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lol/hero")
public class LolHeroController {

    @Autowired
    private WebLolHeroService webLolHeroService;

    @PostMapping("/query")
    public List<LolHeroVO> query(@RequestBody LolHero lolHero) {
        return webLolHeroService.query(lolHero);
    }

    @PostMapping("/insert")
    public int insert(@RequestBody LolHero lolHero) {
        return webLolHeroService.insert(lolHero);
    }

    @PostMapping("/update")
    public int update(@RequestBody LolHero lolHero) {
        return webLolHeroService.update(lolHero);
    }

    @PostMapping("/delete")
    public int delete(@RequestBody Long id) {
        return webLolHeroService.delete(id);
    }

}
