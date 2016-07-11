package com.framework.demo.dto.echarts;

import java.io.Serializable;

/**
 * Created by user on 2015/9/2.
 */
public class AreaStyle implements Serializable {
    //    itemStyle: {normal: {areaStyle: {type: 'default'}}},
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
