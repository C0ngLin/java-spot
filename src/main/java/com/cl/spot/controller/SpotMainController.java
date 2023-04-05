package com.cl.spot.controller;

import com.cl.spot.domain.SpotMain;
import com.cl.spot.service.SpotMainService;
import com.cl.spot.utlis.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("spot/m")
public class SpotMainController {

    @Autowired
    private SpotMainService spotMainService;

//    @CrossOrigin
//    @GetMapping("list")
//    public R getYinNianTop() {
//        ArrayList<SpotMain> list = spotMainService.getSpotyinianto();
//        return R.ok().put("data", list);
//    }

    //    热度 日 周 月 季 年 榜
    @CrossOrigin
    @GetMapping("reDuRiBang")
    public R reDuRiBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotReDuRiBang();
        return R.ok().put("data", list);
    }

    @CrossOrigin
    @GetMapping("reDuZhouBang")
    public R reDuZhouBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotReDuZhouBang();
        return R.ok().put("data", list);
    }

    @CrossOrigin
    @GetMapping("reDuYueBang")
    public R reDuYueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotReDuYueBang();
        return R.ok().put("data", list);
    }

    @CrossOrigin
    @GetMapping("reDuJiBang")
    public R reDuJiBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotReDuJiBang();
        return R.ok().put("data", list);
    }

    @CrossOrigin
    @GetMapping("reDuNianBang")
    public R reDuNianBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotReDuNianBang();
        return R.ok().put("data", list);
    }

    //    地区 日榜 月榜 年榜 x5
    @CrossOrigin
    @GetMapping("area1RiBang")
    public R area1RiBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea1RiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("area1YueBang")
    public R area1ZhouBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea1YueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("area1NianBang")
    public R area1YueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea1NianBang();
        return R.ok().put("data", list);
    }


    @CrossOrigin
    @GetMapping("area2RiBang")
    public R area2RiBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea2RiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("area2YueBang")
    public R area2ZhouBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea2YueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("area2NianBang")
    public R area2YueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea2NianBang();
        return R.ok().put("data", list);
    }


    @CrossOrigin
    @GetMapping("area3RiBang")
    public R area3RiBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea3RiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("area3YueBang")
    public R area3ZhouBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea3YueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("area3NianBang")
    public R area3YueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea3NianBang();
        return R.ok().put("data", list);
    }


    @CrossOrigin
    @GetMapping("area4RiBang")
    public R area4RiBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea4RiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("area4YueBang")
    public R area4ZhouBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea4YueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("area4NianBang")
    public R area4YueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea4NianBang();
        return R.ok().put("data", list);
    }


    @CrossOrigin
    @GetMapping("area5RiBang")
    public R area5RiBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea5RiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("area5YueBang")
    public R area5ZhouBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea5YueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("area5NianBang")
    public R area5YueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotArea5NianBang();
        return R.ok().put("data", list);
    }

//    分类 日 月 年 榜 x5

    @CrossOrigin
    @GetMapping("sort1Ribang")
    public R sort1Ribang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort1RiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("sort1YueBang")
    public R sort1YueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort1YueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("sort1NianBang")
    public R sort1NianBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort1NianBang();
        return R.ok().put("data", list);
    }

    @CrossOrigin
    @GetMapping("sort2Ribang")
    public R sort2Ribang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort2RiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("sort2YueBang")
    public R sort2YueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort2YueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("sort2NianBang")
    public R sort2NianBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort2NianBang();
        return R.ok().put("data", list);
    }

    @CrossOrigin
    @GetMapping("sort3Ribang")
    public R sort3Ribang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort3RiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("sort3YueBang")
    public R sort3YueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort3YueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("sort3NianBang")
    public R sort3NianBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort3NianBang();
        return R.ok().put("data", list);
    }

    @CrossOrigin
    @GetMapping("sort4Ribang")
    public R sort4Ribang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort4RiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("sort4YueBang")
    public R sort4YueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort4YueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("sort4NianBang")
    public R sort4NianBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort4NianBang();
        return R.ok().put("data", list);
    }

    @CrossOrigin
    @GetMapping("sort5Ribang")
    public R sort5Ribang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort5RiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("sort5YueBang")
    public R sort5YueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort5YueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("sort5NianBang")
    public R sort5NianBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotSort5NianBang();
        return R.ok().put("data", list);
    }

//    点赞 评论 转发 日 月 年 榜

    @CrossOrigin
    @GetMapping("pingLunRiBang")
    public R pingLunRiBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotPingLunRiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("pingLunYueBang")
    public R pingLunYueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotPingLunYueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("pingLunNianBang")
    public R pingLunNianBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotPingLunNianBang();
        return R.ok().put("data", list);
    }

    @CrossOrigin
    @GetMapping("dianZanRiBang")
    public R dianZanRiBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotDianZanRiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("dianZanYueBang")
    public R dianZanYueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotDianZanYueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("dianZanNianBang")
    public R dianZanNianBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotDianZanNianBang();
        return R.ok().put("data", list);
    }

    @CrossOrigin
    @GetMapping("zhuanFaRiBang")
    public R zhuanFaRiBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotZhuanFaRiBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("zhuanFaYueBang")
    public R zhuanFaYueBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotZhuanFaYueBang();
        return R.ok().put("data", list);
    }
    @CrossOrigin
    @GetMapping("zhuanFaNianBang")
    public R zhuanFaNianBang() {
        ArrayList<SpotMain> list = spotMainService.getSpotZhuanFaNianBang();
        return R.ok().put("data", list);
    }


}
