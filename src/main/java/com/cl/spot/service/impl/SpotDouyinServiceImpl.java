package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotDouyin;
import com.cl.spot.service.SpotDouyinService;
import com.cl.spot.mapper.SpotDouyinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_douyin】的数据库操作Service实现
* @createDate 2022-12-04 12:55:14
*/
@Service
public class SpotDouyinServiceImpl extends ServiceImpl<SpotDouyinMapper, SpotDouyin>
    implements SpotDouyinService{

    @Autowired
    SpotDouyinMapper spotDouyinMapper;

    @Override
    public ArrayList<SpotDouyin> getSpotDouYinTop() {
        return spotDouyinMapper.getSpotDouyinTop();
    }
}




