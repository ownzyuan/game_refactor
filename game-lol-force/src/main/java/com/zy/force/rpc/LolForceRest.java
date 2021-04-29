package com.zy.force.rpc;

import com.zy.common.entity.LolForce;
import com.zy.force.service.LolForceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.zy.force.utils.LolForceUtil.LolForceToDO;

@RestController
@RequestMapping(value = "/api/force")
public class LolForceRest {
    
    @Autowired
    private LolForceService lolForceService;
    
    @PostMapping("/query")
    public List<LolForce> query(@RequestBody LolForce lolForce) {
        return lolForceService.query(LolForceToDO(lolForce));
    }

    @PostMapping("/insert")
    public int insert(@RequestBody LolForce lolForce) {
        return lolForceService.insert(LolForceToDO(lolForce));
    }

    @PostMapping("/update")
    public int update(@RequestBody LolForce lolForce) {
        return lolForceService.update(LolForceToDO(lolForce));
    }

    @PostMapping("/delete")
    public int delete(@RequestBody Long id) {
        return lolForceService.delete(id);
    }
    
}
