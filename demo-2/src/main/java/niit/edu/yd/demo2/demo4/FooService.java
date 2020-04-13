package niit.edu.yd.demo2.demo4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ABC
 * @date 2020/3/16 11:24
 */
@Slf4j
@Component
public class FooService {
    //属性注入
    @Autowired
    private FooFormatter fooFormatter;

    //构造方法注入
    private FooService(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }

    public void setFooFormatter(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }

    public void format() {
        fooFormatter.format();
        log.info("format()的调用结果是{}", fooFormatter.format());
    }
}
