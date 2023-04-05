package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotSleep;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_sleep】的数据库操作Mapper
* @createDate 2022-12-04 12:55:14
* @Entity com.cl.spot.domain.SpotSleep
*/
public interface SpotSleepMapper extends BaseMapper<SpotSleep> {

    @Select("select * from spot.spot_sleep order by spot_sleep_pk_id desc limit 10")
    ArrayList<SpotSleep> getSpotSleepTop();

}




