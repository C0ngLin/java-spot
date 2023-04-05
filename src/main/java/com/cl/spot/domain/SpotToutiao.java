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
 * @TableName spot_toutiao
 */
@TableName(value ="spot_toutiao")
@Data
public class SpotToutiao implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotToutiaoPkId;

    /**
     * 
     */
    private String spotToutiaoTitle;

    /**
     * 
     */
    private String spotToutiaoUrl;

    /**
     * 
     */
    private String spotToutiaoPort;

    /**
     * 
     */
    private Integer spotToutiaoIsDelete;

    /**
     * 
     */
    private Date spotToutiaoCreateTime;

    /**
     * 
     */
    private Date spotToutiaoUpdateTime;

    private String spotToutiaoZhishu;

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
        SpotToutiao other = (SpotToutiao) that;
        return (this.getSpotToutiaoPkId() == null ? other.getSpotToutiaoPkId() == null : this.getSpotToutiaoPkId().equals(other.getSpotToutiaoPkId()))
            && (this.getSpotToutiaoTitle() == null ? other.getSpotToutiaoTitle() == null : this.getSpotToutiaoTitle().equals(other.getSpotToutiaoTitle()))
            && (this.getSpotToutiaoUrl() == null ? other.getSpotToutiaoUrl() == null : this.getSpotToutiaoUrl().equals(other.getSpotToutiaoUrl()))
            && (this.getSpotToutiaoPort() == null ? other.getSpotToutiaoPort() == null : this.getSpotToutiaoPort().equals(other.getSpotToutiaoPort()))
            && (this.getSpotToutiaoIsDelete() == null ? other.getSpotToutiaoIsDelete() == null : this.getSpotToutiaoIsDelete().equals(other.getSpotToutiaoIsDelete()))
            && (this.getSpotToutiaoCreateTime() == null ? other.getSpotToutiaoCreateTime() == null : this.getSpotToutiaoCreateTime().equals(other.getSpotToutiaoCreateTime()))
            && (this.getSpotToutiaoUpdateTime() == null ? other.getSpotToutiaoUpdateTime() == null : this.getSpotToutiaoUpdateTime().equals(other.getSpotToutiaoUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotToutiaoPkId() == null) ? 0 : getSpotToutiaoPkId().hashCode());
        result = prime * result + ((getSpotToutiaoTitle() == null) ? 0 : getSpotToutiaoTitle().hashCode());
        result = prime * result + ((getSpotToutiaoUrl() == null) ? 0 : getSpotToutiaoUrl().hashCode());
        result = prime * result + ((getSpotToutiaoPort() == null) ? 0 : getSpotToutiaoPort().hashCode());
        result = prime * result + ((getSpotToutiaoIsDelete() == null) ? 0 : getSpotToutiaoIsDelete().hashCode());
        result = prime * result + ((getSpotToutiaoCreateTime() == null) ? 0 : getSpotToutiaoCreateTime().hashCode());
        result = prime * result + ((getSpotToutiaoUpdateTime() == null) ? 0 : getSpotToutiaoUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotToutiaoPkId=").append(spotToutiaoPkId);
        sb.append(", spotToutiaoTitle=").append(spotToutiaoTitle);
        sb.append(", spotToutiaoUrl=").append(spotToutiaoUrl);
        sb.append(", spotToutiaoPort=").append(spotToutiaoPort);
        sb.append(", spotToutiaoIsDelete=").append(spotToutiaoIsDelete);
        sb.append(", spotToutiaoCreateTime=").append(spotToutiaoCreateTime);
        sb.append(", spotToutiaoUpdateTime=").append(spotToutiaoUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}