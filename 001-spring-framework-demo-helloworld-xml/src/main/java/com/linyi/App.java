package com.linyi;

import com.linyi.service.AopDemoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author linyi
 * @date 2022/7/13
 * 1.0
 */

/**
 * 基于XML的声明式AspectJ存在一些不足，需要在Spring配置文件配置大量的代码信息，
 * 为了解决这个问题，Spring 使用了@AspectJ框架为AOP的实现提供了一套注解
 */
public class App {
    /**
     * main interfaces.
     *
     * @param args args
     */
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml");

        // retrieve configured instance
        AopDemoServiceImpl service = context.getBean("demoService", AopDemoServiceImpl.class);

        // use configured instance
        service.doMethod1();
        service.doMethod2();
        try {
            service.doMethod3();
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }
}
