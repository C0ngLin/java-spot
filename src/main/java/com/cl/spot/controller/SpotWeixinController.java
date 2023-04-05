package com.cl.spot.controller;

import com.cl.spot.domain.SpotWeibo;
import com.cl.spot.domain.SpotWeixin;
import com.cl.spot.service.SpotWeiboService;
import com.cl.spot.service.SpotWeixinService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/weixin")
public class SpotWeixinController {
    @Autowired
    private SpotWeixinService spotWeixinService;

    @CrossOrigin
    @GetMapping("list")
    public R getWeiXin(){
        ArrayList<SpotWeixin> list = spotWeixinService.getSpotWeiXinTop();
        return R.ok().put("weixin",list);
    }
}
