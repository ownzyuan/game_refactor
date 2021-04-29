package com.zy.route.rpc;

import com.zy.common.entity.LolRoute;
import com.zy.route.service.LolRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.zy.route.utils.LolRouteUtil.LolRouteToDO;


@RestController
@RequestMapping(value = "/api/route")
public class LolRouteRest {
    
    @Autowired
    private LolRouteService lolRouteService;
    
    @PostMapping("/query")
    public List<LolRoute> query(@RequestBody LolRoute lolRoute) {
        return lolRouteService.query(LolRouteToDO(lolRoute));
    }

    @PostMapping("/insert")
    public int insert(@RequestBody LolRoute lolRoute) {
        return lolRouteService.insert(LolRouteToDO(lolRoute));
    }

    @PostMapping("/update")
    public int update(@RequestBody LolRoute lolRoute) {
        return lolRouteService.update(LolRouteToDO(lolRoute));
    }

    @PostMapping("/delete")
    public int delete(@RequestBody Long id) {
        return lolRouteService.delete(id);
    }
    
}
