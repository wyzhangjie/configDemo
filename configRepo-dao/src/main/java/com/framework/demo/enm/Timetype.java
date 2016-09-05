package com.framework.demo.enm;

/**
 * @author hassop
 * @Description
 * @date 2016/7/29 0029
 * To change this template use File | Settings | File Templates.
 */
public enum Timetype {
    now("0","前一个时间段"),
    notnow("1","当前时间段");

    private final String value;
    private final String code;
    private Timetype(String code ,String value){
        this.code =code;
        this.value =value;
    }

    public static String[] getValues(){
        Timetype[] kinds= Timetype.values();
        String[] values=new String[kinds.length];
        for(int i=0;i<kinds.length;i++){
            values[i]=kinds[i].getValue();
        }
        return values;
    }
    public static String[] getCodes(){
        Timetype[] kinds= Timetype.values();
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
