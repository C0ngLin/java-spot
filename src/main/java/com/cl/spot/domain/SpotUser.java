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
 * @TableName spot_user
 */
@TableName(value ="spot_user")
@Data
public class SpotUser implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Object userUuid;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String userPassword;

    /**
     * 
     */
    private String userPhone;

    /**
     * 
     */
    private Date userCreateTime;

    /**
     * 
     */
    private Date userUpdateTime;

    /**
     * 
     */
    private String userImgUrl;

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
        SpotUser other = (SpotUser) that;
        return (this.getUserUuid() == null ? other.getUserUuid() == null : this.getUserUuid().equals(other.getUserUuid()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserCreateTime() == null ? other.getUserCreateTime() == null : this.getUserCreateTime().equals(other.getUserCreateTime()))
            && (this.getUserUpdateTime() == null ? other.getUserUpdateTime() == null : this.getUserUpdateTime().equals(other.getUserUpdateTime()))
            && (this.getUserImgUrl() == null ? other.getUserImgUrl() == null : this.getUserImgUrl().equals(other.getUserImgUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserUuid() == null) ? 0 : getUserUuid().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserCreateTime() == null) ? 0 : getUserCreateTime().hashCode());
        result = prime * result + ((getUserUpdateTime() == null) ? 0 : getUserUpdateTime().hashCode());
        result = prime * result + ((getUserImgUrl() == null) ? 0 : getUserImgUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userUuid=").append(userUuid);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userCreateTime=").append(userCreateTime);
        sb.append(", userUpdateTime=").append(userUpdateTime);
        sb.append(", userImgUrl=").append(userImgUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}