package com.cl.spot.controller;

import com.cl.spot.domain.SpotKe;
import com.cl.spot.domain.SpotPengpai;
import com.cl.spot.service.SpotKeService;
import com.cl.spot.service.SpotPengpaiService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/pengpai")
public class SpotPengpaiController {
    @Autowired
    private SpotPengpaiService spotPengpaiService;

    @CrossOrigin
    @GetMapping("list")
    public R getPengPai(){
        ArrayList<SpotPengpai> list = spotPengpaiService.getSpotPengPaiTop();
        return R.ok().put("pengpai",list);
    }
}
