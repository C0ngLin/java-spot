package com.cl.spot.controller;

import com.cl.spot.domain.SpotTieba;
import com.cl.spot.domain.SpotToday;
import com.cl.spot.service.SpotTiebaService;
import com.cl.spot.service.SpotTodayService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/today")
public class SpotTodayController {
    @Autowired
    private SpotTodayService spotTodayService;

    @CrossOrigin
    @GetMapping("list")
    public R getToDay(){
        ArrayList<SpotToday> list = spotTodayService.getSpotToDayTop();
        return R.ok().put("today",list);
    }
}
