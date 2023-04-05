package com.cl.spot.service;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotPengpai;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_pengpai】的数据库操作Service
* @createDate 2022-12-04 12:55:14
*/
public interface SpotPengpaiService extends IService<SpotPengpai> {

    ArrayList<SpotPengpai> getSpotPengPaiTop();

}
