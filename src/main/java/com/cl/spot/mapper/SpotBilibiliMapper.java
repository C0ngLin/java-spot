package com.cl.spot.mapper;

import com.cl.spot.domain.SpotBaidu;
import com.cl.spot.domain.SpotBilibili;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * @author admin1
 * @description 针对表【spot_bilibili】的数据库操作Mapper
 * @createDate 2022-12-04 12:55:14
 * @Entity com.cl.spot.domain.SpotBilibili
 */
public interface SpotBilibiliMapper extends BaseMapper<SpotBilibili> {

    @Select("select * from spot.spot_bilibili order by spot_bilibili_pk_id desc limit 100")
    ArrayList<SpotBilibili> getSpotBilibiliTop();

}
