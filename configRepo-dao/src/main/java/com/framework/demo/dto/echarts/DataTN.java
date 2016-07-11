package com.framework.demo.dto.echarts;

/**
 * Created by user on 2015/9/6.
 */
public class DataTN {
    private String type;

    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void empty(){
        this.setName("");
        this.setType("");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
