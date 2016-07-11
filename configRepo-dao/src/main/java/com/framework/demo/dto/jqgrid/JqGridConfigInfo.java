package com.framework.demo.dto.jqgrid;

import java.io.Serializable;

public class JqGridConfigInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pmenuName;

	private String menuName;

	private String kind;
	/**
	 * 页面有的table数量
	 */

	private String tablenum;


	/**
	 * 是否实时
	 */
	private String realtime;


	/**
	 * 预显示字段及中文名（第一个表格）
	 */

	private String param1;
	/**
	 * 表格标题名称 1
	 */

	private String title1;

	/**
	 * 第一个sql信息
	 */

	private String datasql1;
	/**
	 * 预显示字段及中文名（第二个表格）
	 */

	private String param2;

	/**
	 * 表格标题名称 2
	 */
	private String title2;

	/**
	 * 第二个sql信息
	 */
	private String datasql2;
	/**
	 * 预显示字段及中文名（第三个表格）
	 */
	private String param3;
	/**
	 * 表格标题名称 3
	 */

	private String title3;
	/**
	 * 第三个sql信息
	 */
	private String datasql3;
	
	private String time1;
	
	private String time2;
	
	private String time3;

	private String starttime;

	private String endtime;
	
    private String modl;

	private String timer;

	private String comitmentareaDs1;

	private String comitmentareaDs2;

	private String comitmentareaDs3;

	private String otherNumJq;

	private String sql1;

	private String sql2;

	private  String sql3;

	private String sql4;

	private String sql5;

	private String timetype;

	/*时间多维度添加2016-3-3*/
	private String multime;

	private String daynum;

	//第一个是否上颜色
	private String iscolor1;
	//第二个table是否上颜色
	private String iscolor2;
	//第三个table是否配置颜色
	private String iscolor3;
	//第一个 -1颜色
	private String col1_cols_1;
	//第一个 -2颜色
	private String col1_cols_2;
	//第一个 -3颜色
	private String col1_cols_3;
	//第二个 -1颜色
	private String col2_cols_1;
	//第二个 -2颜色
	private String col2_cols_2;
	//第二个 -3颜色
	private String col2_cols_3;
	//第三个 -1颜色
	private String col3_cols_1;
	//第三个 -2颜色
	private String col3_cols_2;
	//第三个 -3颜色
	private String col3_cols_3;

	private String col1_data_1_from;

	private String col1_data_1_to;

	private String col1_data_2_from;

	private String col1_data_2_to;

	private String col1_data_3_from;

	private String col1_data_3_to;

	private String col2_data_1_from;

	private String col2_data_1_to;

	private String col2_data_2_to;

	private String col2_data_2_from;

	private String col2_data_3_to;

	private String col2_data_3_from;

	private String col3_data_1_from;

	private String col3_data_1_to;

	private String col3_data_2_from;

	private String col3_data_2_to;

	private String col3_data_3_from;

	private  String otherOption;

	private String col3_data_3_to;

   private String reportKind;

	private String option1;

	private String option2;

	private String option3;

	private String option4;

	private String option5;


	private JdData[] jdData;
	public JdData[] getJdData() {
		return jdData;
	}

	public void setJdData(JdData[] jdData) {
		this.jdData = jdData;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getOption5() {
		return option5;
	}

	public void setOption5(String option5) {
		this.option5 = option5;
	}

	public String getOtherOption() {
		return otherOption;
	}

	public void setOtherOption(String otherOption) {
		this.otherOption = otherOption;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getReportKind() {
		return reportKind;
	}

	public void setReportKind(String reportKind) {
		this.reportKind = reportKind;
	}

	public String getRealtime() {
		return realtime;
	}

	public void setRealtime(String realtime) {
		this.realtime = realtime;
	}



	public String getIscolor1() {
		return iscolor1;
	}

	public void setIscolor1(String iscolor1) {
		this.iscolor1 = iscolor1;
	}

	public String getIscolor2() {
		return iscolor2;
	}

	public void setIscolor2(String iscolor2) {
		this.iscolor2 = iscolor2;
	}

	public String getIscolor3() {
		return iscolor3;
	}

	public void setIscolor3(String iscolor3) {
		this.iscolor3 = iscolor3;
	}

	public String getCol1_cols_1() {
		return col1_cols_1;
	}

	public String getSql5() {
		return sql5;
	}

	public void setSql5(String sql5) {
		this.sql5 = sql5;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getModl() {
		return modl;
	}

	public void setModl(String modl) {
		this.modl = modl;
	}

	public String getComitmentareaDs1() {
		return comitmentareaDs1;
	}

	public void setComitmentareaDs1(String comitmentareaDs1) {
		this.comitmentareaDs1 = comitmentareaDs1;
	}

	public String getComitmentareaDs2() {
		return comitmentareaDs2;
	}

	public void setComitmentareaDs2(String comitmentareaDs2) {
		this.comitmentareaDs2 = comitmentareaDs2;
	}

	public String getComitmentareaDs3() {
		return comitmentareaDs3;
	}

	public void setComitmentareaDs3(String comitmentareaDs3) {
		this.comitmentareaDs3 = comitmentareaDs3;
	}

	public String getOtherNumJq() {
		return otherNumJq;
	}

	public void setOtherNumJq(String otherNumJq) {
		this.otherNumJq = otherNumJq;
	}

	public String getSql1() {
		return sql1;
	}

	public void setSql1(String sql1) {
		this.sql1 = sql1;
	}

	public String getSql2() {
		return sql2;
	}

	public void setSql2(String sql2) {
		this.sql2 = sql2;
	}

	public String getSql3() {
		return sql3;
	}

	public void setSql3(String sql3) {
		this.sql3 = sql3;
	}

	public String getSql4() {
		return sql4;
	}

	public void setSql4(String sql4) {
		this.sql4 = sql4;
	}

	public void setCol1_cols_1(String col1_cols_1) {
		this.col1_cols_1 = col1_cols_1;
	}

	public String getCol1_cols_2() {
		return col1_cols_2;
	}

	public void setCol1_cols_2(String col1_cols_2) {
		this.col1_cols_2 = col1_cols_2;
	}

	public String getCol1_cols_3() {
		return col1_cols_3;
	}

	public void setCol1_cols_3(String col1_cols_3) {
		this.col1_cols_3 = col1_cols_3;
	}

	public String getCol2_cols_1() {
		return col2_cols_1;
	}

	public void setCol2_cols_1(String col2_cols_1) {
		this.col2_cols_1 = col2_cols_1;
	}

	public String getCol2_cols_2() {
		return col2_cols_2;
	}

	public void setCol2_cols_2(String col2_cols_2) {
		this.col2_cols_2 = col2_cols_2;
	}

	public String getCol2_cols_3() {
		return col2_cols_3;
	}

	public void setCol2_cols_3(String col2_cols_3) {
		this.col2_cols_3 = col2_cols_3;
	}

	public String getCol3_cols_1() {
		return col3_cols_1;
	}

	public void setCol3_cols_1(String col3_cols_1) {
		this.col3_cols_1 = col3_cols_1;
	}

	public String getCol3_cols_2() {
		return col3_cols_2;
	}

	public void setCol3_cols_2(String col3_cols_2) {
		this.col3_cols_2 = col3_cols_2;
	}

	public String getCol3_cols_3() {
		return col3_cols_3;
	}

	public void setCol3_cols_3(String col3_cols_3) {
		this.col3_cols_3 = col3_cols_3;
	}

	public String getCol1_data_1_from() {
		return col1_data_1_from;
	}

	public void setCol1_data_1_from(String col1_data_1_from) {
		this.col1_data_1_from = col1_data_1_from;
	}

	public String getCol1_data_1_to() {
		return col1_data_1_to;
	}

	public void setCol1_data_1_to(String col1_data_1_to) {
		this.col1_data_1_to = col1_data_1_to;
	}

	public String getCol1_data_2_from() {
		return col1_data_2_from;
	}

	public void setCol1_data_2_from(String col1_data_2_from) {
		this.col1_data_2_from = col1_data_2_from;
	}

	public String getCol1_data_2_to() {
		return col1_data_2_to;
	}

	public void setCol1_data_2_to(String col1_data_2_to) {
		this.col1_data_2_to = col1_data_2_to;
	}

	public String getCol1_data_3_from() {
		return col1_data_3_from;
	}

	public void setCol1_data_3_from(String col1_data_3_from) {
		this.col1_data_3_from = col1_data_3_from;
	}

	public String getCol1_data_3_to() {
		return col1_data_3_to;
	}

	public void setCol1_data_3_to(String col1_data_3_to) {
		this.col1_data_3_to = col1_data_3_to;
	}

	public String getCol2_data_1_from() {
		return col2_data_1_from;
	}

	public void setCol2_data_1_from(String col2_data_1_from) {
		this.col2_data_1_from = col2_data_1_from;
	}

	public String getCol2_data_1_to() {
		return col2_data_1_to;
	}

	public void setCol2_data_1_to(String col2_data_1_to) {
		this.col2_data_1_to = col2_data_1_to;
	}

	public String getCol2_data_2_to() {
		return col2_data_2_to;
	}

	public void setCol2_data_2_to(String col2_data_2_to) {
		this.col2_data_2_to = col2_data_2_to;
	}

	public String getCol2_data_2_from() {
		return col2_data_2_from;
	}

	public void setCol2_data_2_from(String col2_data_2_from) {
		this.col2_data_2_from = col2_data_2_from;
	}

	public String getCol2_data_3_to() {
		return col2_data_3_to;
	}

	public void setCol2_data_3_to(String col2_data_3_to) {
		this.col2_data_3_to = col2_data_3_to;
	}

	public String getCol2_data_3_from() {
		return col2_data_3_from;
	}

	public void setCol2_data_3_from(String col2_data_3_from) {
		this.col2_data_3_from = col2_data_3_from;
	}

	public String getCol3_data_1_from() {
		return col3_data_1_from;
	}

	public void setCol3_data_1_from(String col3_data_1_from) {
		this.col3_data_1_from = col3_data_1_from;
	}

	public String getCol3_data_1_to() {
		return col3_data_1_to;
	}

	public void setCol3_data_1_to(String col3_data_1_to) {
		this.col3_data_1_to = col3_data_1_to;
	}

	public String getCol3_data_2_from() {
		return col3_data_2_from;
	}

	public void setCol3_data_2_from(String col3_data_2_from) {
		this.col3_data_2_from = col3_data_2_from;
	}

	public String getCol3_data_2_to() {
		return col3_data_2_to;
	}

	public void setCol3_data_2_to(String col3_data_2_to) {
		this.col3_data_2_to = col3_data_2_to;
	}

	public String getCol3_data_3_from() {
		return col3_data_3_from;
	}

	public void setCol3_data_3_from(String col3_data_3_from) {
		this.col3_data_3_from = col3_data_3_from;
	}

	public String getCol3_data_3_to() {
		return col3_data_3_to;
	}

	public void setCol3_data_3_to(String col3_data_3_to) {
		this.col3_data_3_to = col3_data_3_to;
	}

	public String getPmenuName() {
		return pmenuName;
	}

	public void setPmenuName(String pmenuName) {
		this.pmenuName = pmenuName;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getTablenum() {
		return tablenum;
	}

	public void setTablenum(String tablenum) {
		this.tablenum = tablenum;
	}



	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}



	public String getDatasql1() {
		return datasql1;
	}

	public void setDatasql1(String datasql1) {
		this.datasql1 = datasql1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}



	public String getDatasql2() {
		return datasql2;
	}

	public void setDatasql2(String datasql2) {
		this.datasql2 = datasql2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public String getTitle3() {
		return title3;
	}

	public void setTitle3(String title3) {
		this.title3 = title3;
	}


	public String getDatasql3() {
		return datasql3;
	}

	public void setDatasql3(String datasql3) {
		this.datasql3 = datasql3;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public String getTime2() {
		return time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public String getTime3() {
		return time3;
	}

	public void setTime3(String time3) {
		this.time3 = time3;
	}



	public String getTimer() {
		return timer;
	}

	public void setTimer(String timer) {
		this.timer = timer;
	}



	public String getTimetype() {
		return timetype;
	}

	public void setTimetype(String timetype) {
		this.timetype = timetype;
	}

	public String getMultime() {
		return multime;
	}

	public void setMultime(String multime) {
		this.multime = multime;
	}

	public String getDaynum() {
		return daynum;
	}

	public void setDaynum(String daynum) {
		this.daynum = daynum;
	}
}
