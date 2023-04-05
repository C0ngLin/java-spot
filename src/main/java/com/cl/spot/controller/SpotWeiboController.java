package com.cl.spot.controller;

import com.cl.spot.domain.SpotToutiao;
import com.cl.spot.domain.SpotWeibo;
import com.cl.spot.service.SpotToutiaoService;
import com.cl.spot.service.SpotWeiboService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/weibo")
public class SpotWeiboController {
    @Autowired
    private SpotWeiboService spotWeiboService;

    @CrossOrigin
    @GetMapping("list")
    public R getWeiBo(){
        ArrayList<SpotWeibo> list = spotWeiboService.getSpotWeiBoTop();
        return R.ok().put("weibo",list);
    }
}
