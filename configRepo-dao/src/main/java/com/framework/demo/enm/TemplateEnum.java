package com.framework.demo.enm;

import com.framework.demo.dto.template.*;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/5/25 0025
 * To change this template use File | Settings | File Templates.
 */
public enum TemplateEnum {

    Line("line", LineTemplate.class),
    Bar("bar",BarTemplate.class),
    PIE("pie", PieTemplate.class),
    AREA("area", AreaTemplate.class),
    HLINE("hline", HlineTemplate.class),
    YLINE("yline",YlinesTemplate.class),
    THERMOMETER("thermometer",Thertemplate.class),
    STACKBAR("stackbar",StackBarTemplate.class),
    lDATAZOOM("ldatazoom",LDataZoomTemplate.class);
    /**
     * 代码
     */
    private String code;
    /**
     * 路径名称
     */
    private Class tClass;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Class gettClass() {
        return tClass;
    }

    public void settClass(Class tClass) {
        this.tClass = tClass;
    }



    private TemplateEnum(String code, Class tClass) {
        this.code = code;
        this.tClass = tClass;
    }
}



