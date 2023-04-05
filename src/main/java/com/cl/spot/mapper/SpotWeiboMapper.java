package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotWeibo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_weibo】的数据库操作Mapper
* @createDate 2022-12-04 12:55:14
* @Entity com.cl.spot.domain.SpotWeibo
*/
public interface SpotWeiboMapper extends BaseMapper<SpotWeibo> {

    @Select("select * from spot.spot_weibo order by spot_weibo_pk_id desc limit 50")
    ArrayList<SpotWeibo> getSpotWeiboTop();

}




