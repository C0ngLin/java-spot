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
 * @TableName spot_sleep
 */
@TableName(value ="spot_sleep")
@Data
public class SpotSleep implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotSleepPkId;

    /**
     * 
     */
    private String spotSleepTitle;

    /**
     * 
     */
    private String spotSleepUrl;

    /**
     * 
     */
    private String spotSleepPort;

    /**
     * 
     */
    private Integer spotSleepIsDelete;

    /**
     * 
     */
    private Date spotSleepCreateTime;

    /**
     * 
     */
    private Date spotSleepUpdateTime;

    private String spotSleepZhishu;

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
        SpotSleep other = (SpotSleep) that;
        return (this.getSpotSleepPkId() == null ? other.getSpotSleepPkId() == null : this.getSpotSleepPkId().equals(other.getSpotSleepPkId()))
            && (this.getSpotSleepTitle() == null ? other.getSpotSleepTitle() == null : this.getSpotSleepTitle().equals(other.getSpotSleepTitle()))
            && (this.getSpotSleepUrl() == null ? other.getSpotSleepUrl() == null : this.getSpotSleepUrl().equals(other.getSpotSleepUrl()))
            && (this.getSpotSleepPort() == null ? other.getSpotSleepPort() == null : this.getSpotSleepPort().equals(other.getSpotSleepPort()))
            && (this.getSpotSleepIsDelete() == null ? other.getSpotSleepIsDelete() == null : this.getSpotSleepIsDelete().equals(other.getSpotSleepIsDelete()))
            && (this.getSpotSleepCreateTime() == null ? other.getSpotSleepCreateTime() == null : this.getSpotSleepCreateTime().equals(other.getSpotSleepCreateTime()))
            && (this.getSpotSleepUpdateTime() == null ? other.getSpotSleepUpdateTime() == null : this.getSpotSleepUpdateTime().equals(other.getSpotSleepUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotSleepPkId() == null) ? 0 : getSpotSleepPkId().hashCode());
        result = prime * result + ((getSpotSleepTitle() == null) ? 0 : getSpotSleepTitle().hashCode());
        result = prime * result + ((getSpotSleepUrl() == null) ? 0 : getSpotSleepUrl().hashCode());
        result = prime * result + ((getSpotSleepPort() == null) ? 0 : getSpotSleepPort().hashCode());
        result = prime * result + ((getSpotSleepIsDelete() == null) ? 0 : getSpotSleepIsDelete().hashCode());
        result = prime * result + ((getSpotSleepCreateTime() == null) ? 0 : getSpotSleepCreateTime().hashCode());
        result = prime * result + ((getSpotSleepUpdateTime() == null) ? 0 : getSpotSleepUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotSleepPkId=").append(spotSleepPkId);
        sb.append(", spotSleepTitle=").append(spotSleepTitle);
        sb.append(", spotSleepUrl=").append(spotSleepUrl);
        sb.append(", spotSleepPort=").append(spotSleepPort);
        sb.append(", spotSleepIsDelete=").append(spotSleepIsDelete);
        sb.append(", spotSleepCreateTime=").append(spotSleepCreateTime);
        sb.append(", spotSleepUpdateTime=").append(spotSleepUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}