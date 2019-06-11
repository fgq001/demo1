package com.njbdqn.demo.vo;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/11.
 */
public class Userinfos {
    private int userid;
    private String username;
    private Date birthday;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
