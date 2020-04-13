package edu.niit.yd.aopdemo.demo2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * @author ABC
 * @date 2020/3/18 10:39
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:demo2.xml")
public class SpringTest {
    @Resource(name = "customerDaoProxy")
    private CustomerDao customerDao;

    @Test
    public void test1() {
        customerDao.find();
        customerDao.delete();
        customerDao.save();
        customerDao.update();
    }
}
