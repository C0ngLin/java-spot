package com.cl.spot.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName spot_today
 */
@TableName(value ="spot_today")
@Data
public class SpotToday implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotTodayPkId;

    /**
     * 
     */
    private String spotTodayTitle;

    /**
     * 
     */
    private String spotTodayUrl;

    /**
     * 
     */
    private String spotTodayPort;

    /**
     * 
     */
    private Integer spotTodayIsDelete;

    /**
     * 
     */
    private Date spotTodayCreateTime;

    /**
     * 
     */
    private Date spotTodayUpdateTime;

    private String spotTodayZhishu;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SpotToday other = (SpotToday) that;
        return (this.getSpotTodayPkId() == null ? other.getSpotTodayPkId() == null : this.getSpotTodayPkId().equals(other.getSpotTodayPkId()))
            && (this.getSpotTodayTitle() == null ? other.getSpotTodayTitle() == null : this.getSpotTodayTitle().equals(other.getSpotTodayTitle()))
            && (this.getSpotTodayUrl() == null ? other.getSpotTodayUrl() == null : this.getSpotTodayUrl().equals(other.getSpotTodayUrl()))
            && (this.getSpotTodayPort() == null ? other.getSpotTodayPort() == null : this.getSpotTodayPort().equals(other.getSpotTodayPort()))
            && (this.getSpotTodayIsDelete() == null ? other.getSpotTodayIsDelete() == null : this.getSpotTodayIsDelete().equals(other.getSpotTodayIsDelete()))
            && (this.getSpotTodayCreateTime() == null ? other.getSpotTodayCreateTime() == null : this.getSpotTodayCreateTime().equals(other.getSpotTodayCreateTime()))
            && (this.getSpotTodayUpdateTime() == null ? other.getSpotTodayUpdateTime() == null : this.getSpotTodayUpdateTime().equals(other.getSpotTodayUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotTodayPkId() == null) ? 0 : getSpotTodayPkId().hashCode());
        result = prime * result + ((getSpotTodayTitle() == null) ? 0 : getSpotTodayTitle().hashCode());
        result = prime * result + ((getSpotTodayUrl() == null) ? 0 : getSpotTodayUrl().hashCode());
        result = prime * result + ((getSpotTodayPort() == null) ? 0 : getSpotTodayPort().hashCode());
        result = prime * result + ((getSpotTodayIsDelete() == null) ? 0 : getSpotTodayIsDelete().hashCode());
        result = prime * result + ((getSpotTodayCreateTime() == null) ? 0 : getSpotTodayCreateTime().hashCode());
        result = prime * result + ((getSpotTodayUpdateTime() == null) ? 0 : getSpotTodayUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotTodayPkId=").append(spotTodayPkId);
        sb.append(", spotTodayTitle=").append(spotTodayTitle);
        sb.append(", spotTodayUrl=").append(spotTodayUrl);
        sb.append(", spotTodayPort=").append(spotTodayPort);
        sb.append(", spotTodayIsDelete=").append(spotTodayIsDelete);
        sb.append(", spotTodayCreateTime=").append(spotTodayCreateTime);
        sb.append(", spotTodayUpdateTime=").append(spotTodayUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}