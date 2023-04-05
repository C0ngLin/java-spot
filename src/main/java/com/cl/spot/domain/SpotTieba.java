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
 * @TableName spot_tieba
 */
@TableName(value ="spot_tieba")
@Data
public class SpotTieba implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotTiebaPkId;

    /**
     * 
     */
    private String spotTiebaTitle;

    /**
     * 
     */
    private String spotTiebaUrl;

    /**
     * 
     */
    private String spotTiebaPort;

    /**
     * 
     */
    private Integer spotTiebaIsDelete;

    /**
     * 
     */
    private Date spotTiebaCreateTime;

    /**
     * 
     */
    private Date spotTiebaUpdateTime;

    private String spotTiebaZhishu;

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
        SpotTieba other = (SpotTieba) that;
        return (this.getSpotTiebaPkId() == null ? other.getSpotTiebaPkId() == null : this.getSpotTiebaPkId().equals(other.getSpotTiebaPkId()))
            && (this.getSpotTiebaTitle() == null ? other.getSpotTiebaTitle() == null : this.getSpotTiebaTitle().equals(other.getSpotTiebaTitle()))
            && (this.getSpotTiebaUrl() == null ? other.getSpotTiebaUrl() == null : this.getSpotTiebaUrl().equals(other.getSpotTiebaUrl()))
            && (this.getSpotTiebaPort() == null ? other.getSpotTiebaPort() == null : this.getSpotTiebaPort().equals(other.getSpotTiebaPort()))
            && (this.getSpotTiebaIsDelete() == null ? other.getSpotTiebaIsDelete() == null : this.getSpotTiebaIsDelete().equals(other.getSpotTiebaIsDelete()))
            && (this.getSpotTiebaCreateTime() == null ? other.getSpotTiebaCreateTime() == null : this.getSpotTiebaCreateTime().equals(other.getSpotTiebaCreateTime()))
            && (this.getSpotTiebaUpdateTime() == null ? other.getSpotTiebaUpdateTime() == null : this.getSpotTiebaUpdateTime().equals(other.getSpotTiebaUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotTiebaPkId() == null) ? 0 : getSpotTiebaPkId().hashCode());
        result = prime * result + ((getSpotTiebaTitle() == null) ? 0 : getSpotTiebaTitle().hashCode());
        result = prime * result + ((getSpotTiebaUrl() == null) ? 0 : getSpotTiebaUrl().hashCode());
        result = prime * result + ((getSpotTiebaPort() == null) ? 0 : getSpotTiebaPort().hashCode());
        result = prime * result + ((getSpotTiebaIsDelete() == null) ? 0 : getSpotTiebaIsDelete().hashCode());
        result = prime * result + ((getSpotTiebaCreateTime() == null) ? 0 : getSpotTiebaCreateTime().hashCode());
        result = prime * result + ((getSpotTiebaUpdateTime() == null) ? 0 : getSpotTiebaUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotTiebaPkId=").append(spotTiebaPkId);
        sb.append(", spotTiebaTitle=").append(spotTiebaTitle);
        sb.append(", spotTiebaUrl=").append(spotTiebaUrl);
        sb.append(", spotTiebaPort=").append(spotTiebaPort);
        sb.append(", spotTiebaIsDelete=").append(spotTiebaIsDelete);
        sb.append(", spotTiebaCreateTime=").append(spotTiebaCreateTime);
        sb.append(", spotTiebaUpdateTime=").append(spotTiebaUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}