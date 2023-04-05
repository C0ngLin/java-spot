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
 * @TableName spot_douban
 */
@TableName(value ="spot_douban")
@Data
public class SpotDouban implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotDoubanPkId;

    /**
     * 
     */
    private String spotDoubanTitle;

    /**
     * 
     */
    private String spotDoubanUrl;

    /**
     * 
     */
    private String spotDoubanPort;

    /**
     * 
     */
    private Integer spotDoubanIsDelete;

    /**
     * 
     */
    private Date spotDoubanCreateTime;

    /**
     * 
     */
    private Date spotDoubanUpdateTime;

    private String spotDoubanZhishu;

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
        SpotDouban other = (SpotDouban) that;
        return (this.getSpotDoubanPkId() == null ? other.getSpotDoubanPkId() == null : this.getSpotDoubanPkId().equals(other.getSpotDoubanPkId()))
            && (this.getSpotDoubanTitle() == null ? other.getSpotDoubanTitle() == null : this.getSpotDoubanTitle().equals(other.getSpotDoubanTitle()))
            && (this.getSpotDoubanUrl() == null ? other.getSpotDoubanUrl() == null : this.getSpotDoubanUrl().equals(other.getSpotDoubanUrl()))
            && (this.getSpotDoubanPort() == null ? other.getSpotDoubanPort() == null : this.getSpotDoubanPort().equals(other.getSpotDoubanPort()))
            && (this.getSpotDoubanIsDelete() == null ? other.getSpotDoubanIsDelete() == null : this.getSpotDoubanIsDelete().equals(other.getSpotDoubanIsDelete()))
            && (this.getSpotDoubanCreateTime() == null ? other.getSpotDoubanCreateTime() == null : this.getSpotDoubanCreateTime().equals(other.getSpotDoubanCreateTime()))
            && (this.getSpotDoubanUpdateTime() == null ? other.getSpotDoubanUpdateTime() == null : this.getSpotDoubanUpdateTime().equals(other.getSpotDoubanUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotDoubanPkId() == null) ? 0 : getSpotDoubanPkId().hashCode());
        result = prime * result + ((getSpotDoubanTitle() == null) ? 0 : getSpotDoubanTitle().hashCode());
        result = prime * result + ((getSpotDoubanUrl() == null) ? 0 : getSpotDoubanUrl().hashCode());
        result = prime * result + ((getSpotDoubanPort() == null) ? 0 : getSpotDoubanPort().hashCode());
        result = prime * result + ((getSpotDoubanIsDelete() == null) ? 0 : getSpotDoubanIsDelete().hashCode());
        result = prime * result + ((getSpotDoubanCreateTime() == null) ? 0 : getSpotDoubanCreateTime().hashCode());
        result = prime * result + ((getSpotDoubanUpdateTime() == null) ? 0 : getSpotDoubanUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotDoubanPkId=").append(spotDoubanPkId);
        sb.append(", spotDoubanTitle=").append(spotDoubanTitle);
        sb.append(", spotDoubanUrl=").append(spotDoubanUrl);
        sb.append(", spotDoubanPort=").append(spotDoubanPort);
        sb.append(", spotDoubanIsDelete=").append(spotDoubanIsDelete);
        sb.append(", spotDoubanCreateTime=").append(spotDoubanCreateTime);
        sb.append(", spotDoubanUpdateTime=").append(spotDoubanUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}