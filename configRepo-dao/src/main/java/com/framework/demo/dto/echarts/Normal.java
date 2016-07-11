package com.framework.demo.dto.echarts;

import java.io.Serializable;

/**
 * Created by user on 2015/9/2.
 */
public class Normal implements Serializable {
    //    itemStyle: {normal: {areaStyle: {type: 'default'}}},
   private  AreaStyle areaStyle;

    private Label label;


    public AreaStyle getAreaStyle() {
        return areaStyle;
    }

    public void setAreaStyle(AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
