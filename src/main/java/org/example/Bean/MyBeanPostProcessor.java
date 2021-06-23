package org.example.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("调用【BeanPostProcessor】的【postProcessBeforeInitialization】方法");
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("调用【BeanPostProcessor】的【postProcessAfterInitialization】方法");
        return bean;
    }
}