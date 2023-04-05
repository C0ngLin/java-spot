package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotMain;
import com.cl.spot.service.SpotMainService;
import com.cl.spot.mapper.SpotMainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author admin1
 * @description 针对表【spot_main】的数据库操作Service实现
 * @createDate 2023-02-23 06:15:57
 */
@Service
public class SpotMainServiceImpl extends ServiceImpl<SpotMainMapper, SpotMain>
        implements SpotMainService {

    @Autowired
    SpotMainMapper spotMainMapper;
//热度榜单
    @Override
    public ArrayList<SpotMain> getSpotReDuRiBang() {
        return spotMainMapper.getSpotMainTianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotReDuZhouBang() {
        return spotMainMapper.getSpotMainZhouTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotReDuYueBang() {
        return spotMainMapper.getSpotMainYueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotReDuJiBang() {
        return spotMainMapper.getSpotMainJiDuTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotReDuNianBang() {
        return spotMainMapper.getSpotMainNianTop();
    }
//地区榜单
    @Override
    public ArrayList<SpotMain> getSpotArea1RiBang() {
        return spotMainMapper.getSpotMainArea1TianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea1YueBang() {
        return spotMainMapper.getSpotMainArea1YueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea1NianBang() {
        return spotMainMapper.getSpotMainArea1NianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea2RiBang() {
        return spotMainMapper.getSpotMainArea2TianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea2YueBang() {
        return spotMainMapper.getSpotMainArea2YueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea2NianBang() {
        return spotMainMapper.getSpotMainArea2NianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea3RiBang() {
        return spotMainMapper.getSpotMainArea3TianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea3YueBang() {
        return spotMainMapper.getSpotMainArea3YueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea3NianBang() {
        return spotMainMapper.getSpotMainArea3NianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea4RiBang() {
        return spotMainMapper.getSpotMainArea4TianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea4YueBang() {
        return spotMainMapper.getSpotMainArea4YueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea4NianBang() {
        return spotMainMapper.getSpotMainArea4NianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea5RiBang() {
        return spotMainMapper.getSpotMainArea5TianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea5YueBang() {
        return spotMainMapper.getSpotMainArea5YueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotArea5NianBang() {
        return spotMainMapper.getSpotMainArea5NianTop();
    }

//品类榜单
    @Override
    public ArrayList<SpotMain> getSpotSort1RiBang() {
        return spotMainMapper.getSpotMainSort1TianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort1YueBang() {
        return spotMainMapper.getSpotMainSort1YueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort1NianBang() {
        return spotMainMapper.getSpotMainSort1NianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort2RiBang() {
        return spotMainMapper.getSpotMainSort2TianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort2YueBang() {
        return spotMainMapper.getSpotMainSort2YueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort2NianBang() {
        return spotMainMapper.getSpotMainSort2NianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort3RiBang() {
        return spotMainMapper.getSpotMainSort3TianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort3YueBang() {
        return spotMainMapper.getSpotMainSort3YueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort3NianBang() {
        return spotMainMapper.getSpotMainSort3NianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort4RiBang() {
        return spotMainMapper.getSpotMainSort4TianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort4YueBang() {
        return spotMainMapper.getSpotMainSort4YueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort4NianBang() {
        return spotMainMapper.getSpotMainSort4NianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort5RiBang() {
        return spotMainMapper.getSpotMainSort5TianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort5YueBang() {
        return spotMainMapper.getSpotMainSort5YueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotSort5NianBang() {
        return spotMainMapper.getSpotMainSort5NianTop();
    }

//    评论榜
    @Override
    public ArrayList<SpotMain> getSpotPingLunRiBang() {
        return spotMainMapper.getSpotMainPingLunTianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotPingLunYueBang() {
        return spotMainMapper.getSpotMainPingLunYueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotPingLunNianBang() {
        return spotMainMapper.getSpotMainPingLunNianTop();
    }

//    点赞榜
    @Override
    public ArrayList<SpotMain> getSpotDianZanRiBang() {
        return spotMainMapper.getSpotMainDianZanTianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotDianZanYueBang() {
        return spotMainMapper.getSpotMainDianZanYueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotDianZanNianBang() {
        return spotMainMapper.getSpotMainDianZanNianTop();
    }

//    转发榜
    @Override
    public ArrayList<SpotMain> getSpotZhuanFaRiBang() {
        return spotMainMapper.getSpotMainZhuangFaTianTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotZhuanFaYueBang() {
        return spotMainMapper.getSpotMainZhuangFaYueTop();
    }

    @Override
    public ArrayList<SpotMain> getSpotZhuanFaNianBang() {
        return spotMainMapper.getSpotMainZhuangFaNianTop();
    }
}




