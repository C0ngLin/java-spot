package com.cl.spot.service;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotMain;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_main】的数据库操作Service
* @createDate 2023-02-23 06:15:57
*/
public interface SpotMainService extends IService<SpotMain> {

    //    热度 日 周 月 季 年
    ArrayList<SpotMain> getSpotReDuRiBang();
    ArrayList<SpotMain> getSpotReDuZhouBang();
    ArrayList<SpotMain> getSpotReDuYueBang();
    ArrayList<SpotMain> getSpotReDuJiBang();
    ArrayList<SpotMain> getSpotReDuNianBang();
    //    地区 日 月 年 x5
    ArrayList<SpotMain> getSpotArea1RiBang();
    ArrayList<SpotMain> getSpotArea1YueBang();
    ArrayList<SpotMain> getSpotArea1NianBang();
    ArrayList<SpotMain> getSpotArea2RiBang();
    ArrayList<SpotMain> getSpotArea2YueBang();
    ArrayList<SpotMain> getSpotArea2NianBang();
    ArrayList<SpotMain> getSpotArea3RiBang();
    ArrayList<SpotMain> getSpotArea3YueBang();
    ArrayList<SpotMain> getSpotArea3NianBang();
    ArrayList<SpotMain> getSpotArea4RiBang();
    ArrayList<SpotMain> getSpotArea4YueBang();
    ArrayList<SpotMain> getSpotArea4NianBang();
    ArrayList<SpotMain> getSpotArea5RiBang();
    ArrayList<SpotMain> getSpotArea5YueBang();
    ArrayList<SpotMain> getSpotArea5NianBang();

    //    分区 日 月 年 x5

    ArrayList<SpotMain> getSpotSort1RiBang();
    ArrayList<SpotMain> getSpotSort1YueBang();
    ArrayList<SpotMain> getSpotSort1NianBang();
    ArrayList<SpotMain> getSpotSort2RiBang();
    ArrayList<SpotMain> getSpotSort2YueBang();
    ArrayList<SpotMain> getSpotSort2NianBang();
    ArrayList<SpotMain> getSpotSort3RiBang();
    ArrayList<SpotMain> getSpotSort3YueBang();
    ArrayList<SpotMain> getSpotSort3NianBang();
    ArrayList<SpotMain> getSpotSort4RiBang();
    ArrayList<SpotMain> getSpotSort4YueBang();
    ArrayList<SpotMain> getSpotSort4NianBang();
    ArrayList<SpotMain> getSpotSort5RiBang();
    ArrayList<SpotMain> getSpotSort5YueBang();
    ArrayList<SpotMain> getSpotSort5NianBang();

    //    评论 点赞 转发 日 月 年
    ArrayList<SpotMain> getSpotPingLunRiBang();
    ArrayList<SpotMain> getSpotPingLunYueBang();
    ArrayList<SpotMain> getSpotPingLunNianBang();
    ArrayList<SpotMain> getSpotDianZanRiBang();
    ArrayList<SpotMain> getSpotDianZanYueBang();
    ArrayList<SpotMain> getSpotDianZanNianBang();
    ArrayList<SpotMain> getSpotZhuanFaRiBang();
    ArrayList<SpotMain> getSpotZhuanFaYueBang();
    ArrayList<SpotMain> getSpotZhuanFaNianBang();


}
