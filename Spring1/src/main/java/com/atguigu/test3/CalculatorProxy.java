package com.atguigu.test3;

public class CalculatorProxy implements Calculator {

    private Calculator target;

    public CalculatorProxy(Calculator target) {
        this.target = target;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("执行加法运算");
        System.out.println("参数值：" + a + "," + b);
        int res = target.add(a, b);
        System.out.println("执行结果：" + res);
        return res;
    }

    @Override
    public int minus(int a, int b) {
        System.out.println("执行减法运算");
        System.out.println("参数值：" + a + "," + b);
        int res = target.minus(a, b);
        System.out.println("执行结果：" + res);
        return res;
    }
}
