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
 * @TableName spot_weibo
 */
@TableName(value ="spot_weibo")
@Data
public class SpotWeibo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotWeiboPkId;

    /**
     * 
     */
    private String spotWeiboTitle;

    /**
     * 
     */
    private String spotWeiboUrl;

    /**
     * 
     */
    private String spotWeiboPort;

    /**
     * 
     */
    private Integer spotWeiboIsDelete;

    /**
     * 
     */
    private Date spotWeiboCreateTime;

    /**
     * 
     */
    private Date spotWeiboUpdateTime;

    private String spotWeiboZhishu;

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
        SpotWeibo other = (SpotWeibo) that;
        return (this.getSpotWeiboPkId() == null ? other.getSpotWeiboPkId() == null : this.getSpotWeiboPkId().equals(other.getSpotWeiboPkId()))
            && (this.getSpotWeiboTitle() == null ? other.getSpotWeiboTitle() == null : this.getSpotWeiboTitle().equals(other.getSpotWeiboTitle()))
            && (this.getSpotWeiboUrl() == null ? other.getSpotWeiboUrl() == null : this.getSpotWeiboUrl().equals(other.getSpotWeiboUrl()))
            && (this.getSpotWeiboPort() == null ? other.getSpotWeiboPort() == null : this.getSpotWeiboPort().equals(other.getSpotWeiboPort()))
            && (this.getSpotWeiboIsDelete() == null ? other.getSpotWeiboIsDelete() == null : this.getSpotWeiboIsDelete().equals(other.getSpotWeiboIsDelete()))
            && (this.getSpotWeiboCreateTime() == null ? other.getSpotWeiboCreateTime() == null : this.getSpotWeiboCreateTime().equals(other.getSpotWeiboCreateTime()))
            && (this.getSpotWeiboUpdateTime() == null ? other.getSpotWeiboUpdateTime() == null : this.getSpotWeiboUpdateTime().equals(other.getSpotWeiboUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotWeiboPkId() == null) ? 0 : getSpotWeiboPkId().hashCode());
        result = prime * result + ((getSpotWeiboTitle() == null) ? 0 : getSpotWeiboTitle().hashCode());
        result = prime * result + ((getSpotWeiboUrl() == null) ? 0 : getSpotWeiboUrl().hashCode());
        result = prime * result + ((getSpotWeiboPort() == null) ? 0 : getSpotWeiboPort().hashCode());
        result = prime * result + ((getSpotWeiboIsDelete() == null) ? 0 : getSpotWeiboIsDelete().hashCode());
        result = prime * result + ((getSpotWeiboCreateTime() == null) ? 0 : getSpotWeiboCreateTime().hashCode());
        result = prime * result + ((getSpotWeiboUpdateTime() == null) ? 0 : getSpotWeiboUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotWeiboPkId=").append(spotWeiboPkId);
        sb.append(", spotWeiboTitle=").append(spotWeiboTitle);
        sb.append(", spotWeiboUrl=").append(spotWeiboUrl);
        sb.append(", spotWeiboPort=").append(spotWeiboPort);
        sb.append(", spotWeiboIsDelete=").append(spotWeiboIsDelete);
        sb.append(", spotWeiboCreateTime=").append(spotWeiboCreateTime);
        sb.append(", spotWeiboUpdateTime=").append(spotWeiboUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}