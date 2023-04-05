package com.cl.spot.controller;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.service.SpotBaiduService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/baidu")
public class SpotBaiduController {

    @Autowired
    private SpotBaiduService spotBaiduService;

    @CrossOrigin
    @GetMapping("list")
    public R getBaiDu(){
        ArrayList<SpotBaidu> list = spotBaiduService.getSpotBaiDuTop();
        return R.ok().put("baidu",list);
    }
}
