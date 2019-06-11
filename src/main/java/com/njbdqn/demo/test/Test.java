package com.njbdqn.demo.test;

import com.njbdqn.demo.dao.IUserDAO;
import com.njbdqn.demo.vo.Userinfos;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.Date;

/**
 * Created by Administrator on 2018/10/11.
 */
public class Test {
    public static void main(String[] args) throws  Exception{
        Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                                .build(reader);
        SqlSession session = factory.openSession();
        IUserDAO udao = session.getMapper(IUserDAO.class);
        //System.out.println(udao.findById(1));
        Userinfos u = new Userinfos();
        u.setUsername("heheh");
        u.setBirthday(new Date());
        udao.save(u);
        session.commit();

        System.out.println("========");
    }
}
