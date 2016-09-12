package com.framework.demo.web.controller.converter;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.FieldAccessVo;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;
import org.springframework.core.convert.converter.ConverterRegistry;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.Set;

/**
 * @author hassop
 * @Description
 * @date 2016/8/31 0031
 * To change this template use File | Settings | File Templates.
 */
public class DomainClassConverter<T extends ConversionService & ConverterRegistry> implements
        ConditionalGenericConverter, ApplicationContextAware {

    private  ApplicationContext beanFactory;

    public DomainClassConverter(){
        this.beanFactory = null;
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.beanFactory =applicationContext;
    }


    public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
        if(FieldAccessVo.class.isAssignableFrom(targetType.getObjectType())&&targetType.hasAnnotation(PathVariable.class)){
            return  true;
        }
        return false;
    }


    public Set<ConvertiblePair> getConvertibleTypes() {
        return Collections.singleton(new ConvertiblePair(Object.class, Object.class));
    }


    public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        if (source == null || !StringUtils.hasText(source.toString())) {
            return null;
        }
        Class<?> domainType = targetType.getType();
        String daoImpl = domainType.getSimpleName().substring(0,1).toLowerCase()+domainType.getSimpleName().substring(1, domainType.getSimpleName().length())+"Dao";
        try{
            ConfigurableBaseSqlMapDao bean =(ConfigurableBaseSqlMapDao)beanFactory.getBean(daoImpl);
            return bean.findById(Long.valueOf(source.toString()));
        }catch (Exception e1){

            return null;
        }
  }
}
