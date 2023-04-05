package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotKe;
import com.cl.spot.service.SpotKeService;
import com.cl.spot.mapper.SpotKeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_ke】的数据库操作Service实现
* @createDate 2022-12-04 12:55:14
*/
@Service
public class SpotKeServiceImpl extends ServiceImpl<SpotKeMapper, SpotKe>
    implements SpotKeService{

    @Autowired
    SpotKeMapper spotKeMapper;

    @Override
    public ArrayList<SpotKe> getSpotKeTop() {
        return spotKeMapper.getSpotKeTop();
    }
}




