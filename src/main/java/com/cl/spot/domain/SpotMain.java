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
 * @TableName spot_main
 */
@TableName(value ="spot_main")
@Data
public class SpotMain implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Object spotMainId;

    /**
     * 
     */
    private String spotMainTitle;

    /**
     * 
     */
    private String spotMainUrl;

    /**
     * 
     */
    private Object spotMainHot;

    /**
     * 
     */
    private Integer spotMainPingtai;

    /**
     * 
     */
    private Date spotMainDate;

    /**
     * 
     */
    private Integer spotMainArea;

    /**
     * 
     */
    private Integer spotMainSort;

    /**
     * 
     */
    private Object spotMainZhuanfa;

    /**
     * 
     */
    private Object spotMainDianzan;

    /**
     * 
     */
    private Object spotMainPinglun;

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
        SpotMain other = (SpotMain) that;
        return (this.getSpotMainId() == null ? other.getSpotMainId() == null : this.getSpotMainId().equals(other.getSpotMainId()))
            && (this.getSpotMainTitle() == null ? other.getSpotMainTitle() == null : this.getSpotMainTitle().equals(other.getSpotMainTitle()))
            && (this.getSpotMainUrl() == null ? other.getSpotMainUrl() == null : this.getSpotMainUrl().equals(other.getSpotMainUrl()))
            && (this.getSpotMainHot() == null ? other.getSpotMainHot() == null : this.getSpotMainHot().equals(other.getSpotMainHot()))
            && (this.getSpotMainPingtai() == null ? other.getSpotMainPingtai() == null : this.getSpotMainPingtai().equals(other.getSpotMainPingtai()))
            && (this.getSpotMainDate() == null ? other.getSpotMainDate() == null : this.getSpotMainDate().equals(other.getSpotMainDate()))
            && (this.getSpotMainArea() == null ? other.getSpotMainArea() == null : this.getSpotMainArea().equals(other.getSpotMainArea()))
            && (this.getSpotMainSort() == null ? other.getSpotMainSort() == null : this.getSpotMainSort().equals(other.getSpotMainSort()))
            && (this.getSpotMainZhuanfa() == null ? other.getSpotMainZhuanfa() == null : this.getSpotMainZhuanfa().equals(other.getSpotMainZhuanfa()))
            && (this.getSpotMainDianzan() == null ? other.getSpotMainDianzan() == null : this.getSpotMainDianzan().equals(other.getSpotMainDianzan()))
            && (this.getSpotMainPinglun() == null ? other.getSpotMainPinglun() == null : this.getSpotMainPinglun().equals(other.getSpotMainPinglun()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpotMainId() == null) ? 0 : getSpotMainId().hashCode());
        result = prime * result + ((getSpotMainTitle() == null) ? 0 : getSpotMainTitle().hashCode());
        result = prime * result + ((getSpotMainUrl() == null) ? 0 : getSpotMainUrl().hashCode());
        result = prime * result + ((getSpotMainHot() == null) ? 0 : getSpotMainHot().hashCode());
        result = prime * result + ((getSpotMainPingtai() == null) ? 0 : getSpotMainPingtai().hashCode());
        result = prime * result + ((getSpotMainDate() == null) ? 0 : getSpotMainDate().hashCode());
        result = prime * result + ((getSpotMainArea() == null) ? 0 : getSpotMainArea().hashCode());
        result = prime * result + ((getSpotMainSort() == null) ? 0 : getSpotMainSort().hashCode());
        result = prime * result + ((getSpotMainZhuanfa() == null) ? 0 : getSpotMainZhuanfa().hashCode());
        result = prime * result + ((getSpotMainDianzan() == null) ? 0 : getSpotMainDianzan().hashCode());
        result = prime * result + ((getSpotMainPinglun() == null) ? 0 : getSpotMainPinglun().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spotMainId=").append(spotMainId);
        sb.append(", spotMainTitle=").append(spotMainTitle);
        sb.append(", spotMainUrl=").append(spotMainUrl);
        sb.append(", spotMainHot=").append(spotMainHot);
        sb.append(", spotMainPingtai=").append(spotMainPingtai);
        sb.append(", spotMainDate=").append(spotMainDate);
        sb.append(", spotMainArea=").append(spotMainArea);
        sb.append(", spotMainSort=").append(spotMainSort);
        sb.append(", spotMainZhuanfa=").append(spotMainZhuanfa);
        sb.append(", spotMainDianzan=").append(spotMainDianzan);
        sb.append(", spotMainPinglun=").append(spotMainPinglun);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}