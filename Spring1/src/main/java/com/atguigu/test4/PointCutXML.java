package com.atguigu.test4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class PointCutXML {
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("前置通知执行");
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("方法名：" + signature.getName() + "，方法参数：" + Arrays.toString(args));
    }
}
