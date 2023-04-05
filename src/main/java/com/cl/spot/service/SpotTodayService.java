package com.cl.spot.service;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotToday;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_today】的数据库操作Service
* @createDate 2022-12-04 12:55:14
*/
public interface SpotTodayService extends IService<SpotToday> {

    ArrayList<SpotToday> getSpotToDayTop();

}
