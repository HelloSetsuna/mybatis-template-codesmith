package com.drp.po;

import java.io.Serializable;

/**
 * Persistent Object : drpb2b2c : admin
 * @author Setsuna Jin Generate By CodeSmith 7.0 At 2017/10/10 19:50:56
 * @see com.drp.po.AdminMapper
 */
public class Admin implements Serializable
{
    /**
     * Description  : id
     * Constraint   : [NOT NULL] [Primary Key] [Unique] 
     * TableColum   : [drpb2b2c:int][PRECISION:10]
     */
    private Integer id;
    
    /**
     * Description  : 账号
     * Constraint   : [NOT NULL] [Unique] 
     * TableColum   : [drpb2b2c:varchar][SIZE:60]
     */
    private String name;
    
    /**
     * Description  : 密码
     * Constraint   : [NOT NULL] 
     * TableColum   : [drpb2b2c:varchar][SIZE:384]
     */
    private String password;
    
    /**
     * Description  : 电话号码
     * Constraint   : [CAN NULL]
     * TableColum   : [drpb2b2c:varchar][SIZE:33]
     */
    private String telephone;
    
    /**
     * Description  : 身份证号码
     * Constraint   : [CAN NULL]
     * TableColum   : [drpb2b2c:varchar][SIZE:765]
     */
    private String idcard;
    
    /**
     * Description  : 昵称
     * Constraint   : [CAN NULL]
     * TableColum   : [drpb2b2c:varchar][SIZE:30]
     */
    private String nickName;
    
    /**
     * Description  : 创建时间
     * Constraint   : [CAN NULL]
     * TableColum   : [drpb2b2c:datetime]
     * DefaultValue : CURRENT_TIMESTAMP
     */
    private String createTime;
    
    /**
     * Description  : 更新时间
     * Constraint   : [CAN NULL]
     * TableColum   : [drpb2b2c:datetime]
     * DefaultValue : CURRENT_TIMESTAMP
     */
    private String updateTime;
    
    /**
     * Description  : 用户状态，1是可用，0不可用
     * Constraint   : [NOT NULL] 
     * TableColum   : [drpb2b2c:int][PRECISION:10]
     * DefaultValue : 1
     */
    private Integer status;
    
    /**
     * Description  : 创建用户id
     * Constraint   : [CAN NULL]
     * TableColum   : [drpb2b2c:int][PRECISION:10]
     */
    private Integer createUserId;
    
    /**
     * Description  : 邮箱
     * Constraint   : [CAN NULL]
     * TableColum   : [drpb2b2c:varchar][SIZE:300]
     */
    private String email;
    
    /**
     * 构造函数
     */
    public Admin(){}
    
    /**
     * 获取 id
     * @see #id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 id
     * @see #id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * 获取 账号
     * @see #name
     * @return 账号
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 账号
     * @see #name
     * @param name 账号
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 获取 密码
     * @see #password
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置 密码
     * @see #password
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * 获取 电话号码
     * @see #telephone
     * @return 电话号码
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置 电话号码
     * @see #telephone
     * @param telephone 电话号码
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    /**
     * 获取 身份证号码
     * @see #idcard
     * @return 身份证号码
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置 身份证号码
     * @see #idcard
     * @param idcard 身份证号码
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
    
    /**
     * 获取 昵称
     * @see #nickName
     * @return 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置 昵称
     * @see #nickName
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    /**
     * 获取 创建时间
     * @see #createTime
     * @return 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     * @see #createTime
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    
    /**
     * 获取 更新时间
     * @see #updateTime
     * @return 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间
     * @see #updateTime
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    
    /**
     * 获取 用户状态，1是可用，0不可用
     * @see #status
     * @return 用户状态，1是可用，0不可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 用户状态，1是可用，0不可用
     * @see #status
     * @param status 用户状态，1是可用，0不可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    /**
     * 获取 创建用户id
     * @see #createUserId
     * @return 创建用户id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置 创建用户id
     * @see #createUserId
     * @param createUserId 创建用户id
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }
    
    /**
     * 获取 邮箱
     * @see #email
     * @return 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 邮箱
     * @see #email
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
