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
 * @TableName spot_pengpai
 */
@TableName(value ="spot_pengpai")
@Data
public class SpotPengpai implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotPengpaiPkId;

    /**
     * 
     */
    private String spotPengpaiTitle;

    /**
     * 
     */
    private String spotPengpaiUrl;

    /**
     * 
     */
    private String spotPengpaiPort;

    /**
     * 
     */
    private Integer spotPengpaiIsDelete;

    /**
     * 
     */
    private Date spotPengpaiCreateTime;

    /**
     * 
     */
    private Date spotPengpaiUpdateTime;

    private String spotPengpaiZhishu;

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
        SpotPengpai other = (SpotPengpai) that;
        return (this.getSpotPengpaiPkId() == null ? other.getSpotPengpaiPkId() == null : this.getSpotPengpaiPkId().equals(other.getSpotPengpaiPkId()))
            && (this.getSpotPengpaiTitle() == null ? other.getSpotPengpaiTitle() == null : this.getSpotPengpaiTitle().equals(other.getSpotPengpaiTitle()))
            && (this.getSpotPengpaiUrl() == null ? other.getSpotPengpaiUrl() == null : this.getSpotPengpaiUrl().equals(other.getSpotPengpaiUrl()))
            && (this.getSpotPengpaiPort() == null ? other.getSpotPengpaiPort() == null : this.getSpotPengpaiPort().equals(other.getSpotPengpaiPort()))
            && (this.getSpotPengpaiIsDelete() == null ? other.getSpotPengpaiIsDelete() == null : this.getSpotPengpaiIsDelete().equals(other.getSpotPengpaiIsDelete()))
            && (this.getSpotPengpaiCreateTime() == null ? other.getSpotPengpaiCreateTime() == null : this.getSpotPengpaiCreateTime().equals(other.getSpotPengpaiCreateTime()))
            && (this.getSpotPengpaiUpdateTime() == null ? other.getSpotPengpaiUpdateTime() == null : this.getSpotPengpaiUpdateTime().equals(other.getSpotPengpaiUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotPengpaiPkId() == null) ? 0 : getSpotPengpaiPkId().hashCode());
        result = prime * result + ((getSpotPengpaiTitle() == null) ? 0 : getSpotPengpaiTitle().hashCode());
        result = prime * result + ((getSpotPengpaiUrl() == null) ? 0 : getSpotPengpaiUrl().hashCode());
        result = prime * result + ((getSpotPengpaiPort() == null) ? 0 : getSpotPengpaiPort().hashCode());
        result = prime * result + ((getSpotPengpaiIsDelete() == null) ? 0 : getSpotPengpaiIsDelete().hashCode());
        result = prime * result + ((getSpotPengpaiCreateTime() == null) ? 0 : getSpotPengpaiCreateTime().hashCode());
        result = prime * result + ((getSpotPengpaiUpdateTime() == null) ? 0 : getSpotPengpaiUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotPengpaiPkId=").append(spotPengpaiPkId);
        sb.append(", spotPengpaiTitle=").append(spotPengpaiTitle);
        sb.append(", spotPengpaiUrl=").append(spotPengpaiUrl);
        sb.append(", spotPengpaiPort=").append(spotPengpaiPort);
        sb.append(", spotPengpaiIsDelete=").append(spotPengpaiIsDelete);
        sb.append(", spotPengpaiCreateTime=").append(spotPengpaiCreateTime);
        sb.append(", spotPengpaiUpdateTime=").append(spotPengpaiUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}