package com.njbdqn.demo.dao;

import com.njbdqn.demo.vo.Userinfos;

import java.util.List;

/**
 * Created by Administrator on 2018/10/11.
 */
public interface IUserDAO {

    public void save(Userinfos user);
    public void del(int userid);
    public void update(Userinfos user);
    public List<Userinfos> findAll();
    public Userinfos findById(int userid);

}
