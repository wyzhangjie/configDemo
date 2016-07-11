package com.framework.demo.dto.echarts;

import java.util.List;

public class Series extends SeriousBase  {
	/**
	 * 对应series里面的name字段
	 */
	private String name;


	/**
	 * 对应series里面的type字段
	 */
	private String type;

	/**
	 * 双轴坐标
	 */
	private int yAxisIndex;

	
	/**
	 * 对应series里面的data字段
	 */
	private List<Double> data;
	
	private String value;
	/**
	 * 柱子的宽度
	 */
	private Integer barWidth;
	
	/**
	 * 柱子宽度上限
	 */
	private Integer barMaxWidth;
	
	/**
	 * 柱子宽度的下限	
	 *
	 */
	private Integer barMinHeight;
	/**
	 * 类目间柱形距离
	 */
	private ItemStyle itemStyle;

	private String barCategoryGap;
	
	private String barGap;
	
	/**
	 * 堆积名称
	 */
	private String stack;
	
	
	private boolean smooth=true;

	private MarkLine markLine;

	private MarkPoint markPoint;
	
	public boolean isSmooth() {
		return smooth;
	}

	public void setSmooth(boolean smooth) {
		this.smooth = smooth;
	}

	public Integer getBarMaxWidth() {
		return barMaxWidth;
	}

	public void setBarMaxWidth(Integer barMaxWidth) {
		this.barMaxWidth = barMaxWidth;
	}

	public Integer getBarMinHeight() {
		return barMinHeight;
	}

	public void setBarMinHeight(Integer barMinHeight) {
		this.barMinHeight = barMinHeight;
	}

	public String getBarCategoryGap() {
		return barCategoryGap;
	}



	public Integer getBarWidth() {
		return barWidth;
	}

	public void setBarWidth(Integer barWidth) {
		this.barWidth = barWidth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Double> getData() {
		return data;
	}

	public void setData(List<Double> data) {
		this.data = data;
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}



	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}

	public ItemStyle getItemStyle() {
		return itemStyle;
	}

	public void setItemStyle(ItemStyle itemStyle) {
		this.itemStyle = itemStyle;
	}

	public MarkLine getMarkLine() {
		return markLine;
	}

	public void setMarkLine(MarkLine markLine) {
		this.markLine = markLine;
	}

	public MarkPoint getMarkPoint() {
		return markPoint;
	}

	public void setMarkPoint(MarkPoint markPoint) {
		this.markPoint = markPoint;
	}


	public int getYAxisIndex() {
		return yAxisIndex;
	}

	public void setYAxisIndex(int yAxisIndex) {
		this.yAxisIndex = yAxisIndex;
	}

	public void setBarCategoryGap(String barCategoryGap) {
		this.barCategoryGap = barCategoryGap;
	}

	public String getBarGap() {
		return barGap;
	}

	public void setBarGap(String barGap) {
		this.barGap = barGap;
	}
}
