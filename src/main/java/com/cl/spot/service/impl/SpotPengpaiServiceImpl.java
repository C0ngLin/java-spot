package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotPengpai;
import com.cl.spot.service.SpotPengpaiService;
import com.cl.spot.mapper.SpotPengpaiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_pengpai】的数据库操作Service实现
* @createDate 2022-12-04 12:55:14
*/
@Service
public class SpotPengpaiServiceImpl extends ServiceImpl<SpotPengpaiMapper, SpotPengpai>
    implements SpotPengpaiService{

    @Autowired
    SpotPengpaiMapper spotPengpaiMapper;

    @Override
    public ArrayList<SpotPengpai> getSpotPengPaiTop() {
        return spotPengpaiMapper.getSpotPengpaiTop();
    }
}




