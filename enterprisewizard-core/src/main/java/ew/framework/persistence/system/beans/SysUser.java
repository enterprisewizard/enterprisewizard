package ew.framework.persistence.system.beans;

import java.util.Date;

/**
 * (sys_user)
 * 
 * @author bianj
 * @version 1.0.0 2017-03-31
 */
public class SysUser extends dwz.dal.object.AbstractDO {
    /** 版本号 */
    private static final long serialVersionUID = 6336170748036392198L;
    
    /** 用户内部ID */
    private Integer id;
    
    /** 用户名称 */
    private String name;
    
    /** 登录ID */
    private String loginId;
    
    /** 登录密码 */
    private String loginPassword;
    
    /** 是否有效 */
    private Integer isValid;
    
    /** 生效开始日期 */
    private Date validFrom;
    
    /** 生效结束日期 */
    private Date validTo;
    
    /** 邮箱 */
    private String email;
    
    /** 手机 */
    private String mobilePhone;
    
    /** 登录状态 */
    private String loginState;
    
    /** 最后登录IP */
    private String lastLoginIp;
    
    /** 最后登录时间 */
    private Date lastLoginTime;
    
    /** 创建人 */
    private Integer createdBy;
    
    /** 创建时间 */
    private Date creationDate;
    
    /** 最后更新人 */
    private Integer lastUpdatedBy;
    
    /** 最后更新时间 */
    private Date lastUpdateDate;
    
    /**
     * 获取用户内部ID
     * 
     * @return 用户内部ID
     */
    public Integer getId() {
        return this.id;
    }
     
    /**
     * 设置用户内部ID
     * 
     * @param id
     *          用户内部ID
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * 获取用户名称
     * 
     * @return 用户名称
     */
    public String getName() {
        return this.name;
    }
     
    /**
     * 设置用户名称
     * 
     * @param name
     *          用户名称
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 获取登录ID
     * 
     * @return 登录ID
     */
    public String getLoginId() {
        return this.loginId;
    }
     
    /**
     * 设置登录ID
     * 
     * @param loginId
     *          登录ID
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    
    /**
     * 获取登录密码
     * 
     * @return 登录密码
     */
    public String getLoginPassword() {
        return this.loginPassword;
    }
     
    /**
     * 设置登录密码
     * 
     * @param loginPassword
     *          登录密码
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
    
    /**
     * 获取是否有效
     * 
     * @return 是否有效
     */
    public Integer getIsValid() {
        return this.isValid;
    }
     
    /**
     * 设置是否有效
     * 
     * @param isValid
     *          是否有效
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
    
    /**
     * 获取生效开始日期
     * 
     * @return 生效开始日期
     */
    public Date getValidFrom() {
        return this.validFrom;
    }
     
    /**
     * 设置生效开始日期
     * 
     * @param validFrom
     *          生效开始日期
     */
    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }
    
    /**
     * 获取生效结束日期
     * 
     * @return 生效结束日期
     */
    public Date getValidTo() {
        return this.validTo;
    }
     
    /**
     * 设置生效结束日期
     * 
     * @param validTo
     *          生效结束日期
     */
    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }
    
    /**
     * 获取邮箱
     * 
     * @return 邮箱
     */
    public String getEmail() {
        return this.email;
    }
     
    /**
     * 设置邮箱
     * 
     * @param email
     *          邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 获取手机
     * 
     * @return 手机
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }
     
    /**
     * 设置手机
     * 
     * @param mobilePhone
     *          手机
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
    /**
     * 获取登录状态
     * 
     * @return 登录状态
     */
    public String getLoginState() {
        return this.loginState;
    }
     
    /**
     * 设置登录状态
     * 
     * @param loginState
     *          登录状态
     */
    public void setLoginState(String loginState) {
        this.loginState = loginState;
    }
    
    /**
     * 获取最后登录IP
     * 
     * @return 最后登录IP
     */
    public String getLastLoginIp() {
        return this.lastLoginIp;
    }
     
    /**
     * 设置最后登录IP
     * 
     * @param lastLoginIp
     *          最后登录IP
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
    
    /**
     * 获取最后登录时间
     * 
     * @return 最后登录时间
     */
    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }
     
    /**
     * 设置最后登录时间
     * 
     * @param lastLoginTime
     *          最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    
    /**
     * 获取创建人
     * 
     * @return 创建人
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }
     
    /**
     * 设置创建人
     * 
     * @param createdBy
     *          创建人
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
    
    /**
     * 获取创建时间
     * 
     * @return 创建时间
     */
    public Date getCreationDate() {
        return this.creationDate;
    }
     
    /**
     * 设置创建时间
     * 
     * @param creationDate
     *          创建时间
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * 获取最后更新人
     * 
     * @return 最后更新人
     */
    public Integer getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }
     
    /**
     * 设置最后更新人
     * 
     * @param lastUpdatedBy
     *          最后更新人
     */
    public void setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    
    /**
     * 获取最后更新时间
     * 
     * @return 最后更新时间
     */
    public Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }
     
    /**
     * 设置最后更新时间
     * 
     * @param lastUpdateDate
     *          最后更新时间
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}