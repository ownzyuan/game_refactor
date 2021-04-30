package com.zy.profession.rpc;

import com.zy.common.entity.LolProfession;
import com.zy.profession.service.LolProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.zy.profession.utils.LolProfessionUtil.LolProfessionToDO;


@RestController
@RequestMapping(value = "/api/profession")
public class LolProfessionRest {
    
    @Autowired
    private LolProfessionService lolProfessionService;
    
    @PostMapping("/query")
    public List<LolProfession> query(@RequestBody LolProfession lolProfession) {
        return lolProfessionService.query(LolProfessionToDO(lolProfession));
    }

    @PostMapping("/queryById")
    public LolProfession queryById(@RequestBody Long id) {
        LolProfession lolProfession = new LolProfession();
        lolProfession.setId(id);
        return lolProfessionService.query(LolProfessionToDO(lolProfession)).get(0);
    };

    @PostMapping("/insert")
    public int insert(@RequestBody LolProfession lolProfession) {
        return lolProfessionService.insert(LolProfessionToDO(lolProfession));
    }

    @PostMapping("/update")
    public int update(@RequestBody LolProfession lolProfession) {
        return lolProfessionService.update(LolProfessionToDO(lolProfession));
    }

    @PostMapping("/delete")
    public int delete(@RequestBody Long id) {
        return lolProfessionService.delete(id);
    }
    
}
