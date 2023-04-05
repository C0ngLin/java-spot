package com.cl.spot.controller;

import com.cl.spot.domain.SpotWeixin;
import com.cl.spot.domain.SpotZhihu;
import com.cl.spot.service.SpotWeixinService;
import com.cl.spot.service.SpotZhihuService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/zhihu")
public class SpotZhihuController {
    @Autowired
    private SpotZhihuService spotZhihuService;

    @CrossOrigin
    @GetMapping("list")
    public R getZhiHu(){
        ArrayList<SpotZhihu> list = spotZhihuService.getSpotZhiHuTop();
        return R.ok().put("zhihu",list);
    }
}
