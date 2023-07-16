package com.atguigu.test3;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void test2(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator calculator = (Calculator) proxyFactory.getProxyObj();
        int res = calculator.add(10, 20);
        System.out.println(res);
    }
    @Test
    public void test1(){
        CalculatorProxy proxy = new CalculatorProxy(new CalculatorImpl());
        int res1 = proxy.add(10, 20);
        int res2 = proxy.minus(10, 20);
        System.out.println(res1);
        System.out.println(res2);
    }
}
