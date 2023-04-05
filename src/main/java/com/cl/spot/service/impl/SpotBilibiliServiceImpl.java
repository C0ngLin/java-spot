package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotBilibili;
import com.cl.spot.mapper.SpotBaiduMapper;
import com.cl.spot.service.SpotBilibiliService;
import com.cl.spot.mapper.SpotBilibiliMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author admin1
 * @description 针对表【spot_bilibili】的数据库操作Service实现
 * @createDate 2022-12-04 12:55:14
 */
@Service
public class SpotBilibiliServiceImpl extends ServiceImpl<SpotBilibiliMapper, SpotBilibili>
        implements SpotBilibiliService {

    @Autowired
    SpotBilibiliMapper spotBilibiliMapper;

    @Override
    public ArrayList<SpotBilibili> getSpotbilibiliTop() {
        return spotBilibiliMapper.getSpotBilibiliTop();
    }
}




