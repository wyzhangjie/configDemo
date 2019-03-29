package com.framework.demo.web.controller.spring;

import com.framework.demo.service.menu.MenuService;
import com.github.fartherp.framework.core.util.SpringProxyUtils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by demo .
 * Auth: hyssop
 * Date: 2016-09-12-12:32
 */
public class ServiceProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
       Object proxy = beanFactory.getBean("menuService");
        System.out.println(SpringProxyUtils.isTransactional(proxy));

       MenuService menuService = (MenuService)SpringProxyUtils.getRealTarget(proxy);
       int id = menuService.selectIdByName("逻辑删除列表");
        SpringProxyUtils.removeTransactional(proxy);
        id = ((MenuService)proxy).selectIdByName("逻辑删除列表");


    }
}
