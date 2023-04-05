package com.cl.spot.mapper;

import com.cl.spot.domain.SpotUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cl.spot.domain.SpotWeibo;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_user】的数据库操作Mapper
* @createDate 2023-02-14 12:28:20
* @Entity com.cl.spot.domain.SpotUser
*/
public interface SpotUserMapper extends BaseMapper<SpotUser> {

    @Select("select user_name,user_password from spot.spot_user where user_name = #{username}")
    ArrayList<SpotUser> loginVerification(String username);
}




