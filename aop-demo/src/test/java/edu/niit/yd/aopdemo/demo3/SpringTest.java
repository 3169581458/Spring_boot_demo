package edu.niit.yd.aopdemo.demo3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ABC
 * @date 2020/3/18 11:23
 */
@SpringBootTest
public class SpringTest {
    @Autowired
    private ProductDao productDao;

    @Test
    public void test1() {
        productDao.save();
        productDao.delete();
        productDao.findAll();
        productDao.findOne();
        productDao.update();
    }
}
