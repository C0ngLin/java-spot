package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotToday;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_today】的数据库操作Mapper
* @createDate 2022-12-04 12:55:14
* @Entity com.cl.spot.domain.SpotToday
*/
public interface SpotTodayMapper extends BaseMapper<SpotToday> {

    @Select("select * from spot.spot_today order by spot_today_pk_id desc limit 25")
    ArrayList<SpotToday> getSpotTodayTop();

}




