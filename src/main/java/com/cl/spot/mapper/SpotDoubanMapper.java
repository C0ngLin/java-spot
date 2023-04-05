package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotDouban;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_douban】的数据库操作Mapper
* @createDate 2022-12-04 12:55:14
* @Entity com.cl.spot.domain.SpotDouban
*/
public interface SpotDoubanMapper extends BaseMapper<SpotDouban> {

    @Select("select * from spot.spot_douban order by spot_douban_pk_id desc limit 10")
    ArrayList<SpotDouban> getSpotDoubanTop();

}




