package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotToutiao;
import com.cl.spot.service.SpotToutiaoService;
import com.cl.spot.mapper.SpotToutiaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author admin1
 * @description 针对表【spot_toutiao】的数据库操作Service实现
 * @createDate 2022-12-04 12:55:14
 */
@Service
public class SpotToutiaoServiceImpl extends ServiceImpl<SpotToutiaoMapper, SpotToutiao>
        implements SpotToutiaoService {
    @Autowired
    SpotToutiaoMapper spotToutiaoMapper;
    @Override
    public ArrayList<SpotToutiao> getSpotTouTiaoTop() {
        return spotToutiaoMapper.getSpotToutiaoTop();
    }
}




