package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotPengpai;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_pengpai】的数据库操作Mapper
* @createDate 2022-12-04 12:55:14
* @Entity com.cl.spot.domain.SpotPengpai
*/
public interface SpotPengpaiMapper extends BaseMapper<SpotPengpai> {

    @Select("select * from spot.spot_pengpai order by spot_pengpai_pk_id desc limit 15")
    ArrayList<SpotPengpai> getSpotPengpaiTop();

}




