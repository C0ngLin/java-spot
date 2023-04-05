package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotZhihu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_zhihu】的数据库操作Mapper
* @createDate 2022-12-04 12:55:14
* @Entity com.cl.spot.domain.SpotZhihu
*/
public interface SpotZhihuMapper extends BaseMapper<SpotZhihu> {

    @Select("select * from spot.spot_zhihu order by spot_zhihu_pk_id desc limit 50")
    ArrayList<SpotZhihu> getSpotZhihuTop();

}




