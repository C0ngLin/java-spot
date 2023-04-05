package com.cl.spot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.spot.domain.SpotUser;
import com.cl.spot.service.SpotUserService;
import com.cl.spot.mapper.SpotUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
* @author admin1
* @description 针对表【spot_user】的数据库操作Service实现
* @createDate 2023-02-14 12:28:21
*/
@Service
public class SpotUserServiceImpl extends ServiceImpl<SpotUserMapper, SpotUser>
    implements SpotUserService{

    @Autowired
    SpotUserMapper spotUserMapper;

    @Override
    public ArrayList<SpotUser> getPassWordByName(String username) {
        return spotUserMapper.loginVerification(username);
    }

}




