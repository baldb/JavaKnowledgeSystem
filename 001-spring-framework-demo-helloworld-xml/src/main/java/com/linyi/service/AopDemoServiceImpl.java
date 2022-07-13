package com.linyi.service;

/**
 * @author linyi
 * @date 2022/7/13
 * 1.0
 */

/**
 * 目标类
 * 将切面编程LogAspect织入到这
 */
public class AopDemoServiceImpl {
    public void doMethod1() {
        System.out.println("AopDemoServiceImpl.doMethod1()");
    }

    public String doMethod2() {
        System.out.println("AopDemoServiceImpl.doMethod2()");
        return "hello world";
    }

    public String doMethod3() throws Exception {
        System.out.println("AopDemoServiceImpl.doMethod3()");
        throw new Exception("some exception");
    }
}
