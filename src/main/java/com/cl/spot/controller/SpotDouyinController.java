package com.cl.spot.controller;

import com.cl.spot.domain.SpotDouban;
import com.cl.spot.domain.SpotDouyin;
import com.cl.spot.service.SpotDoubanService;
import com.cl.spot.service.SpotDouyinService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/douyin")
public class SpotDouyinController {
    @Autowired
    private SpotDouyinService spotDouyinService;

    @CrossOrigin
    @GetMapping("list")
    public R getDouYin(){
        ArrayList<SpotDouyin> list = spotDouyinService.getSpotDouYinTop();
        return R.ok().put("douyin",list);
    }
}
