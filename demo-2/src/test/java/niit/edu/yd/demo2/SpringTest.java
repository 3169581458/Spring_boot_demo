package niit.edu.yd.demo2;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ABC
 * @date 2020/3/16 10:50
 */
@SpringBootTest
@Slf4j
public class SpringTest {
    //    @Autowired
//    ValueDemo valueDemo;
    @Autowired
    private UserService service;

    @Test
    public void test1() {
        String str = service.sayHello("abc");

    }

    @Test
    public void testEat() {
        service.eat();
    }

    @Test
    public void testSave() {
        service.save();
    }
}
