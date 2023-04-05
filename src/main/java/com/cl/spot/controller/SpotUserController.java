package com.cl.spot.controller;

import com.cl.spot.DTO.SpotUserDTO;
import com.cl.spot.domain.SpotToutiao;
import com.cl.spot.domain.SpotUser;
import com.cl.spot.service.SpotToutiaoService;
import com.cl.spot.service.SpotUserService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Objects;

@RestController
@RequestMapping("spot/user")
public class SpotUserController {
    @Autowired
    private SpotUserService spotUserService;

    @CrossOrigin
    @PostMapping(value = "/login")
    public R Longin(@RequestParam("username") String name,
                    @RequestParam("password") String password) {
        ArrayList<SpotUser> passWordByName = spotUserService.getPassWordByName(name);
        if (Objects.equals(passWordByName.get(0).getUserName(), name) && Objects.equals(passWordByName.get(0).getUserPassword(), password))
            return R.ok().put("code",1);
        else {
            return R.ok().put("code",2);
        }
    }

    @CrossOrigin
    @PostMapping(value = "/login2")
    public R Longin2(@RequestBody SpotUserDTO spotUserDTO) {
        ArrayList<SpotUser> passWordByName = spotUserService.getPassWordByName(spotUserDTO.getUsername());
        if (Objects.equals(passWordByName.get(0).getUserName(), spotUserDTO.getUsername()) && Objects.equals(passWordByName.get(0).getUserPassword(), spotUserDTO.getPassword()))
            return R.ok().put("code", 1);
        else {
            return R.ok().put("code", 2);
        }
    }
}
