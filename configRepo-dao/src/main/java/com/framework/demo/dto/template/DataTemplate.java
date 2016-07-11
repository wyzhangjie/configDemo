package com.framework.demo.dto.template;


import com.framework.demo.dto.echarts.OutputParams;
import com.framework.demo.dto.page.DataVelodity;

/**
 * Created by user on 2015/9/14.
 */
public interface DataTemplate {

public  <T> DataVelodity fillTemplate(OutputParams outputParams) throws Exception;


}
