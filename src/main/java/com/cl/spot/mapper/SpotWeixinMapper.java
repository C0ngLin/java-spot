package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotWeixin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_weixin】的数据库操作Mapper
* @createDate 2022-12-04 12:55:14
* @Entity com.cl.spot.domain.SpotWeixin
*/
public interface SpotWeixinMapper extends BaseMapper<SpotWeixin> {

    @Select("select * from spot.spot_weixin order by spot_weixin_pk_id desc limit 25")
    ArrayList<SpotWeixin> getSpotWeixinTop();

}




