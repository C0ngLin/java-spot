package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

/**
* @author admin1
* @description 针对表【spot_baidu】的数据库操作Mapper
* @createDate 2022-12-04 12:55:14
* @Entity com.cl.spot.domain.SpotBaidu
*/
public interface SpotBaiduMapper extends BaseMapper<SpotBaidu> {

    @Select("select * from spot.spot_baidu order by spot_baidu_pk_id desc limit 30")
    ArrayList<SpotBaidu> getSpotBaiDuTop();

}
