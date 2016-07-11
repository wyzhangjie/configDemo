package com.framework.demo.dto.jqgrid;

import java.io.Serializable;

/**
 * 
 * @author zhangjie
 * 2015.6.25
 *
 */
public class JqGridInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * sql语句 eq:select a.dt, a.name, 	ifnull(a.mem_add_num,0) as mem_add_num,           	ifnull(a.mem_num,0) as mem_num,     	format(ifnull(b.all_reg_amt,0),2) as all_reg_amt, format(ifnull(b.suc_reg_amt,0),2) as suc_reg_amt,  format(ifnull(c.all_cah_amt,0),2) as c_all_cat_amt,         format(ifnull(d.all_cah_amt,0),2) as d_all_cat_amt         from  dm.FCT_BNK_REG_NUM_DAY a  left join   dm.FCT_BNK_RCG_AMT_DAY b 	    	        	on a.dt = b.dt  	    	        	and b.dt={pt}  	    	        	and a.name=b.name  	    	        	left join   	    	        	dm.FCT_BNK_CAH_AMT_DAY c  	    	        	on a.dt=c.dt	        	and c.dt={pt}   	        	and a.name=c.name  	        	left join FCT_BNK_REV_AMT_DAY d	    	        	on a.dt=d.dt	    	        	and a.name=d.name  	   	and d.dt={pt}  	    	        	where a.pt={pt}
	 */
	private String data;

/**
 * 	要显示的字段和对应的中文名称
 */
	private String params;
	/**
	 * 能够独立标示出每一行数据的字段名称。
	 */
	private String uniq;
	/**
	 * 时间
	 */
	private String time;

	private String starttime;

	private String endtime;

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getUniq() {
		return uniq;
	}
	public void setUniq(String uniq) {
		this.uniq = uniq;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
