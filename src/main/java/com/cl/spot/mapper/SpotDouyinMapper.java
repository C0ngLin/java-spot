package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotDouyin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_douyin】的数据库操作Mapper
* @createDate 2022-12-04 12:55:14
* @Entity com.cl.spot.domain.SpotDouyin
*/
public interface SpotDouyinMapper extends BaseMapper<SpotDouyin> {

    @Select("select * from spot.spot_douyin order by spot_douyin_pk_id desc limit 50")
    ArrayList<SpotDouyin> getSpotDouyinTop();

}
