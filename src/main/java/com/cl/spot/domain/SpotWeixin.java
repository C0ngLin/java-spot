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
 * @TableName spot_weixin
 */
@TableName(value ="spot_weixin")
@Data
public class SpotWeixin implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotWeixinPkId;

    /**
     * 
     */
    private String spotWeixinTitle;

    /**
     * 
     */
    private String spotWeixinUrl;

    /**
     * 
     */
    private String spotWeixinPort;

    /**
     * 
     */
    private Integer spotWeixinIsDelete;

    /**
     * 
     */
    private Date spotWeixinCreateTime;

    /**
     * 
     */
    private Date spotWeixinUpdateTime;

    private String spotWeixinZhishu;

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
        SpotWeixin other = (SpotWeixin) that;
        return (this.getSpotWeixinPkId() == null ? other.getSpotWeixinPkId() == null : this.getSpotWeixinPkId().equals(other.getSpotWeixinPkId()))
            && (this.getSpotWeixinTitle() == null ? other.getSpotWeixinTitle() == null : this.getSpotWeixinTitle().equals(other.getSpotWeixinTitle()))
            && (this.getSpotWeixinUrl() == null ? other.getSpotWeixinUrl() == null : this.getSpotWeixinUrl().equals(other.getSpotWeixinUrl()))
            && (this.getSpotWeixinPort() == null ? other.getSpotWeixinPort() == null : this.getSpotWeixinPort().equals(other.getSpotWeixinPort()))
            && (this.getSpotWeixinIsDelete() == null ? other.getSpotWeixinIsDelete() == null : this.getSpotWeixinIsDelete().equals(other.getSpotWeixinIsDelete()))
            && (this.getSpotWeixinCreateTime() == null ? other.getSpotWeixinCreateTime() == null : this.getSpotWeixinCreateTime().equals(other.getSpotWeixinCreateTime()))
            && (this.getSpotWeixinUpdateTime() == null ? other.getSpotWeixinUpdateTime() == null : this.getSpotWeixinUpdateTime().equals(other.getSpotWeixinUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotWeixinPkId() == null) ? 0 : getSpotWeixinPkId().hashCode());
        result = prime * result + ((getSpotWeixinTitle() == null) ? 0 : getSpotWeixinTitle().hashCode());
        result = prime * result + ((getSpotWeixinUrl() == null) ? 0 : getSpotWeixinUrl().hashCode());
        result = prime * result + ((getSpotWeixinPort() == null) ? 0 : getSpotWeixinPort().hashCode());
        result = prime * result + ((getSpotWeixinIsDelete() == null) ? 0 : getSpotWeixinIsDelete().hashCode());
        result = prime * result + ((getSpotWeixinCreateTime() == null) ? 0 : getSpotWeixinCreateTime().hashCode());
        result = prime * result + ((getSpotWeixinUpdateTime() == null) ? 0 : getSpotWeixinUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotWeixinPkId=").append(spotWeixinPkId);
        sb.append(", spotWeixinTitle=").append(spotWeixinTitle);
        sb.append(", spotWeixinUrl=").append(spotWeixinUrl);
        sb.append(", spotWeixinPort=").append(spotWeixinPort);
        sb.append(", spotWeixinIsDelete=").append(spotWeixinIsDelete);
        sb.append(", spotWeixinCreateTime=").append(spotWeixinCreateTime);
        sb.append(", spotWeixinUpdateTime=").append(spotWeixinUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}