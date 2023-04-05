package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotZhihu;
import com.cl.spot.mapper.SpotWeiboMapper;
import com.cl.spot.service.SpotZhihuService;
import com.cl.spot.mapper.SpotZhihuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_zhihu】的数据库操作Service实现
* @createDate 2022-12-04 12:55:14
*/
@Service
public class SpotZhihuServiceImpl extends ServiceImpl<SpotZhihuMapper, SpotZhihu>
    implements SpotZhihuService{

    @Autowired
    SpotZhihuMapper spotZhihuMapper;

    @Override
    public ArrayList<SpotZhihu> getSpotZhiHuTop() {
        return spotZhihuMapper.getSpotZhihuTop();
    }
}




