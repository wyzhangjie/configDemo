package com.framework.demo.dto.echarts;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component("outputParams")
public class OutputParams {
	/**
	 * 横坐标
	 */
	private String[] category;
	/**
	 * 数据集
	 */
	private List data;
    /**
     * 从前台获取到的参数及参数对应的中文汉字
     */
	private Map params;
	
	/**
	 * 从前台获取到的图形类型
	 */
	private String kind;

	/**
	 * stack 是否为堆积图
	 */
	private String stack;
	
	/**
	 * legend 对应的字段名字
	 */
	private String[] legend;
	
	/**
	 * 在填充pie的时候，数值对应的字段名称
	 */
	private String[] lvalue;
//sql每个sql对应的坐标轴，默认是0 格式是：0-0，1-1
	private String[] sqlYaxis;
//两个坐标轴名称。格式：左坐标轴|右坐标轴
	private String[] yaxisNames;
	//实时报表
	private String realtime;

	private String timetype;
	//百分号
	private String ispercent;
	//双轴左侧图例数量
	private String leftLegendNum;
	//最大值和最小值
	private String maxandmin;
	//平均值
	private String average;

	public String getLeftLegendNum() {
		return leftLegendNum;
	}

	public void setLeftLegendNum(String leftLegendNum) {
		this.leftLegendNum = leftLegendNum;
	}

	public String getAverage() {
		return average;
	}

	public void setAverage(String average) {
		this.average = average;
	}

	public String getMaxandmin() {
		return maxandmin;
	}

	public void setMaxandmin(String maxandmin) {
		this.maxandmin = maxandmin;
	}

	public String getIspercent() {
		return ispercent;
	}

	public void setIspercent(String ispercent) {
		this.ispercent = ispercent;
	}

	public String[] getCategory() {
		return category;
	}
	public void setCategory(String[] category) {
		this.category = category;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	public Map getParams() {
		return params;
	}
	public void setParams(Map params) {
		this.params = params;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getStack() {
		return stack;
	}
	public void setStack(String stack) {
		this.stack = stack;
	}
	public String[] getLegend() {
		return legend;
	}
	public void setLegend(String[] legend) {
		this.legend = legend;
	}
	public String[] getLvalue() {
		return lvalue;
	}
	public void setLvalue(String[] lvalue) {
		this.lvalue = lvalue;
	}


	public String[] getSqlYaxis() {
		return sqlYaxis;
	}

	public void setSqlYaxis(String[] sqlYaxis) {
		this.sqlYaxis = sqlYaxis;
	}

	public String[] getYaxisNames() {
		return yaxisNames;
	}

	public void setYaxisNames(String[] yaxisNames) {
		this.yaxisNames = yaxisNames;
	}

	public String getRealtime() {
		return realtime;
	}

	public void setRealtime(String realtime) {
		this.realtime = realtime;
	}

	public String getTimetype() {
		return timetype;
	}

	public void setTimetype(String timetype) {
		this.timetype = timetype;
	}
}
