package com.framework.demo.dto.echarts;

/**
 * 在配置gauge里面的各个字段
 * @author zj
 *
 */

public class Gauge {

	
	 private String name;
	 
	 private DataKV data;
	 
	 private Object min;
	 
	 private Object max;
	 
	 private Object splitNumber;
	 
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DataKV getData() {
		return data;
	}

	public void setData(DataKV data) {
		this.data = data;
	}



	public Object getMin() {
		return min;
	}

	public void setMin(Object min) {
		this.min = min;
	}

	public Object getMax() {
		return max;
	}

	public void setMax(Object max) {
		this.max = max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public Object getSplitNumber() {
		return splitNumber;
	}

	public void setSplitNumber(Object splitNumber) {
		this.splitNumber = splitNumber;
	}
	 
	 
}
