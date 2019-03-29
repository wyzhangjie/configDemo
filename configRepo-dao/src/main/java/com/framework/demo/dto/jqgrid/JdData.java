package com.framework.demo.dto.jqgrid;


import com.github.fartherp.framework.database.mybatis.plugin.page.BaseVo;
import java.util.List;

public class JdData extends BaseVo {

	/**
	 * 查询出的记录数
	 */
	private Integer records;

	private List<ColModel> colModels;

	private String data;
	
	private Integer page;
	

	
	private String colMdelStr;

	private String addInfo;
	/*表格注释标注2016-2-23*/
	private String jqComit;

	private TemplColor templColor;




	public String getColMdelStr() {
		return colMdelStr;
	}

	public void setColMdelStr(String colMdelStr) {
		this.colMdelStr = colMdelStr;
	}

	public List<ColModel> getColModels() {
		return colModels;
	}

	public void setColModels(List<ColModel> colModels) {
		this.colModels = colModels;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}



	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}






	public String getAddInfo() {
		return addInfo;
	}

	public void setAddInfo(String addInfo) {
		this.addInfo = addInfo;
	}

	public String getJqComit() {
		return jqComit;
	}

	public void setJqComit(String jqComit) {
		this.jqComit = jqComit;
	}

	public TemplColor getTemplColor() {
		return templColor;
	}
	public void setTemplColor(TemplColor templColor) {
		this.templColor = templColor;
	}
}
