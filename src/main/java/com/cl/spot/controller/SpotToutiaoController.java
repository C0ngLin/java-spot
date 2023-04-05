package com.cl.spot.controller;

import com.cl.spot.domain.SpotToday;
import com.cl.spot.domain.SpotToutiao;
import com.cl.spot.service.SpotTodayService;
import com.cl.spot.service.SpotToutiaoService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/toutiao")
public class SpotToutiaoController {
    @Autowired
    private SpotToutiaoService spotToutiaoService;

    @CrossOrigin
    @GetMapping("list")
    public R getTouTiao(){
        ArrayList<SpotToutiao> list = spotToutiaoService.getSpotTouTiaoTop();
        return R.ok().put("toutiao",list);
    }
}
