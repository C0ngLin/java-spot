package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotToutiao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_toutiao】的数据库操作Mapper
* @createDate 2022-12-04 12:55:14
* @Entity com.cl.spot.domain.SpotToutiao
*/
public interface SpotToutiaoMapper extends BaseMapper<SpotToutiao> {

    @Select("select * from spot.spot_toutiao order by spot_toutiao_pk_id desc limit 100")
    ArrayList<SpotToutiao> getSpotToutiaoTop();

}




