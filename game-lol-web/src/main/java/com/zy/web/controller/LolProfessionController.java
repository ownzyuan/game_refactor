package com.zy.web.controller;

import com.zy.common.entity.LolProfession;
import com.zy.web.service.WebLolProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lol/profession")
public class LolProfessionController {

    @Autowired
    private WebLolProfessionService webLolProfessionService;

    @PostMapping("/query")
    public List<LolProfession> query(@RequestBody LolProfession lolProfession) {
        return webLolProfessionService.query(lolProfession);
    }

    @PostMapping("/insert")
    public int insert(@RequestBody LolProfession lolProfession) {
        return webLolProfessionService.insert(lolProfession);
    }

    @PostMapping("/update")
    public int update(@RequestBody LolProfession lolProfession) {
        return webLolProfessionService.update(lolProfession);
    }

    @PostMapping("/delete")
    public int delete(@RequestBody Long id) {
        return webLolProfessionService.delete(id);
    }

}
