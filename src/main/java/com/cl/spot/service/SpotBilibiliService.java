package com.cl.spot.service;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotBilibili;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_bilibili】的数据库操作Service
* @createDate 2022-12-04 12:55:14
*/
public interface SpotBilibiliService extends IService<SpotBilibili> {

    ArrayList<SpotBilibili> getSpotbilibiliTop();

}
