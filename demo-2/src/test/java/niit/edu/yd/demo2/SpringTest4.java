package niit.edu.yd.demo2;

import lombok.extern.slf4j.Slf4j;
import niit.edu.yd.demo2.demo4.FooFormatter;
import niit.edu.yd.demo2.demo4.FooService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ABC
 * @date 2020/3/16 11:25
 */
@Slf4j
@SpringBootTest
public class SpringTest4 {
    @Autowired
    private FooService fooService;

//    @Autowired
////    private MyBeanList myBeanList;
////
////    @Autowired
////    private MyBeanMap myBeanMap;

    @Test
    public void test1() {
        fooService.setFooFormatter(new FooFormatter());
        fooService.format();
    }

//    @Test
//    public void testBeanList() {
//        log.info(myBeanList.toString());
//    }
//
//    @Test
//    public void testBeanMap() {
//        log.info(myBeanMap.toString());
//    }
}
