package com.framework.demo.web.controller.converter;

import cn.vansky.framework.core.dao.FieldAccessVo;
import com.framework.demo.bo.showcaseSample.ShowcaseSample;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.core.convert.converter.Converter;

/**
 * @author hassop
 * @Description
 * @date 2016/8/31 0031
 * To change this template use File | Settings | File Templates.
 */
public class StringToShowcaseSampleConverter implements Converter<String,ShowcaseSample> {

    @Override
    public ShowcaseSample convert(String source) {
        ShowcaseSample showcaseSample = new ShowcaseSample();
        BeanWrapper beanWrapper = new BeanWrapperImpl(showcaseSample);
        beanWrapper.setPropertyValue("id",source);
        return (ShowcaseSample)beanWrapper.getWrappedInstance();
    }
}
