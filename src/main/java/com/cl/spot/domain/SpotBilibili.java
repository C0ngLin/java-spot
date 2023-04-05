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
 * @TableName spot_bilibili
 */
@TableName(value ="spot_bilibili")
@Data
public class SpotBilibili implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotBilibiliPkId;

    /**
     * 
     */
    private String spotBilibiliTitle;

    /**
     * 
     */
    private String spotBilibiliUrl;

    /**
     * 
     */
    private String spotBilibiliPort;

    /**
     * 
     */
    private Integer spotBilibiliIsDelete;

    /**
     * 
     */
    private Date spotBilibiliCreateTime;

    /**
     * 
     */
    private Date spotBilibiliUpdateTime;

    private String spotBilibiliZhishu;

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
        SpotBilibili other = (SpotBilibili) that;
        return (this.getSpotBilibiliPkId() == null ? other.getSpotBilibiliPkId() == null : this.getSpotBilibiliPkId().equals(other.getSpotBilibiliPkId()))
            && (this.getSpotBilibiliTitle() == null ? other.getSpotBilibiliTitle() == null : this.getSpotBilibiliTitle().equals(other.getSpotBilibiliTitle()))
            && (this.getSpotBilibiliUrl() == null ? other.getSpotBilibiliUrl() == null : this.getSpotBilibiliUrl().equals(other.getSpotBilibiliUrl()))
            && (this.getSpotBilibiliPort() == null ? other.getSpotBilibiliPort() == null : this.getSpotBilibiliPort().equals(other.getSpotBilibiliPort()))
            && (this.getSpotBilibiliIsDelete() == null ? other.getSpotBilibiliIsDelete() == null : this.getSpotBilibiliIsDelete().equals(other.getSpotBilibiliIsDelete()))
            && (this.getSpotBilibiliCreateTime() == null ? other.getSpotBilibiliCreateTime() == null : this.getSpotBilibiliCreateTime().equals(other.getSpotBilibiliCreateTime()))
            && (this.getSpotBilibiliUpdateTime() == null ? other.getSpotBilibiliUpdateTime() == null : this.getSpotBilibiliUpdateTime().equals(other.getSpotBilibiliUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotBilibiliPkId() == null) ? 0 : getSpotBilibiliPkId().hashCode());
        result = prime * result + ((getSpotBilibiliTitle() == null) ? 0 : getSpotBilibiliTitle().hashCode());
        result = prime * result + ((getSpotBilibiliUrl() == null) ? 0 : getSpotBilibiliUrl().hashCode());
        result = prime * result + ((getSpotBilibiliPort() == null) ? 0 : getSpotBilibiliPort().hashCode());
        result = prime * result + ((getSpotBilibiliIsDelete() == null) ? 0 : getSpotBilibiliIsDelete().hashCode());
        result = prime * result + ((getSpotBilibiliCreateTime() == null) ? 0 : getSpotBilibiliCreateTime().hashCode());
        result = prime * result + ((getSpotBilibiliUpdateTime() == null) ? 0 : getSpotBilibiliUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotBilibiliPkId=").append(spotBilibiliPkId);
        sb.append(", spotBilibiliTitle=").append(spotBilibiliTitle);
        sb.append(", spotBilibiliUrl=").append(spotBilibiliUrl);
        sb.append(", spotBilibiliPort=").append(spotBilibiliPort);
        sb.append(", spotBilibiliIsDelete=").append(spotBilibiliIsDelete);
        sb.append(", spotBilibiliCreateTime=").append(spotBilibiliCreateTime);
        sb.append(", spotBilibiliUpdateTime=").append(spotBilibiliUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}