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
 * @TableName spot_douyin
 */
@TableName(value ="spot_douyin")
@Data
public class SpotDouyin implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotDouyinPkId;

    /**
     * 
     */
    private String spotDouyinTitle;

    /**
     * 
     */
    private String spotDouyinUrl;

    /**
     * 
     */
    private String spotDouyinPort;

    /**
     * 
     */
    private Integer spotDouyinIsDelete;

    /**
     * 
     */
    private Date spotDouyinCreateTime;

    /**
     * 
     */
    private Date spotDouyinUpdateTime;

    private String spotDouyinZhishu;

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
        SpotDouyin other = (SpotDouyin) that;
        return (this.getSpotDouyinPkId() == null ? other.getSpotDouyinPkId() == null : this.getSpotDouyinPkId().equals(other.getSpotDouyinPkId()))
            && (this.getSpotDouyinTitle() == null ? other.getSpotDouyinTitle() == null : this.getSpotDouyinTitle().equals(other.getSpotDouyinTitle()))
            && (this.getSpotDouyinUrl() == null ? other.getSpotDouyinUrl() == null : this.getSpotDouyinUrl().equals(other.getSpotDouyinUrl()))
            && (this.getSpotDouyinPort() == null ? other.getSpotDouyinPort() == null : this.getSpotDouyinPort().equals(other.getSpotDouyinPort()))
            && (this.getSpotDouyinIsDelete() == null ? other.getSpotDouyinIsDelete() == null : this.getSpotDouyinIsDelete().equals(other.getSpotDouyinIsDelete()))
            && (this.getSpotDouyinCreateTime() == null ? other.getSpotDouyinCreateTime() == null : this.getSpotDouyinCreateTime().equals(other.getSpotDouyinCreateTime()))
            && (this.getSpotDouyinUpdateTime() == null ? other.getSpotDouyinUpdateTime() == null : this.getSpotDouyinUpdateTime().equals(other.getSpotDouyinUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotDouyinPkId() == null) ? 0 : getSpotDouyinPkId().hashCode());
        result = prime * result + ((getSpotDouyinTitle() == null) ? 0 : getSpotDouyinTitle().hashCode());
        result = prime * result + ((getSpotDouyinUrl() == null) ? 0 : getSpotDouyinUrl().hashCode());
        result = prime * result + ((getSpotDouyinPort() == null) ? 0 : getSpotDouyinPort().hashCode());
        result = prime * result + ((getSpotDouyinIsDelete() == null) ? 0 : getSpotDouyinIsDelete().hashCode());
        result = prime * result + ((getSpotDouyinCreateTime() == null) ? 0 : getSpotDouyinCreateTime().hashCode());
        result = prime * result + ((getSpotDouyinUpdateTime() == null) ? 0 : getSpotDouyinUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotDouyinPkId=").append(spotDouyinPkId);
        sb.append(", spotDouyinTitle=").append(spotDouyinTitle);
        sb.append(", spotDouyinUrl=").append(spotDouyinUrl);
        sb.append(", spotDouyinPort=").append(spotDouyinPort);
        sb.append(", spotDouyinIsDelete=").append(spotDouyinIsDelete);
        sb.append(", spotDouyinCreateTime=").append(spotDouyinCreateTime);
        sb.append(", spotDouyinUpdateTime=").append(spotDouyinUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}