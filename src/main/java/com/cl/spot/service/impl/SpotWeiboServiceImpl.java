package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotWeibo;
import com.cl.spot.service.SpotWeiboService;
import com.cl.spot.mapper.SpotWeiboMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_weibo】的数据库操作Service实现
* @createDate 2022-12-04 12:55:14
*/
@Service
public class SpotWeiboServiceImpl extends ServiceImpl<SpotWeiboMapper, SpotWeibo>
    implements SpotWeiboService{

    @Autowired
    SpotWeiboMapper spotWeiboMapper;

    @Override
    public ArrayList<SpotWeibo> getSpotWeiBoTop() {
        return spotWeiboMapper.getSpotWeiboTop();
    }
}




