package com.cl.spot.controller;

import com.cl.spot.domain.SpotSleep;
import com.cl.spot.domain.SpotTieba;
import com.cl.spot.service.SpotSleepService;
import com.cl.spot.service.SpotTiebaService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/tieba")
public class SpotTiebaController {
    @Autowired
    private SpotTiebaService spotTiebaService;

    @CrossOrigin
    @GetMapping("list")
    public R getTieBa(){
        ArrayList<SpotTieba> list = spotTiebaService.getSpotTieBaTop();
        return R.ok().put("tieba",list);
    }
}
