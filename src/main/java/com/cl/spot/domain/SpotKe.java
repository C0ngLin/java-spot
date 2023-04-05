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
 * @TableName spot_ke
 */
@TableName(value ="spot_ke")
@Data
public class SpotKe implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotKePkId;

    /**
     * 
     */
    private String spotKeTitle;

    /**
     * 
     */
    private String spotKeUrl;

    /**
     * 
     */
    private String spotKePort;

    /**
     * 
     */
    private Integer spotKeIsDelete;

    /**
     * 
     */
    private Date spotKeCreateTime;

    /**
     * 
     */
    private Date spotKeUpdateTime;

    private String spotKeZhishu;

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
        SpotKe other = (SpotKe) that;
        return (this.getSpotKePkId() == null ? other.getSpotKePkId() == null : this.getSpotKePkId().equals(other.getSpotKePkId()))
            && (this.getSpotKeTitle() == null ? other.getSpotKeTitle() == null : this.getSpotKeTitle().equals(other.getSpotKeTitle()))
            && (this.getSpotKeUrl() == null ? other.getSpotKeUrl() == null : this.getSpotKeUrl().equals(other.getSpotKeUrl()))
            && (this.getSpotKePort() == null ? other.getSpotKePort() == null : this.getSpotKePort().equals(other.getSpotKePort()))
            && (this.getSpotKeIsDelete() == null ? other.getSpotKeIsDelete() == null : this.getSpotKeIsDelete().equals(other.getSpotKeIsDelete()))
            && (this.getSpotKeCreateTime() == null ? other.getSpotKeCreateTime() == null : this.getSpotKeCreateTime().equals(other.getSpotKeCreateTime()))
            && (this.getSpotKeUpdateTime() == null ? other.getSpotKeUpdateTime() == null : this.getSpotKeUpdateTime().equals(other.getSpotKeUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotKePkId() == null) ? 0 : getSpotKePkId().hashCode());
        result = prime * result + ((getSpotKeTitle() == null) ? 0 : getSpotKeTitle().hashCode());
        result = prime * result + ((getSpotKeUrl() == null) ? 0 : getSpotKeUrl().hashCode());
        result = prime * result + ((getSpotKePort() == null) ? 0 : getSpotKePort().hashCode());
        result = prime * result + ((getSpotKeIsDelete() == null) ? 0 : getSpotKeIsDelete().hashCode());
        result = prime * result + ((getSpotKeCreateTime() == null) ? 0 : getSpotKeCreateTime().hashCode());
        result = prime * result + ((getSpotKeUpdateTime() == null) ? 0 : getSpotKeUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotKePkId=").append(spotKePkId);
        sb.append(", spotKeTitle=").append(spotKeTitle);
        sb.append(", spotKeUrl=").append(spotKeUrl);
        sb.append(", spotKePort=").append(spotKePort);
        sb.append(", spotKeIsDelete=").append(spotKeIsDelete);
        sb.append(", spotKeCreateTime=").append(spotKeCreateTime);
        sb.append(", spotKeUpdateTime=").append(spotKeUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}