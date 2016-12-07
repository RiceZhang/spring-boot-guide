package org.github.guide.bean;

import java.io.Serializable;

/**
 * Created by R on 2016/12/7.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -8036219797322639507L;

    /** 帐号 **/
    private String account;
    /** 密码 **/
    private String pwd;
    /** userId **/
    private Long userId;
    /** roleID **/
    private Long roleId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
