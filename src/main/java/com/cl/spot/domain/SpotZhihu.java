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
 * @TableName spot_zhihu
 */
@TableName(value ="spot_zhihu")
@Data
public class SpotZhihu implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotZhihuPkId;

    /**
     * 
     */
    private String spotZhihuTitle;

    /**
     * 
     */
    private String spotZhihuUrl;

    /**
     * 
     */
    private String spotZhihuPort;

    /**
     * 
     */
    private Integer spotZhihuIsDelete;

    /**
     * 
     */
    private Date spotZhihuCreateTime;

    /**
     * 
     */
    private Date spotZhihuUpdateTime;

    private String spotZhihuZhishu;

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
        SpotZhihu other = (SpotZhihu) that;
        return (this.getSpotZhihuPkId() == null ? other.getSpotZhihuPkId() == null : this.getSpotZhihuPkId().equals(other.getSpotZhihuPkId()))
            && (this.getSpotZhihuTitle() == null ? other.getSpotZhihuTitle() == null : this.getSpotZhihuTitle().equals(other.getSpotZhihuTitle()))
            && (this.getSpotZhihuUrl() == null ? other.getSpotZhihuUrl() == null : this.getSpotZhihuUrl().equals(other.getSpotZhihuUrl()))
            && (this.getSpotZhihuPort() == null ? other.getSpotZhihuPort() == null : this.getSpotZhihuPort().equals(other.getSpotZhihuPort()))
            && (this.getSpotZhihuIsDelete() == null ? other.getSpotZhihuIsDelete() == null : this.getSpotZhihuIsDelete().equals(other.getSpotZhihuIsDelete()))
            && (this.getSpotZhihuCreateTime() == null ? other.getSpotZhihuCreateTime() == null : this.getSpotZhihuCreateTime().equals(other.getSpotZhihuCreateTime()))
            && (this.getSpotZhihuUpdateTime() == null ? other.getSpotZhihuUpdateTime() == null : this.getSpotZhihuUpdateTime().equals(other.getSpotZhihuUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotZhihuPkId() == null) ? 0 : getSpotZhihuPkId().hashCode());
        result = prime * result + ((getSpotZhihuTitle() == null) ? 0 : getSpotZhihuTitle().hashCode());
        result = prime * result + ((getSpotZhihuUrl() == null) ? 0 : getSpotZhihuUrl().hashCode());
        result = prime * result + ((getSpotZhihuPort() == null) ? 0 : getSpotZhihuPort().hashCode());
        result = prime * result + ((getSpotZhihuIsDelete() == null) ? 0 : getSpotZhihuIsDelete().hashCode());
        result = prime * result + ((getSpotZhihuCreateTime() == null) ? 0 : getSpotZhihuCreateTime().hashCode());
        result = prime * result + ((getSpotZhihuUpdateTime() == null) ? 0 : getSpotZhihuUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotZhihuPkId=").append(spotZhihuPkId);
        sb.append(", spotZhihuTitle=").append(spotZhihuTitle);
        sb.append(", spotZhihuUrl=").append(spotZhihuUrl);
        sb.append(", spotZhihuPort=").append(spotZhihuPort);
        sb.append(", spotZhihuIsDelete=").append(spotZhihuIsDelete);
        sb.append(", spotZhihuCreateTime=").append(spotZhihuCreateTime);
        sb.append(", spotZhihuUpdateTime=").append(spotZhihuUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}