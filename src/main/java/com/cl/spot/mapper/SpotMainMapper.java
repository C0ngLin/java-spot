package com.cl.spot.mapper;

import com.cl.spot.domain.SpotMain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cl.spot.domain.SpotPengpai;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * @author admin1
 * @description 针对表【spot_main】的数据库操作Mapper
 * @createDate 2023-02-23 06:15:57
 * @Entity com.cl.spot.domain.SpotMain
 */
public interface SpotMainMapper extends BaseMapper<SpotMain> {

    //    最近一天内热度排名10
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainTianTop();

    //    最近一周内热度排名20
    @Select("select * from spot.spot_main WHERE YEARWEEK(date_format(spot_main_date,'%Y-%m-%d')) = YEARWEEK(now()) ORDER BY spot_main_hot DESC LIMIT 20;")
    ArrayList<SpotMain> getSpotMainZhouTop();

    //    最近一月内热度排名30
    @Select("select * from spot.spot_main WHERE DATE_FORMAT(spot_main_date, '%Y%m') = DATE_FORMAT(CURDATE(), '%Y%m') ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainYueTop();

    //    最近一季内热度排名50
    @Select("select * from spot.spot_main where QUARTER(spot_main_date)=QUARTER(now()) ORDER BY spot_main_hot DESC LIMIT 50;")
    ArrayList<SpotMain> getSpotMainJiDuTop();

    //    最近一年内热度排名100
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainNianTop();

    //    地区1热度排名10 今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) and spot_main_area = 1 ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainArea1TianTop();

    //    地区2热度排名10 今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) and spot_main_area = 2 ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainArea2TianTop();

    //    地区3热度排名10 今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) and spot_main_area = 3 ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainArea3TianTop();

    //    地区4热度排名10 今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) and spot_main_area = 4 ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainArea4TianTop();

    //    地区5热度排名10 今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) and spot_main_area = 5 ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainArea5TianTop();

    //    地区1热度排名10 本月
    @Select("select * from spot.spot_main WHERE DATE_FORMAT(spot_main_date, '%Y%m') = DATE_FORMAT(CURDATE(), '%Y%m') and spot_main_area = 1 ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainArea1YueTop();

    //    地区2热度排名10 本月
    @Select("select * from spot.spot_main WHERE DATE_FORMAT(spot_main_date, '%Y%m') = DATE_FORMAT(CURDATE(), '%Y%m') and spot_main_area = 2 ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainArea2YueTop();

    //    地区3热度排名10 本月
    @Select("select * from spot.spot_main WHERE DATE_FORMAT(spot_main_date, '%Y%m') = DATE_FORMAT(CURDATE(), '%Y%m') and spot_main_area = 3 ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainArea3YueTop();

    //    地区4热度排名10 本月
    @Select("select * from spot.spot_main WHERE DATE_FORMAT(spot_main_date, '%Y%m') = DATE_FORMAT(CURDATE(), '%Y%m') and spot_main_area = 4 ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainArea4YueTop();

    //    地区5热度排名10 本月
    @Select("select * from spot.spot_main WHERE DATE_FORMAT(spot_main_date, '%Y%m') = DATE_FORMAT(CURDATE(), '%Y%m') and spot_main_area = 5 ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainArea5YueTop();

    //    地区1年榜
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) and spot_main_area = 1 ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainArea1NianTop();

    //    地区2年榜
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) and spot_main_area = 2 ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainArea2NianTop();

    //    地区3年榜
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) and spot_main_area = 3 ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainArea3NianTop();

    //    地区4年榜
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) and spot_main_area = 4 ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainArea4NianTop();

    //    地区5年榜
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) and spot_main_area = 5 ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainArea5NianTop();

    //    分区1热度排名10 今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) and spot_main_sort = 1 ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainSort1TianTop();

    //    分区2热度排名10 今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) and spot_main_sort = 1 ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainSort2TianTop();

    //    分区3热度排名10 今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) and spot_main_sort = 1 ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainSort3TianTop();

    //    分区4热度排名10 今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) and spot_main_sort = 1 ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainSort4TianTop();

    //    分区5热度排名10 今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) and spot_main_sort = 1 ORDER BY spot_main_hot DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainSort5TianTop();

    //    分区1热度排名10 本月
    @Select("select * from spot.spot_main WHERE YEARWEEK(date_format(spot_main_date,'%Y-%m-%d')) = YEARWEEK(now()) and spot_main_sort = 1 ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainSort1YueTop();

    //    分区2热度排名10 本月
    @Select("select * from spot.spot_main WHERE YEARWEEK(date_format(spot_main_date,'%Y-%m-%d')) = YEARWEEK(now()) and spot_main_sort = 2 ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainSort2YueTop();

    //    分区3热度排名10 本月
    @Select("select * from spot.spot_main WHERE YEARWEEK(date_format(spot_main_date,'%Y-%m-%d')) = YEARWEEK(now()) and spot_main_sort = 3 ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainSort3YueTop();

    //    分区4热度排名10 本月
    @Select("select * from spot.spot_main WHERE YEARWEEK(date_format(spot_main_date,'%Y-%m-%d')) = YEARWEEK(now()) and spot_main_sort = 4 ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainSort4YueTop();

    //    分区5热度排名10 本月
    @Select("select * from spot.spot_main WHERE YEARWEEK(date_format(spot_main_date,'%Y-%m-%d')) = YEARWEEK(now()) and spot_main_sort = 5 ORDER BY spot_main_hot DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainSort5YueTop();

    //    分区1热度年榜
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) and spot_main_sort = 1 ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainSort1NianTop();

    //    分区2热度年榜
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) and spot_main_sort = 2 ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainSort2NianTop();

    //    分区3热度年榜
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) and spot_main_sort = 3 ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainSort3NianTop();

    //    分区4热度年榜
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) and spot_main_sort = 4 ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainSort4NianTop();

    //    分区5热度年榜
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) and spot_main_sort = 5 ORDER BY spot_main_hot DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainSort5NianTop();

    //    转发榜今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) ORDER BY spot_main_dianzan DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainZhuangFaTianTop();

    //    点赞榜今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) ORDER BY spot_main_dianzan DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainDianZanTianTop();

    //    评论榜今天
    @Select("select * from spot.spot_main WHERE to_days(spot_main_date) = to_days(now()) ORDER BY spot_main_dianzan DESC LIMIT 10;")
    ArrayList<SpotMain> getSpotMainPingLunTianTop();

    //    转发榜本月
    @Select("select * from spot.spot_main WHERE YEARWEEK(date_format(spot_main_date,'%Y-%m-%d')) = YEARWEEK(now()) ORDER BY spot_main_dianzan DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainZhuangFaYueTop();

    //    点赞榜本月
    @Select("select * from spot.spot_main WHERE YEARWEEK(date_format(spot_main_date,'%Y-%m-%d')) = YEARWEEK(now()) ORDER BY spot_main_dianzan DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainDianZanYueTop();

    //    评论榜本月
    @Select("select * from spot.spot_main WHERE YEARWEEK(date_format(spot_main_date,'%Y-%m-%d')) = YEARWEEK(now()) ORDER BY spot_main_dianzan DESC LIMIT 30;")
    ArrayList<SpotMain> getSpotMainPingLunYueTop();

    //    转发榜本年
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) ORDER BY spot_main_dianzan DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainZhuangFaNianTop();

    //    点赞榜本年
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) ORDER BY spot_main_dianzan DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainDianZanNianTop();

    //    评论榜本年
    @Select("select * from spot.spot_main where YEAR(spot_main_date)=YEAR(NOW()) ORDER BY spot_main_dianzan DESC LIMIT 100;")
    ArrayList<SpotMain> getSpotMainPingLunNianTop();

}




