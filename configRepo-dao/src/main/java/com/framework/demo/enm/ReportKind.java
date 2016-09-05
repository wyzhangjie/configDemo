package com.framework.demo.enm;

/**
 * @author hassop
 * @Description
 * @date 2016/7/29 0029
 * To change this template use File | Settings | File Templates.
 */
public enum ReportKind {
    day("日报","日报"),
    week("周报","周报"),
    month("月报","月报"),
    season("季报","季报"),
    year("年报","年报");
    private final String value;
    private final String code;
    private ReportKind(String code ,String value){
        this.code =code;
        this.value =value;
    }

    public static String[] getValues(){
        ReportKind[] kinds= ReportKind.values();
        String[] values=new String[kinds.length];
        for(int i=0;i<kinds.length;i++){
            values[i]=kinds[i].getValue();
        }
        return values;
    }
    public static String[] getCodes(){
        ReportKind[] kinds= ReportKind.values();
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
