package org.example.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return null;
    }

    public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException {
        System.out.println("调用【InstantiationAwareBeanPostProcessor】的【postProcessBeforeInstantiation】方法");
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return null;
    }

    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("调用【InstantiationAwareBeanPostProcessor】的【postProcessAfterInstantiation】方法");
        return true;
    }

    public PropertyValues postProcessPropertyValues(PropertyValues propertyValues, PropertyDescriptor[] propertyDescriptors, Object o, String s) throws BeansException {
        return null;
    }

    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("调用【InstantiationAwareBeanPostProcessor】的【postProcessProperties】方法");
        return pvs;
    }


}