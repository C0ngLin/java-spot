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
 * @TableName spot_baidu
 */
@TableName(value ="spot_baidu")
@Data
public class SpotBaidu implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long spotBaiduPkId;

    /**
     * 
     */
    private String spotBaiduTitle;

    /**
     * 
     */
    private String spotBaiduUrl;

    /**
     * 
     */
    private String spotBaiduImagUrl;

    /**
     * 
     */
    private String spotBaiduPort;

    /**
     * 
     */
    private String spotBaiduHot;

    /**
     * 
     */
    private Integer spotBaiduIsDelete;

    /**
     * 
     */
    private Date spotBaiduCreateTime;

    /**
     * 
     */
    private Date spotBaiduUpdateTime;

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
        SpotBaidu other = (SpotBaidu) that;
        return (this.getSpotBaiduPkId() == null ? other.getSpotBaiduPkId() == null : this.getSpotBaiduPkId().equals(other.getSpotBaiduPkId()))
            && (this.getSpotBaiduTitle() == null ? other.getSpotBaiduTitle() == null : this.getSpotBaiduTitle().equals(other.getSpotBaiduTitle()))
            && (this.getSpotBaiduUrl() == null ? other.getSpotBaiduUrl() == null : this.getSpotBaiduUrl().equals(other.getSpotBaiduUrl()))
            && (this.getSpotBaiduImagUrl() == null ? other.getSpotBaiduImagUrl() == null : this.getSpotBaiduImagUrl().equals(other.getSpotBaiduImagUrl()))
            && (this.getSpotBaiduPort() == null ? other.getSpotBaiduPort() == null : this.getSpotBaiduPort().equals(other.getSpotBaiduPort()))
            && (this.getSpotBaiduHot() == null ? other.getSpotBaiduHot() == null : this.getSpotBaiduHot().equals(other.getSpotBaiduHot()))
            && (this.getSpotBaiduIsDelete() == null ? other.getSpotBaiduIsDelete() == null : this.getSpotBaiduIsDelete().equals(other.getSpotBaiduIsDelete()))
            && (this.getSpotBaiduCreateTime() == null ? other.getSpotBaiduCreateTime() == null : this.getSpotBaiduCreateTime().equals(other.getSpotBaiduCreateTime()))
            && (this.getSpotBaiduUpdateTime() == null ? other.getSpotBaiduUpdateTime() == null : this.getSpotBaiduUpdateTime().equals(other.getSpotBaiduUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotBaiduPkId() == null) ? 0 : getSpotBaiduPkId().hashCode());
        result = prime * result + ((getSpotBaiduTitle() == null) ? 0 : getSpotBaiduTitle().hashCode());
        result = prime * result + ((getSpotBaiduUrl() == null) ? 0 : getSpotBaiduUrl().hashCode());
        result = prime * result + ((getSpotBaiduImagUrl() == null) ? 0 : getSpotBaiduImagUrl().hashCode());
        result = prime * result + ((getSpotBaiduPort() == null) ? 0 : getSpotBaiduPort().hashCode());
        result = prime * result + ((getSpotBaiduHot() == null) ? 0 : getSpotBaiduHot().hashCode());
        result = prime * result + ((getSpotBaiduIsDelete() == null) ? 0 : getSpotBaiduIsDelete().hashCode());
        result = prime * result + ((getSpotBaiduCreateTime() == null) ? 0 : getSpotBaiduCreateTime().hashCode());
        result = prime * result + ((getSpotBaiduUpdateTime() == null) ? 0 : getSpotBaiduUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotBaiduPkId=").append(spotBaiduPkId);
        sb.append(", spotBaiduTitle=").append(spotBaiduTitle);
        sb.append(", spotBaiduUrl=").append(spotBaiduUrl);
        sb.append(", spotBaiduImagUrl=").append(spotBaiduImagUrl);
        sb.append(", spotBaiduPort=").append(spotBaiduPort);
        sb.append(", spotBaiduHot=").append(spotBaiduHot);
        sb.append(", spotBaiduIsDelete=").append(spotBaiduIsDelete);
        sb.append(", spotBaiduCreateTime=").append(spotBaiduCreateTime);
        sb.append(", spotBaiduUpdateTime=").append(spotBaiduUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}