package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotDouban;
import com.cl.spot.mapper.SpotBilibiliMapper;
import com.cl.spot.service.SpotDoubanService;
import com.cl.spot.mapper.SpotDoubanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author admin1
 * @description 针对表【spot_douban】的数据库操作Service实现
 * @createDate 2022-12-04 12:55:14
 */
@Service
public class SpotDoubanServiceImpl extends ServiceImpl<SpotDoubanMapper, SpotDouban>
        implements SpotDoubanService {

    @Autowired
    SpotDoubanMapper spotDoubanMapper;

    @Override
    public ArrayList<SpotDouban> getSpotDouBanTop() {
        return spotDoubanMapper.getSpotDoubanTop();
    }
}




