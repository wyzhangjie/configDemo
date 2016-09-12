package com.framework.demo.web.controller.collection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/7/15 0015
 * To change this template use File | Settings | File Templates.
 */
public class MyFilterFactoryBean implements FactoryBean, BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }


    public Object getObject() throws Exception {
        return new MyBean();
    }


    public Class<?> getObjectType() {
        return null;
    }


    public boolean isSingleton() {
        return true;
    }
}
