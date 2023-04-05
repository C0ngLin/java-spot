package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotKe;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * @author admin1
 * @description 针对表【spot_ke】的数据库操作Mapper
 * @createDate 2022-12-04 12:55:14
 * @Entity com.cl.spot.domain.SpotKe
 */
public interface SpotKeMapper extends BaseMapper<SpotKe> {

    @Select("select * from spot.spot_ke order by spot_ke_pk_id desc limit 10")
    ArrayList<SpotKe> getSpotKeTop();

}
