package edu.niit.springboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author : zhayh
 * @date : 2020-3-16 17:01
 * @description :
 */

public class AfterApplicationContextInitializer<C extends ConfigurableApplicationContext>
        implements ApplicationContextInitializer<C>, Ordered {
    @Override
    public void initialize(C applicationContext) {
        System.out.println("After Application.id = " + applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
