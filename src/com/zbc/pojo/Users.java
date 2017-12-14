package com.zbc.pojo;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity Class Users
 *
 * 2017-12-13
 */
public class Users {

    
    private Integer id;
    @NotEmpty(message="请输入账号")
    private String userName;
    @NotEmpty(message="请输入密码")
    private String password;
    
    private String realName;

    public Users(){
    }

    public Users(Integer id, String userName, String password, String realName){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.realName = realName;
    }


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setRealName(String realName){
        this.realName = realName;
    }

    public String getRealName(){
        return realName;
    }
}
