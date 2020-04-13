package edu.niit.yd.aopdemo.demo3;

import org.springframework.stereotype.Repository;

/**
 * @author ABC
 * @date 2020/3/18 11:17
 */
@Repository
public class ProductDao {
    public void update() {
        System.out.println("更新商品。。。");
    }

    public void delete() {
        System.out.println("删除商品。。。");
    }

    public void findOne() {
        System.out.println("查找一个商品。。。");
    }

    public void save() {
        System.out.println("保存商品。。。");
    }

    public void findAll() {
        System.out.println("查找全部商品。。。");
    }
}
