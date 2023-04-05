package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.Vo.BaiduVo;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.service.SpotBaiduService;
import com.cl.spot.mapper.SpotBaiduMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin1
 * @description 针对表【spot_baidu】的数据库操作Service实现
 * @createDate 2022-12-04 12:55:14
 */
@Service
public class SpotBaiduServiceImpl extends ServiceImpl<SpotBaiduMapper, SpotBaidu>
        implements SpotBaiduService {

    @Autowired
    SpotBaiduMapper spotBaiduMapper;

    @Override
    public ArrayList<SpotBaidu> getSpotBaiDuTop() {

        return spotBaiduMapper.getSpotBaiDuTop();

    }
}
