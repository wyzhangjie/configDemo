package com.framework.demo.dto.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by user on 2015/9/15.
 */
@Component("templateFactory")
public class TemplateFactory extends AbstractTemplateFactory {
    Logger logger = LoggerFactory.getLogger(AreaTemplate.class);


    public <T extends DataTemplate> T createTemplate(Class<T> c) {
        DataTemplate template =null;
        try{
            template = (DataTemplate) Class.forName(c.getName()).newInstance();
        }catch (Exception ex){

        }
        return (T)template;
    }
}
