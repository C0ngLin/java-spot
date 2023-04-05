package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotToday;
import com.cl.spot.service.SpotTodayService;
import com.cl.spot.mapper.SpotTodayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_today】的数据库操作Service实现
* @createDate 2022-12-04 12:55:14
*/
@Service
public class SpotTodayServiceImpl extends ServiceImpl<SpotTodayMapper, SpotToday>
    implements SpotTodayService{

    @Autowired
    SpotTodayMapper spotTodayMapper;
    @Override
    public ArrayList<SpotToday> getSpotToDayTop() {
        return spotTodayMapper.getSpotTodayTop();
    }
}




