package com.framework.demo.dto.template;

/**
 * Created by user on 2015/9/15.
 */
public abstract class AbstractTemplateFactory {
 public abstract  <T extends DataTemplate> T  createTemplate(Class<T> c);
}
