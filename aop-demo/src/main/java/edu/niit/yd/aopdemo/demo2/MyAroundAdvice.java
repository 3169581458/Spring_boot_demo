package edu.niit.yd.aopdemo.demo2;

import org.aopalliance.intercept.Joinpoint;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.invoke.MethodHandleInfo;
import java.sql.SQLOutput;

/**
 * @author ABC
 * @date 2020/3/18 10:41
 */
public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前增强------");
        Object obj = invokation.
                System.out.println("环绕后增强------");
        return obj;
    }
}
