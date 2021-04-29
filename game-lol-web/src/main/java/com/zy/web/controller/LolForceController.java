package com.zy.web.controller;

import com.zy.common.entity.LolForce;
import com.zy.web.service.WebLolForceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lol/force")
public class LolForceController {

    @Autowired
    private WebLolForceService webLolForceService;

    @PostMapping("/query")
    public List<LolForce> query(@RequestBody LolForce lolForce) {
        return webLolForceService.query(lolForce);
    }

    @PostMapping("/insert")
    public int insert(@RequestBody LolForce lolForce) {
        return webLolForceService.insert(lolForce);
    }

    @PostMapping("/update")
    public int update(@RequestBody LolForce lolForce) {
        return webLolForceService.update(lolForce);
    }

    @PostMapping("/delete")
    public int delete(@RequestBody Long id) {
        return webLolForceService.delete(id);
    }

}
