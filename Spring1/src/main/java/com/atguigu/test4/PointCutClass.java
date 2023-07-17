package com.atguigu.test4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class PointCutClass {
    @Before("execution(public int com.atguigu.test4.CalculatorImpl.add(int,int))")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("前置通知执行");
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("执行方法：" + signature.getName() + "，参数：" + Arrays.toString(args));
    }
}
