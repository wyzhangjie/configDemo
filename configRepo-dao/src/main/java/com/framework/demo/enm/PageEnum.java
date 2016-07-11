package com.framework.demo.enm;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/5/24 0024
 * To change this template use File | Settings | File Templates.
 */
public enum PageEnum {

    Line("line", "0", "template/linetemplate"),
    AREA("area", "0", "template/areatemplate"),
    BAR("bar", "0", "template/bartemplate"),
    EASYUI("easyuigrid", "0", "template/easyuitemplate"),
    HLINE("hline", "0", "template/hlinetemplate"),
    JQGRID("图表类型", "0", "template/jqgridtemplate"),
    IDATAZOOM("ldatazoom", "0", "template/ldatazoomtemplate"),
    PIE("pie", "0", "template/pietemplate"),
    THERMOMEERTEMPLATE("thermometer", "0", "template/thermoetertemplate"),
    YLB("ylines,line,bar", "0", "template/ylbtemplate"),
    ERROR("error", "0", "error"),
    MultiLine("line", "1", "template/linetemplate"),
    MultiAREA("area", "1", "template/areatemplate"),
    MultiBAR("bar", "1", "template/bartemplate"),
    MultiEASYUI("easyuigrid", "1", "template/easyuitemplate"),
    MultiHLINE("hline", "1", "template/hlinetemplate"),
    MultiJQGRID("图表类型", "1", "template/jqgridtemplate"),
    MultiIDATAZOOM("ldatazoom", "1", "template/ldatazoomtemplate"),
    MultiPIE("pie", "1", "template/pietemplate"),
    MultiTHERMOMEERTEMPLATE("thermometer", "1", "template/thermoetertemplate"),
    MultiYLB("ylines,line,bar", "1", "template/ylbtemplate"),
    MultiERROR("error", "1", "error");
    /**
     * 代码
     */
    private String code;
    /**
     * 路径名称
     */
    private String path;

    private String multime;


    private PageEnum(String code, String multime, String path) {
        this.code = code;
        this.path = path;
        this.multime = multime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMultime() {
        return multime;
    }

    public void setMultime(String multime) {
        this.multime = multime;
    }
}
