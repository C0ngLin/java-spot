package com.cl.spot.controller;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotBilibili;
import com.cl.spot.service.SpotBaiduService;
import com.cl.spot.service.SpotBilibiliService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/bilibili")
public class SpotBilibiliController {

    @Autowired
    private SpotBilibiliService spotBilibiliService;

    @CrossOrigin
    @GetMapping("list")
    public R getBilibili(){
        ArrayList<SpotBilibili> list = spotBilibiliService.getSpotbilibiliTop();
        return R.ok().put("bilibili",list);
    }
}
