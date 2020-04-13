package edu.niit.yd.aopdemo.demo1;

import org.junit.jupiter.api.Test;

/**
 * @author ABC
 * @date 2020/3/18 9:31
 */
public class SpringTest {
    @Test
    public void demo1() {
        UserDao userDao = new UserDaoImpl();
        userDao.save();
        userDao.update();
        userDao.delete();
        userDao.find();
    }

    @Test
    public void demo2() {
        UserDao userDao = new UserDaoImpl();
        UserDao proxy = (UserDao) new MyJdkProxy(userDao).createProxy();
        proxy.save();
        proxy.find();
        proxy.delete();
        proxy.update();
    }
}
