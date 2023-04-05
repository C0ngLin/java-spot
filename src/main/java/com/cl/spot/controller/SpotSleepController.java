package com.cl.spot.controller;

import com.cl.spot.domain.SpotPengpai;
import com.cl.spot.domain.SpotSleep;
import com.cl.spot.service.SpotPengpaiService;
import com.cl.spot.service.SpotSleepService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/sleep")
public class SpotSleepController {
    @Autowired
    private SpotSleepService spotSleepService;

    @CrossOrigin
    @GetMapping("list")
    public R getSleep(){
        ArrayList<SpotSleep> list = spotSleepService.getSpotSleepTop();
        return R.ok().put("sleep",list);
    }
}
