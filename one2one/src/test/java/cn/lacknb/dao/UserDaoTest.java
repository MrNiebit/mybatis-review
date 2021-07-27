package cn.lacknb.dao;

import cn.lacknb.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static java.lang.String.format;
import static org.junit.Assert.*;

/**
 * @author: gitsilence
 * @description:
 * @date: 2021/7/27 10:19 下午
 **/
public class UserDaoTest {

    private SqlSession session;
    private UserDao userMapper = null;

    @Before
    public void before () {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        try {
            SqlSessionFactory factory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
            session = factory.openSession();
            userMapper = session.getMapper(UserDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setId(7);
        user.setName("白晶晶");
        user.setGender("女");
        int row = userMapper.addUser(user);
        System.out.printf(" add changed %d rows !!%n", row);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(2);
        user.setFriendId(3);
        int row = userMapper.updateUser(user);
        System.out.println(format(" update changed %d rows !!", row));
    }

    /**
     * 第一种方式 一对一
     */
    @Test
    public void findById () {
        User user = userMapper.findById(3);
        System.out.println(user);
        if (user == null) {
            System.out.println("未找到此人");
            return;
        }
        if (user.getFriend() == null) {
            System.out.printf("%s 没有朋友%n", user.getName());
            return;
        }
        System.out.printf("姓名：%s , 他的朋友叫 %s ! %n", user.getName(), user.getFriend().getName());
    }

    /**
     * 第二种方式 一对一
     */
    @Test
    public void findByIdPlus () {
        User user = userMapper.findByIdPlus(2);
        System.out.println(user);
        if (user == null) {
            System.out.println("未找到此人");
            return;
        }
        if (user.getFriend() == null) {
            System.out.printf("%s 没有朋友%n", user.getName());
            return;
        }
        System.out.printf("姓名：%s , 他的朋友叫 %s ! %n", user.getName(), user.getFriend().getName());
    }

    @After
    public void after () {
        // 提交session
        session.commit();
        // 关闭session
        session.close();
    }
}