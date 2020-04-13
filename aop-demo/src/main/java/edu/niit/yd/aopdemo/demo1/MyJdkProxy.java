package edu.niit.yd.aopdemo.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ABC
 * @date 2020/3/18 9:30
 */
public class MyJdkProxy implements InvocationHandler {
    private UserDao userDao;

    public MyJdkProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    ;

    public Object createProxy() {
        return Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("save".equals(method.getName())) {
            System.out.println("权限校验");
            return method.invoke(userDao, args);
        }
        return null;
    }

    public static void main(String[] args) {
        UserDao userDao = (UserDao) new MyJdkProxy(new UserDaoImpl()).createProxy();
        userDao.save();
    }
}
