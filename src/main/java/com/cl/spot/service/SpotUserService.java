package com.cl.spot.service;

import com.cl.spot.domain.SpotToutiao;
import com.cl.spot.domain.SpotUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_user】的数据库操作Service
* @createDate 2023-02-14 12:28:21
*/
public interface SpotUserService extends IService<SpotUser> {


    ArrayList<SpotUser> getPassWordByName(String username);
}
