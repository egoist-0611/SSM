package com.atguigu.test2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("生命周期3：后置处理器-初始化前");
//        System.out.println(bean);
//        System.out.println(beanName);
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("生命周期5：后置处理器-初始化后");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
