package com.cl.spot.controller;

import com.cl.spot.domain.SpotDouyin;
import com.cl.spot.domain.SpotKe;
import com.cl.spot.service.SpotDouyinService;
import com.cl.spot.service.SpotKeService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/ke")
public class SpotKeController {
    @Autowired
    private SpotKeService spotKeService;

    @CrossOrigin
    @GetMapping("list")
    public R getKe(){
        ArrayList<SpotKe> list = spotKeService.getSpotKeTop();
        return R.ok().put("ke",list);
    }
}
