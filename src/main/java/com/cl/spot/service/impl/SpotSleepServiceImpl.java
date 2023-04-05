package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotSleep;
import com.cl.spot.service.SpotSleepService;
import com.cl.spot.mapper.SpotSleepMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_sleep】的数据库操作Service实现
* @createDate 2022-12-04 12:55:14
*/
@Service
public class SpotSleepServiceImpl extends ServiceImpl<SpotSleepMapper, SpotSleep>
    implements SpotSleepService{

    @Autowired
    SpotSleepMapper spotSleepMapper;

    @Override
    public ArrayList<SpotSleep> getSpotSleepTop() {
        return spotSleepMapper.getSpotSleepTop();
    }
}




