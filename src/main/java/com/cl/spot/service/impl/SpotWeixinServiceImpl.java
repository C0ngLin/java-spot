package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotWeixin;
import com.cl.spot.service.SpotWeixinService;
import com.cl.spot.mapper.SpotWeixinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_weixin】的数据库操作Service实现
* @createDate 2022-12-04 12:55:14
*/
@Service
public class SpotWeixinServiceImpl extends ServiceImpl<SpotWeixinMapper, SpotWeixin>
    implements SpotWeixinService{

    @Autowired
    SpotWeixinMapper spotWeixinMapper;

    @Override
    public ArrayList<SpotWeixin> getSpotWeiXinTop() {
        return spotWeixinMapper.getSpotWeixinTop();
    }
}




