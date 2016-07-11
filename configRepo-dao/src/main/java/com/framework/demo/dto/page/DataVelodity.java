package com.framework.demo.dto.page;

import com.framework.demo.dto.echarts.PieSeries;
import com.framework.demo.dto.echarts.Series;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("dataVelodity")
public class DataVelodity {
	
	private List<String> categoryList=new ArrayList<String>();
	
    private List<String> legendList = new ArrayList<String>();
    
    private List<Series> seriesList = new ArrayList<Series>();
    
    private List<PieSeries> pieSeriesList=new ArrayList<PieSeries>();
    
    private String pieData;
    
    private String tableData;
    
    

	public List<String> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}

	public List<String> getLegendList() {
		return legendList;
	}

	public void setLegendList(List<String> legendList) {
		this.legendList = legendList;
	}

	public List<Series> getSeriesList() {
		return seriesList;
	}

	public void setSeriesList(List<Series> seriesList) {
		this.seriesList = seriesList;
	}

	public List<PieSeries> getPieSeriesList() {
		return pieSeriesList;
	}

	public void setPieSeriesList(List<PieSeries> pieSeriesList) {
		this.pieSeriesList = pieSeriesList;
	}

	public String getPieData() {
		return pieData;
	}

	public void setPieData(String pieData) {
		this.pieData = pieData;
	}

	public String getTableData() {
		return tableData;
	}

	public void setTableData(String tableData) {
		this.tableData = tableData;
	}
	
    
}
