package com.cl.spot.controller;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotDouban;
import com.cl.spot.service.SpotBaiduService;
import com.cl.spot.service.SpotDoubanService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/douban")
public class SpotDoubanController {
    @Autowired
    private SpotDoubanService spotDoubanService;

    @CrossOrigin
    @GetMapping("list")
    public R getDouBan(){
        ArrayList<SpotDouban> list = spotDoubanService.getSpotDouBanTop();
        return R.ok().put("douban",list);
    }
}
