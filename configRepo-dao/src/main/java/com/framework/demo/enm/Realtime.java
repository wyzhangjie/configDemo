package com.framework.demo.enm;

/**
 * @author hassop
 * @Description
 * @date 2016/7/29 0029
 * To change this template use File | Settings | File Templates.
 */
public enum Realtime {

    notreal("00","非实时"),
    real("01","实时");
    private final String value;
    private final String code;
    private Realtime(String code ,String value){
        this.code =code;
        this.value =value;
    }


    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }
    public static String[] getValues(){
        Realtime[] kinds= Realtime.values();
        String[] values=new String[kinds.length];
        for(int i=0;i<kinds.length;i++){
            values[i]=kinds[i].getValue();
        }
        return values;
    }
    public static String[] getCodes(){
        Realtime[] kinds= Realtime.values();
        String[] values=new String[kinds.length];
        for(int i=0;i<kinds.length;i++){
            values[i]=kinds[i].getCode();
        }
        return values;
    }
}
