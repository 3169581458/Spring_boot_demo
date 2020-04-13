package edu.niit.yd.aopdemo.demo1;

/**
 * @author ABC
 * @date 2020/3/18 9:30
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void update() {
        System.out.println("修改用户。。。");
    }

    @Override
    public void delete() {
        System.out.println("删除用户。。。");
    }

    @Override
    public void find() {
        System.out.println("查找用户。。。");
    }

    @Override
    public void save() {
        System.out.println("保存用户。。。");
    }
}
