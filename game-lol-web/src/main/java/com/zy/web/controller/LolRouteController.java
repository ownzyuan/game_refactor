package com.zy.web.controller;

import com.zy.common.entity.LolRoute;
import com.zy.web.service.WebLolRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lol/route")
public class LolRouteController {

    @Autowired
    private WebLolRouteService webLolRouteService;

    @PostMapping("/query")
    public List<LolRoute> query(@RequestBody LolRoute lolRoute) {
        return webLolRouteService.query(lolRoute);
    }

    @PostMapping("/insert")
    public int insert(@RequestBody LolRoute lolRoute) {
        return webLolRouteService.insert(lolRoute);
    }

    @PostMapping("/update")
    public int update(@RequestBody LolRoute lolRoute) {
        return webLolRouteService.update(lolRoute);
    }

    @PostMapping("/delete")
    public int delete(@RequestBody Long id) {
        return webLolRouteService.delete(id);
    }

}
