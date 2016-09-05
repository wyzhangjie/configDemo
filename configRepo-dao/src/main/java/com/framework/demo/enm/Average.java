package com.framework.demo.enm;

/**
 * @author hassop
 * @Description
 * @date 2016/7/29 0029
 * To change this template use File | Settings | File Templates.
 */
public enum Average {
    no("00","否"),
    yes("11","是");
    private final String value;
    private final String code;
    private Average(String code ,String value){
        this.code =code;
        this.value =value;
    }
    public static String[] getValues(){
        Average[] kinds= Average.values();
        String[] values=new String[kinds.length];
        for(int i=0;i<kinds.length;i++){
            values[i]=kinds[i].getValue();
        }
        return values;
    }
    public static String[] getCodes(){
        Average[] kinds= Average.values();
        String[] values=new String[kinds.length];
        for(int i=0;i<kinds.length;i++){
            values[i]=kinds[i].getCode();
        }
        return values;
    }

    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }
}
