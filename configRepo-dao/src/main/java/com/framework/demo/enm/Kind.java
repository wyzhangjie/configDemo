package com.framework.demo.enm;

/**
 * @author hassop
 * @Description
 * @date 2016/7/29 0029
 * To change this template use File | Settings | File Templates.
 */
public enum Kind {
    line("line","线型"),
    bar("bar","柱状图"),
    pie("pie","饼状图"),
    area("area","面积图"),
    hline("hline","旋风条形图"),
    thermometer("thermometer","温度计式图表"),
    ldatazoom("ldatazoom","带时间轴的线型"),
    stackbar("stackbar","堆积图");

    private final String value;
    private final String code;
    private Kind(String code ,String value){
        this.code =code;
        this.value =value;
    }

    public static String[] getValues(){
       Kind[] kinds= Kind.values();
        String[] values=new String[kinds.length];
        for(int i=0;i<kinds.length;i++){
            values[i]=kinds[i].getValue();
        }
        return values;
    }
    public static String[] getCodes(){
        Kind[] kinds= Kind.values();
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
