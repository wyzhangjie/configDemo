package com.framework.demo.service.dbservice;


import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.dto.page.Color;
import com.framework.demo.dto.page.OptionResult;
import com.framework.demo.exception.PageTempleteException;
import com.framework.demo.service.exception.MenuException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class DBServerImpl implements DBService{

	Logger logger = LoggerFactory.getLogger(DBServerImpl.class);


	@Autowired
	private  JdbcTemplate  jdbcTemplate;

	@Autowired
	private JdbcTemplate jdbcTemplate1;

	public List<Map<String, Object>>  getData(String sql) throws Exception{
	    /*	SqlRowSet sqlRowSet=jdbcTemplate.queryForRowSet(sql);*/
		List<Map<String, Object>> results=new ArrayList<Map<String,Object>>();
			results=jdbcTemplate.queryForList(sql);
		return results;

	}
	public List<Map<String, Object>> findSqlInfo(String dbtype,String sql) throws DataAccessException {
		List<Map<String, Object>> results=new ArrayList<Map<String,Object>>();
		if(dbtype.equalsIgnoreCase("ywk")){
			results = jdbcTemplate1.queryForList(sql);
		}
		if(dbtype.equalsIgnoreCase("sjk")){
			results= jdbcTemplate.queryForList(sql);
		}
		return results;
	}
	/**
	 * 当新生成表信息的时候，对应的menu、templete都需要更新。
	 * 1、如果menu名称已经存在那么更新menu
	 * 2、如果menu名称不成能在，则插入信息到menu
	 * templete
	 * 1、如果templete对应主标题已经存在一个图表与之对应，则更新sql信息
	 * 2、如果templete对应主标题无存在一个图表与之对应，则新增一条信息
	 */

	@SuppressWarnings("unchecked")
	public int  menuInsert(String table,String pmenuName,String menuName,String urlInfo,String time,PageTemplete pageTemplete) throws MenuException, PageTempleteException {
		String sql=null;
		List<Map<String, Object>> results=new ArrayList<Map<String,Object>>();
		Map param=new HashMap();
		      String timersql=pageTemplete.getTimersql();
		      String legend=pageTemplete.getLegend();
		      String kind=pageTemplete.getKind();
		      String catalog=pageTemplete.getCatalog();
		      String fileName=pageTemplete.getFileName();
		      String filePath=pageTemplete.getFilePath();
		      String title=pageTemplete.getTitle();
		      String subtitle=pageTemplete.getSubtitle();
		      String pmenuName1=pageTemplete.getPmenuName();
		      String menuName1=pageTemplete.getMenuName();
		      String stack=pageTemplete.getStack();
		      String comitment = pageTemplete.getComitment();
		      String reportKind = pageTemplete.getReportKind();
		      String iscolor = pageTemplete.getIscolor1()+"|"+pageTemplete.getIscolor2()+"|"+pageTemplete.getIscolor3();
		      String color1= pageTemplete.getCol1_cols_1()+"|"+pageTemplete.getCol2_cols_1()+"|"+pageTemplete.getCol3_cols_1();
		      String color2 =pageTemplete.getCol1_cols_2()+"|"+pageTemplete.getCol2_cols_2()+"|"+pageTemplete.getCol3_cols_2();
		      String color3 = pageTemplete.getCol1_cols_3()+"|"+pageTemplete.getCol2_cols_3()+"|"+pageTemplete.getCol3_cols_3();
		      String data1_1 = pageTemplete.getCol1_data_1_from()+"|"+pageTemplete.getCol1_data_1_to();
		      String data1_2 =pageTemplete.getCol1_data_2_from()+"|"+pageTemplete.getCol1_data_2_to();
		      String data1_3 =pageTemplete.getCol1_data_3_from()+"|"+pageTemplete.getCol1_data_3_to();
		      String data2_2 = pageTemplete.getCol2_data_2_from()+"|"+pageTemplete.getCol2_data_2_to();
		      String data2_1 = pageTemplete.getCol2_data_1_from()+"|"+pageTemplete.getCol2_data_2_to();
		      String data2_3 = pageTemplete.getCol2_data_3_from()+"|"+pageTemplete.getCol2_data_3_to();
		      String data3_1 = pageTemplete.getCol3_data_1_from()+"|"+pageTemplete.getCol3_data_1_to();
		      String data3_2= pageTemplete.getCol3_data_2_from()+"|"+ pageTemplete.getCol3_data_2_to();
		      String data3_3 = pageTemplete.getCol3_data_3_from() +"|"+pageTemplete.getCol3_data_3_to();
		      String condition1 =data1_1+"^"+data2_1+"^"+data3_1;
		      String condition2 = data1_2+"^"+data2_2+"^"+data3_2;
	      	  String condition3 =data1_3+"^"+data2_3+"^"+data3_3;
		         //实时报表
		      String realtime = pageTemplete.getRealtime();
		      String timetype = pageTemplete.getTimetype();
		      String daynum=pageTemplete.getDaynum();
		     String multime=pageTemplete.getMultime();
			//百分号
			String ispercent=pageTemplete.getIspercent();
			String leftLegendNum=pageTemplete.getLeftLegendNum();
		//最大值和最小值
		String maxandmin=pageTemplete.getMaxandmin();
		//平均值
		String  average=pageTemplete.getAverage();
		    //查母菜单是否存在  updatepageTemplateupdatepageTemplate
		   results=jdbcTemplate1.queryForList("select id,sort,status,linkid,parentId from "+table+" where name= "+"\""+pmenuName+"\"");
	       if(results.isEmpty()|| results==null){
	        	throw new MenuException("未查出名称为"+pmenuName+"的菜单，请检查输入名称是否正确");
	      }
		 for(String key:results.get(0).keySet()){
			 param.put(key, results.get(0).get(key));
		 }
		 sql="select count(*) as num from "+table+" where parentId = "+param.get("id")+ " and status =1";
		 results.clear();

		 results=jdbcTemplate1.queryForList(sql);
		 int sort=0;
		 if(results.isEmpty()){
			 sort=1;
		 }
		 int parentId=Integer.parseInt(param.get("id").toString());
		 int larg=(Integer.parseInt(results.get(0).get("num").toString())+1)/10;
		  sort=Integer.parseInt(String.valueOf(parentId*Math.pow(10, (larg+1))).substring(0, String.valueOf(parentId*Math.pow(10, (larg+1))).indexOf("."))) +Integer.parseInt(results.get(0).get("num").toString())+1;
		  sql="select count(*) as num from "+table+" where name = "+"\""+menuName+"\"";
		  results.clear();

		  results=jdbcTemplate1.queryForList(sql);
		  if(Integer.parseInt(results.get(0).get("num").toString())==0){
				//插入一条菜单信息，
				//插入一条菜单信息，
			  sql="insert into "+table+"(name,path,sort,status,create_time,parentId) values('"+menuName+"','"+urlInfo+"','"+sort+"', 1 ,'"+time+"',"+parentId+")";
			  try {
					jdbcTemplate1.execute(sql);
				} catch (DataAccessException e) {
					// TODO Auto-generated catch block
					throw new MenuException("菜单创建失败"+e.getMessage());
				}
		  }else{
			  //更新某项信息
			 String sqlupdate="update "+table+" set name ='"+menuName+"',"+" path ='"+urlInfo+"' ,"+" sort ='"+sort+"', status="+1+" ,create_time ='"+time+"', parentId="+parentId+" where name = "+"\""+menuName+"\"";
			 try {
					jdbcTemplate1.execute(sqlupdate);
				} catch (DataAccessException e) {
					// TODO Auto-generated catch block
					throw new MenuException("更新菜单出错："+e.getMessage());
				}
		  }

		  //查询是否有该主题的文件模板，如果存在则更新，
		 sql="select * from page_templete t where t.file_name = "+ "\""+fileName+"\"";
		 results.clear();
	     try {
			results=jdbcTemplate1.queryForList(sql);

		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			 logger.info("查询模板信息的sql报错:"+sql);

		}
	     if(results.isEmpty()){
	    	 //插入页面模板
	    	 // String pageTemp="insert into page_templete (timersql,legend,kind,catalog,file_name,filePath,title,subtitle,pmenuName,menuName,stack,comitment,report_kind,sql_yaxis,yaxisNames) values ( '"+timersql+"','"+legend+"','"+kind+"','"+catalog+"','"+fileName+"','"+filePath+"','"+title+"','"+subtitle+"','"+pmenuName1+"','"+menuName1+"','"+stack+"','"+comitment+"','"+reportKind+"','"+pageTemplete.getSqlyaxis()+"','"+pageTemplete.getYaxisNames()+"')";
			 String pageTemp="insert into page_templete (timersql,legend,kind,catalog,file_name,filePath,title,subtitle,pmenuName,menuName,stack,comitment,report_kind,sql_yaxis,yaxisNames,other_option,realtime,timetype,iscolor,daynum,multime,ispercent,leftLegendNum,maxandmin,average) values ( '"+timersql+"','"+legend+"','"+kind+"','"+catalog+"','"+fileName+"','"+filePath+"','"+title+"','"+subtitle+"','"+pmenuName1+"','"+menuName1+"','"+stack+"','"+comitment+"','"+reportKind+"','"+pageTemplete.getSqlyaxis()+"','"+pageTemplete.getYaxisNames()+"','"+ pageTemplete.getOtherOption() +"','"+ realtime +"','"+timetype+"','"+iscolor+"','"+daynum+"','"+multime+"','"+ispercent+"','"+leftLegendNum+"','"+maxandmin+"','"+average+"')";
			 try {
	  			jdbcTemplate1.execute(pageTemp);
	  		} catch (DataAccessException e) {
	  			// TODO Auto-generated catch block
	  			throw new PageTempleteException("页面模板插入数据库发生异常"+e.getMessage());
	  		}
	     }else{
			 sql="update page_templete set stack = '"+stack+"',timersql = '"+timersql+"', "+" legend= '"+legend+"', kind = '"+ kind +"' , "+" catalog = '"+ catalog+"', file_name = '"+fileName+"', title= '"+ title+ "', subtitle = '"+subtitle +"', pmenuName = '"+pmenuName1 +"', menuName= '"+ menuName1+"' , comitment ='"+comitment+"',report_kind='"+reportKind+"' , sql_yaxis ='"+pageTemplete.getSqlyaxis()+"' ,yaxisNames ='"+pageTemplete.getYaxisNames()+"' ,other_option ='"+pageTemplete.getOtherOption()+"' ,realtime ='"+realtime+"',timetype='"+timetype+"',daynum='"+daynum+"',multime='"+multime+"',ispercent='"+ispercent+"',leftLegendNum='"+leftLegendNum+"',maxandmin='"+maxandmin+"',average='"+average+"', iscolor ='"+iscolor+"' where file_name ="+ "\""+fileName+"\"";
			 try {
		  			jdbcTemplate1.execute(sql);
		  		} catch (DataAccessException e) {
		  			// TODO Auto-generated catch block
		  			throw new PageTempleteException("更新页面模板数据插入数据库发生异常"+e.getMessage());
		  		}
	     }


	    String pgeTmp="select id from page_templete where file_name ="+"\""+fileName+"\"";

	    @SuppressWarnings("deprecation")
		int pageNo=jdbcTemplate1.queryForInt(pgeTmp);
	    if(pageNo<=0){
	    	throw new PageTempleteException("页面查询索引发生异常");
	    }
	    //更新menu的templeteId
	    sql="update menu m set templeteId ="+pageNo+" where m.name="+ "\'"+menuName+"\'";
		try {
			jdbcTemplate1.execute(sql);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
		throw new PageTempleteException("更新templeteId失败，原因："+e.getMessage());
		}
		//是否有规则，有规则更新，没规则插入
		//是否已有规则
		sql = "select count(*) from sys_templ_colr stc where stc.templete_id ="+pageNo;
		try {

			int num = jdbcTemplate1.queryForInt(sql);
			if(num==0){
				//没有配置方案，请添加
            sql ="insert into sys_templ_colr(templete_id,color1_id,color2_id,color3_id,condition1,condition2,condition3) values ("+"\""+pageNo+"\""+","+"\""+color1+"\""+" ,"+"\""+color2+"\""+","+"\""+color3+"\""+","+"\""+condition1+"\""+","+"\""+condition2+"\""+","+"\""+condition3+"\""+")";
				jdbcTemplate1.execute(sql);
			}else if(num==1){
				//已有配置方案，请更改
				//   sql="update menu m set templeteId ="+pageNo+" where m.name="+ "\'"+menuName+"\'";
			sql = "update sys_templ_colr set templete_id= "+pageNo+" ,color1_id ="+"\""+color1+"\""+" ,color2_id = "+"\""+color2+"\""+" ,color3_id = "+"\""+color3+"\""+" where templete_id ="+pageNo;
				jdbcTemplate1.execute(sql);
			}else{
				throw new PageTempleteException("查询出两条以上的着色方案，请修改");
			}
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			throw new PageTempleteException("着色操作失败！"+e.getMessage());
		}

	     return pageNo;

	}

	//更新新拖拽节点的顺序信息
	public int[] updateSortById(String menuId){
		String sql="select count(*) as num from menu where parentId = (select id from menu mu where mu.id = "+"\'"+menuId+"\'"+")";
		String sqlForPId="select id from menu mu where mu.id = "+"\'"+menuId+"\'";
		List<Map<String, Object>> results=new ArrayList<Map<String,Object>>();
		results.clear();
		results=jdbcTemplate1.queryForList(sql);
		@SuppressWarnings("deprecation")
		int pId=jdbcTemplate1.queryForInt(sqlForPId);
		int[] sort = new int[Integer.parseInt(results.get(0).get("num").toString())+1];
		//int sort=0;
		/* if(results.isEmpty()){
			 sort=1;
		 }*/
		int parentId=Integer.parseInt(String.valueOf(pId));
		int larg=(Integer.parseInt(results.get(0).get("num").toString())+1)/10;
		for(int i=0;i<Integer.parseInt(results.get(0).get("num").toString())+1;i++){
			if(larg==0){
				sort[i]=Integer.parseInt(String.valueOf(parentId*Math.pow(10, (larg+1))).substring(0, String.valueOf(parentId*Math.pow(10, (larg+1))).indexOf(".")))*10 +1+i;
			}else{
				sort[i]=Integer.parseInt(String.valueOf(parentId*Math.pow(10, (larg+1))).substring(0, String.valueOf(parentId*Math.pow(10, (larg+1))).indexOf("."))) +1+i;
			}
		}
		//sort=Integer.parseInt(String.valueOf(parentId*Math.pow(10, (larg+1))).substring(0, String.valueOf(parentId*Math.pow(10, (larg+1))).indexOf("."))) +1;
		return sort;
	}

	public PageTemplete  getPageInfo(int pageTempNo) throws PageTempleteException{
		PageTemplete pt=new PageTemplete();
		List<Map<String,Object>> results=new ArrayList<Map<String,Object>>();
		String sql="select * from page_templete  t where t.id =  "+ pageTempNo;
		 try {
				results=jdbcTemplate1.queryForList(sql);

			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
			 logger.info("数据查询出错"+e.getMessage());
			}
		 if(results.size()!=1){
			 throw new PageTempleteException("查询页面模板信息数量超过两个，请联系管理员 132642558366");
		 }
		if(results.size()>=2){
			new Exception("查询出多余一行的sql模板，请核对库信息");
		} else if(results.size() <1){
			new Exception("查询出少于一行的sql模板，请核对库信息");
		} else {
			fillPageTemplete(pt, results);
		}
		//获取着色方案
		if(pt.getIscolor1().equalsIgnoreCase("否")&&pt.getIscolor2().equalsIgnoreCase("否")&&pt.getIscolor3().equalsIgnoreCase("否")){

		}else{
			sql ="select * from sys_templ_colr where templete_id = "+"'"+pt.getId()+"'";
			try {
				results=jdbcTemplate1.queryForList(sql);
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				logger.info("数据查询出错"+e.getMessage());
			}
			if(results.size()!=1){
				throw new PageTempleteException("着色方案不唯一，请联系管理员");
			}
			if(results.size()>=2){
				new Exception("着色方案大于等于2，请联系管理员");
			} else if(results.size() <1){
				new Exception("未找到着色方案");
			} else {
				fillPageTempleteForColor(pt, results);
			}
		}

		return pt;
	}

	private void fillPageTempleteForColor(PageTemplete pt, List<Map<String, Object>> results) {
		//着色方案

		pt.setCol1_cols_1(results.get(0).get("color1_id").toString().split("\\|")[0]);
		pt.setCol1_cols_2(results.get(0).get("color2_id").toString().split("\\|")[0]);
		pt.setCol1_cols_3(results.get(0).get("color3_id").toString().split("\\|")[0]);
		pt.setCol2_cols_1(results.get(0).get("color1_id").toString().split("\\|")[1]);
		pt.setCol2_cols_2(results.get(0).get("color2_id").toString().split("\\|")[1]);
		pt.setCol2_cols_3(results.get(0).get("color3_id").toString().split("\\|")[1]);
		pt.setCol3_cols_1(results.get(0).get("color1_id").toString().split("\\|")[2]);
	    pt.setCol3_cols_2(results.get(0).get("color2_id").toString().split("\\|")[2]);
		pt.setCol3_cols_3(results.get(0).get("color3_id").toString().split("\\|")[2]);
		pt.setCol1_data_1_from(results.get(0).get("condition1").toString().split("\\^")[0] == "" ? "0" : results.get(0).get("condition1").toString().split("\\^")[0].split("\\|")[0]);
		pt.setCol1_data_1_to(results.get(0).get("condition1").toString().split("\\^")[0] == "" ? "0" : results.get(0).get("condition1").toString().split("\\^")[0].split("\\|")[1]);
		pt.setCol2_data_1_from(results.get(0).get("condition1").toString().split("\\^")[1].trim().equalsIgnoreCase("|") ? "0" : results.get(0).get("condition1").toString().split("\\^")[1].split("\\|")[0]);
		pt.setCol2_data_1_to(results.get(0).get("condition1").toString().split("\\^")[1].trim().equalsIgnoreCase("|") ? "0" : results.get(0).get("condition1").toString().split("\\^")[1].split("\\|")[1]);
		pt.setCol3_data_1_from(results.get(0).get("condition1").toString().split("\\^")[2].trim().equalsIgnoreCase("|") ? "0" : results.get(0).get("condition1").toString().split("\\^")[2].split("\\|")[0]);
		pt.setCol3_data_1_to(results.get(0).get("condition1").toString().split("\\^")[2].trim().equalsIgnoreCase("|") ? "0" : results.get(0).get("condition1").toString().split("\\^")[2].split("\\|")[1]);
		pt.setCol1_data_2_from(results.get(0).get("condition2").toString().split("\\^")[0].trim().equalsIgnoreCase("|") ? "0" : results.get(0).get("condition2").toString().split("\\^")[0].split("\\|")[0]);
		pt.setCol1_data_2_to(results.get(0).get("condition2").toString().split("\\^")[0].trim().equalsIgnoreCase("|") ? "0" : results.get(0).get("condition2").toString().split("\\^")[0].split("\\|")[1]);
		pt.setCol2_data_2_from(results.get(0).get("condition2").toString().split("\\^")[1].trim().equalsIgnoreCase("|") ? "0" : results.get(0).get("condition2").toString().split("\\^")[1].split("\\|")[0]);
		pt.setCol2_data_2_to(results.get(0).get("condition2").toString().split("\\^")[1].trim().equalsIgnoreCase("|") ? "0" : results.get(0).get("condition2").toString().split("\\^")[1].split("\\|")[1]);
		pt.setCol3_data_2_from(results.get(0).get("condition2").toString().split("\\^")[2].trim().equalsIgnoreCase("|")  ? "0" : results.get(0).get("condition2").toString().split("\\^")[2].split("\\|")[0]);
		pt.setCol3_data_2_to(results.get(0).get("condition2").toString().split("\\^")[2].trim().equalsIgnoreCase("|")  ? "0" : results.get(0).get("condition2").toString().split("\\^")[2].split("\\|")[1]);
		pt.setCol1_data_3_from(results.get(0).get("condition3").toString().split("\\^")[0].trim().equalsIgnoreCase("|") ? "0":results.get(0).get("condition3").toString().split("\\^")[0].split("\\|")[0]);
		pt.setCol1_data_3_to(results.get(0).get("condition3").toString().split("\\^")[0].trim().equalsIgnoreCase("|") ? "0":results.get(0).get("condition3").toString().split("\\^")[0].split("\\|")[1]);
		pt.setCol2_data_3_to(results.get(0).get("condition3").toString().split("\\^")[0].trim().equalsIgnoreCase("|")  ? "0":results.get(0).get("condition3").toString().split("\\^")[0].split("\\|")[1]);
		pt.setCol2_data_3_from(results.get(0).get("condition3").toString().split("\\^")[1].trim().equalsIgnoreCase("|")  ? "0":results.get(0).get("condition3").toString().split("\\^")[1].split("\\|")[0]);
		pt.setCol2_data_3_to(results.get(0).get("condition3").toString().split("\\^")[1].trim().equalsIgnoreCase("|")  ? "0":results.get(0).get("condition3").toString().split("\\^")[1].split("\\|")[1]);
		pt.setCol3_data_3_from(results.get(0).get("condition3").toString().split("\\^")[2].trim().equalsIgnoreCase("|")  ? "0":results.get(0).get("condition3").toString().split("\\^")[2].split("\\|")[0]);
		pt.setCol3_data_3_to(results.get(0).get("condition3").toString().split("\\^")[2].trim().equalsIgnoreCase("|")  ? "0":results.get(0).get("condition3").toString().split("\\^")[2].split("\\|")[1]);
	}

	public int findMenu(String pmenuName,String menuName) throws DataAccessException{

		    String sql="select t.parentId from menu t where t.name= "+"'"+menuName+"'" +" and t.status= "+1;

		    int result=1;

			@SuppressWarnings("deprecation")
			List<Map<String, Object>> parentId=jdbcTemplate1.queryForList(sql);

			if(parentId.size()==0){

				result =0 ;
			}else{
				sql="select t.name from menu t where t.id = "+parentId.get(0).get("parentId")+" and t.status= "+1;

				List<Map<String, Object>> result1=jdbcTemplate1.queryForList(sql);
				if(result1.size()==0){
					result = 0;
				}else{
					result = 1;
				}

			}
			return result;
     }

	public PageTemplete findPageTemplate(String fileName) throws Exception{
		PageTemplete pt=new PageTemplete();
		 String sql="select * from page_templete t where t.file_name= "+"'"+fileName+"\'";
	//	 PageTemplete rs=jdbcTemplate1.queryForObject(sql, PageTemplete.class);
		List<Map<String,Object>> rs= jdbcTemplate1.queryForList(sql);
		if(rs.size()>=2){
			new Exception("查询出多余一行的sql模板，请核对库信息");
		} else if(rs.size() <1){
			new Exception("查询出少于一行的sql模板，请核对库信息");
		} else {
			fillPageTemplete(pt, rs);
		}


		 return pt;
	}
	private void fillPageTemplete(PageTemplete pt, List<Map<String, Object>> rs) {
		pt.setId(rs.get(0).get("id") == null ? Integer.parseInt("0") : Integer.parseInt(rs.get(0).get("id").toString()));
		pt.setCatalog(rs.get(0).get("catalog") == null ? null : rs.get(0).get("catalog").toString());
		pt.setFileName(rs.get(0).get("file_name") == null ? null : rs.get(0).get("file_name").toString());
		pt.setFilePath(rs.get(0).get("filepath") == null ? null : rs.get(0).get("filepath").toString());
		pt.setKind(rs.get(0).get("kind") == null ? null : rs.get(0).get("kind").toString());
		pt.setLegend(rs.get(0).get("legend") == null ? null : rs.get(0).get("legend").toString());
		pt.setMenuName(rs.get(0).get("menuname") == null ? null : rs.get(0).get("menuname").toString());
		pt.setPmenuName(rs.get(0).get("pmenuname") == null ? null : rs.get(0).get("pmenuname").toString());
		pt.setStack(rs.get(0).get("stack") == null ? null : rs.get(0).get("stack").toString());
		pt.setSubtitle(rs.get(0).get("subtitle") == null ? null : rs.get(0).get("subtitle").toString());
		pt.setTimer(rs.get(0).get("timer") == null ? null : rs.get(0).get("timer").toString());
		pt.setTimersql(rs.get(0).get("timersql") == null ? null : rs.get(0).get("timersql").toString());
		pt.setTitle(rs.get(0).get("title") == null ? null : rs.get(0).get("title").toString());
	    pt.setComitment(rs.get(0).get("comitment") == null ? null : rs.get(0).get("comitment").toString());
		pt.setReportKind(rs.get(0).get("report_kind") == null ? null : rs.get(0).get("report_kind").toString());
	    pt.setYaxisNames(rs.get(0).get("yaxisNames") == null ? null : rs.get(0).get("yaxisNames").toString());
		pt.setSqlyaxis(rs.get(0).get("sql_yaxis") == null ? null : rs.get(0).get("sql_yaxis").toString());
		pt.setOtherOption(rs.get(0).get("other_option") == null ? null : rs.get(0).get("other_option").toString());
		pt.setTimetype(rs.get(0).get("timetype") == null ? null : rs.get(0).get("timetype").toString());
		pt.setRealtime(rs.get(0).get("realtime") == null ? null : rs.get(0).get("realtime").toString());
	    pt.setIscolor1(rs.get(0).get("isColor") == null ? null : rs.get(0).get("isColor").toString().split("\\|")[0]);
		pt.setIscolor2(rs.get(0).get("isColor") == null ? null : rs.get(0).get("isColor").toString().split("\\|")[1]);
		pt.setIscolor3(rs.get(0).get("isColor")==null?null:rs.get(0).get("isColor").toString().split("\\|")[2]);
		pt.setMultime(rs.get(0).get("multime")==null?null:rs.get(0).get("multime").toString());
		pt.setDaynum(rs.get(0).get("daynum")==null?null:rs.get(0).get("daynum").toString());
		pt.setIspercent(rs.get(0).get("ispercent")==null?null:rs.get(0).get("ispercent").toString());
		pt.setLeftLegendNum(rs.get(0).get("leftLegendNum")==null?null:rs.get(0).get("leftLegendNum").toString());
		pt.setMaxandmin(rs.get(0).get("maxandmin")==null?null:rs.get(0).get("maxandmin").toString());
		pt.setAverage(rs.get(0).get("average")==null?null:rs.get(0).get("average").toString());
	}

	public int getSort(String menuName){
		 String sql="select count(*) as num from menu where parentId = (select id from menu mu where mu.name = "+"\'"+menuName+"\'"+")";
		 String sqlForPId="select id from menu mu where mu.name = "+"\'"+menuName+"\'";
		 List<Map<String, Object>> results=new ArrayList<Map<String,Object>>();
		 results.clear();
		 results=jdbcTemplate1.queryForList(sql);
		 @SuppressWarnings("deprecation")
		int pId=jdbcTemplate1.queryForInt(sqlForPId);
		 int sort=0;
		 if(results.isEmpty()){
			 sort=1;
		 }
		 int parentId=Integer.parseInt(String.valueOf(pId));
		 int larg=(Integer.parseInt(results.get(0).get("num").toString())+1)/10;
		  sort=Integer.parseInt(String.valueOf(parentId*Math.pow(10, (larg+1))).substring(0, String.valueOf(parentId*Math.pow(10, (larg+1))).indexOf("."))) +Integer.parseInt(results.get(0).get("num").toString())+1;
	    return sort;
	}


	public int getSortById(String menuId){
		 String sql="select count(*) as num from menu where parentId = (select id from menu mu where mu.id = "+"\'"+menuId+"\'"+")";
		 String sqlForPId="select id from menu mu where mu.id = "+"\'"+menuId+"\'";
		 List<Map<String, Object>> results=new ArrayList<Map<String,Object>>();
		 results.clear();
		 results=jdbcTemplate1.queryForList(sql);
		 @SuppressWarnings("deprecation")
		int pId=jdbcTemplate1.queryForInt(sqlForPId);
		 int sort=0;
		 if(results.isEmpty()){
			 sort=1;
		 }
		 int parentId=Integer.parseInt(String.valueOf(pId));
		 int larg=(Integer.parseInt(results.get(0).get("num").toString())+1)/10;
		  sort=Integer.parseInt(String.valueOf(parentId*Math.pow(10, (larg+1))).substring(0, String.valueOf(parentId*Math.pow(10, (larg+1))).indexOf("."))) +Integer.parseInt(results.get(0).get("num").toString())+1;
	    return sort;
	}
	public List<Menu> findNoFirestMenu() {
		// TODO Auto-generated method stub
	//	String sql="   select * from menu where menu.parentId =0 union all select * from menu where menu.name like '%日报%' or menu.name like  '%月报%' or menu.name like  '%周报%' or menu.name like '%年报%'";
	String sql="select  first.id, CONCAT(second.name,\"~^\",first.name) as name,first.path,first.sort,first.status,first.update_time,first.create_time,first.create_id,first.linkId,first.parentId,first.templeteId\n" +
			"  from ( \n" +
			"\t\t\t(select l.* from menu l where l.id  \n" +
			"\t\t\tin \n" +
			"\t\t\t   (select  t.parentId from \n" +
			"\t\t\t         (select * from menu  tt where \n" +
			"\t\t\t          tt.id not in \n" +
			"\t\t\t            (select mu.parentId from menu mu ) and  status =1) t  union all select t.id from menu t\n" +
			"where t.linkId is not null and t.status =1\n" +
			"\t\t\t            ) \n" +
			"\n" +
			"\t\t\t           \n" +
			"\n" +
			"\t\t\t            ) first \n" +
			"\t\t\t                 left join menu second on first.parentId = second.id  ) where first.parentId !=-1 order by sort";
			List<Map<String, Object>> results=jdbcTemplate1.queryForList(sql);
		List<Menu> menus= new ArrayList<Menu>();
		menus = fillData(results,menus);
		return menus;
	}
	private List<Menu> fillData(List<Map<String, Object>> results,
			List<Menu> menus) {
		// TODO Auto-generated method stub
		for(int i =0;i <results.size(); i++){
			Menu menu =new Menu();
			for(String k:results.get(i).keySet()){
				if(k.equalsIgnoreCase("id")){
					Integer id=(Integer)results.get(i).get(k);
					menu.setId(id);
				}
				if(k.equalsIgnoreCase("name")){
					menu.setName(results.get(i).get(k)==null? null:results.get(i).get(k).toString());
				}
				if(k.equalsIgnoreCase("path")){
					menu.setPath(results.get(i).get(k).toString());
				}
				if(k.equalsIgnoreCase("sort")){
					Integer sort=(Integer)results.get(i).get(k);
					menu.setSort(sort);
				}
				if(k.equalsIgnoreCase("status")){
					menu.setStatus(results.get(i).get(k)==null? null:results.get(i).get(k).toString());
				}
				if(k.equalsIgnoreCase("updateTime")){
					menu.setUpdateTime(results.get(i).get(k)==null? null:results.get(i).get(k).toString());
				}
				if(k.equalsIgnoreCase("createTime")){
					menu.setCreateTime(results.get(i).get(k)==null? null:results.get(i).get(k).toString());
				}
				if(k.equalsIgnoreCase("linkid")){
					menu.setLinkId(results.get(i).get(k) == null ? null : results.get(i).get(k).toString());
				}
				if(k.equalsIgnoreCase("createId")){
					Integer createId =(Integer)results.get(i).get(k);
					menu.setCreateId(createId);
				}
				if(k.equalsIgnoreCase("parentid")){
					Integer parentId = (Integer)results.get(i).get(k);
					menu.setParentId(parentId);
				}
			}
			menus.add(menu);
		}
		return menus;
	}
	@Override
	public PageTemplete findTemplatePage(String pmenuname, String menuname) {
		// TODO Auto-generated method stub
		PageTemplete pt=new PageTemplete();
		 String sql="select * from page_templete t where t.pmenuName= "+"'"+pmenuname+"\' and menuName = "+"'"+menuname+"\'";
	//	 PageTemplete rs=jdbcTemplate1.queryForObject(sql, PageTemplete.class);
		List<Map<String,Object>> rs= jdbcTemplate1.queryForList(sql);
		if(rs.size()>=2){
			new Exception("查询出多余一行的sql模板，请核对库信息");
		} else if(rs.size() <1){
			new Exception("查询出少于一行的sql模板，请核对库信息");
		} else {
			fillPageTemplete(pt, rs);
		}
		return pt;
	}

	public List<Menu> findMenuChild(String pMenuId){
		String sql="select * from menu t where t.parentId= (select id from menu mu where mu.id = "+ "'"+pMenuId+"'"+")"+"and t.status=1";
		List<Map<String, Object>> results = jdbcTemplate1.queryForList(sql);
		    List<Menu> menus= new ArrayList<Menu>();
		menus = fillData(results,menus);
		return menus;

	}

	public Menu findByPIdandId(String pmenuId ,String menuId){
		String sql="select * from menu where menu.id ="+menuId+" and status = 1";
		List<Menu> menus= new ArrayList<Menu>();
		List<Map<String, Object>> results=jdbcTemplate1.queryForList(sql);
		menus = fillData(results,menus);
		if(menus == null){
			return null;
		}
		return menus.get(0);
	}

	//实时报表更新2015-12-16
	public int updatepageTemplate(PageTemplete pageTemplete) throws  Exception{
		String sql = "update page_templete set timersql =" +
				""+"\'"+pageTemplete.getTimersql()+"\'"+" ,legend = "+"\'" +
				""+pageTemplete.getLegend()+"\'"+" ,stack = "+"\'"
				+pageTemplete.getStack()+"\'"+" ,kind = "+"\'"+ pageTemplete.getKind()+
				"\'"+",catalog ="+"\'"+pageTemplete.getCatalog()+"\'"+
				" ,title = "+"\'"+pageTemplete.getTitle()+"\'"
				+ ",subtitle ="+"\'"+pageTemplete.getSubtitle()+ "\'"+", pmenuName = "+"\'"+pageTemplete.getMenuName()+"\'"+", comitment="+"\'"+pageTemplete.getComitment()+"\'"+ ", menuName="+"\'"+pageTemplete.getMenuName()+"\'"+ ", report_kind="+"\'"+pageTemplete.getReportKind()+"\'"+ " ,sql_yaxis ="+"\'"+pageTemplete.getSqlyaxis()+" \'"+ " , yaxisNames="+" \'"+pageTemplete.getYaxisNames()+"\'"+ " , other_option="+" \'"+pageTemplete.getOtherOption()+"\'"+",realtime="+"\'"+pageTemplete.getRealtime()+"\'"+",timetype="+"\'"+pageTemplete.getTimetype()+"\'"+" ,isColor ="+"\'"+pageTemplete.getIscolor1()+"|"+pageTemplete.getIscolor2()+"|"+pageTemplete.getIscolor3()+"\'"+
				",multime="+"\'"+pageTemplete.getMultime()+
				"\'"+",daynum="+"\'"+pageTemplete.getDaynum()+"\'"+
				",ispercent="+"\'"+pageTemplete.getIspercent()+"\'"+
				",leftLegendNum="+"\'"+pageTemplete.getLeftLegendNum()+"\'"+
				",maxandmin="+"\'"+pageTemplete.getMaxandmin()+"\'"+
				",average="+"\'"+pageTemplete.getAverage()+"\'"+
				" where id = (select templeteId from menu where menu.id = "+ pageTemplete.getId()+") ";
		System.out.println(sql);
		int result = jdbcTemplate1.update(sql);

		return result;
	}
	//在配置页面也有菜单信息的
     public int updateMenu(PageTemplete pageTemplate) throws Exception{
		 String sql="select id from menu where name=  "+"\'"+pageTemplate.getPmenuName() + "\' and status =1";
		 System.out.println(sql);
		 int result = jdbcTemplate1.queryForObject(sql, Integer.class);
		 sql="update menu set name ="+"\'"+pageTemplate.getMenuName()+"\'"+" ,   parentId = "+result+ " where id= "+ pageTemplate.getId() + " ";
		 System.out.println(sql);
		  result = jdbcTemplate1.update(sql);

		 return result;

	 }
	public String getMenuNameByName(String menuName){
		String sql = "select kind from  page_templete where menuName = "+ " \'"+menuName+" \'";
		String result = jdbcTemplate1.queryForObject(sql, String.class);
		return result;
	}
	public String findFileNameByMenuId( int menuid) throws Exception{
		String sql ="select file_name from page_templete where id = (select templeteId from menu where id="+menuid + ")";
		String result = jdbcTemplate1.queryForObject(sql, String.class);
		return result;
	}
	@Override
	public Menu findMenuByPmenandmen(String pmenuname, String menuname) {
		// TODO Auto-generated method stub
		String sql = "select * from  menu  where name = "+ " \'"+menuname+" \'"+" ,  parentId = ( select id from menu mu where mu.name ="+"\'"+pmenuname+"\'"+")";
		List<Menu> menus= new ArrayList<Menu>();
		List<Map<String, Object>> results=jdbcTemplate1.queryForList(sql);
		menus = fillData(results, menus);
		if(menus == null){
			return null;
		}
		return menus.get(0);

	}
	@Override
	public String getMenuNameByFilePath(String filePath) {
		// TODO Auto-generated method stub
		String sql = "select kind from  page_templete where file_name = "+ " \'"+filePath+" \'";
		String result = jdbcTemplate1.queryForObject(sql, String.class);
		return result;
	}
	public PageTemplete getTempleteByFilePath(String filePath) throws Exception{
		// TODO Auto-generated method stub
		PageTemplete pt=new PageTemplete();
		String sql = "select * from  page_templete where file_name = "+ " \'"+filePath+" \'";
		// String sql="select * from page_templete t where t.pmenuName= "+"'"+pmenuname+"\' and menuName = "+"'"+menuname+"\'";
			//	 PageTemplete rs=jdbcTemplate1.queryForObject(sql, PageTemplete.class);
				List<Map<String,Object>> rs= jdbcTemplate1.queryForList(sql);
				if(rs.size()>=2){
				 throw 	new Exception("查询出多余一行的sql模板，请核对库信息");
				} else if(rs.size() <1){
				 throw new Exception("查询出少于一行的sql模板，请核对库信息");
				} else {
					fillPageTemplete(pt, rs);
               }
		if(pt.getIscolor1().equalsIgnoreCase("否")&&pt.getIscolor2().equalsIgnoreCase("否")&&pt.getIscolor3().equalsIgnoreCase("否")){

		}else{
			sql ="select * from sys_templ_colr where templete_id = "+"'"+pt.getId()+"'";
			List<Map<String, Object>> results=new ArrayList<Map<String,Object>>();
			try {
				results=jdbcTemplate1.queryForList(sql);
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				logger.info("数据查询出错" + e.getMessage());
			}
			if(results.size()!=1){
				throw new Exception("着色方案不唯一，请联系管理员");
			}
			if(results.size()>=2){
				new Exception("着色方案大于等于2，请联系管理员");
			} else if(results.size() <1){
				new Exception("未找到着色方案");
			} else {
				fillPageTempleteForColor(pt, results);
			}
		}

		return pt;
		}
	@Override
	public int updateTempletePage( PageTemplete pageTemplete) throws Exception{
		// TODO Auto-generated method stub
		String iscolor = pageTemplete.getIscolor1()+"|"+pageTemplete.getIscolor2()+"|"+pageTemplete.getIscolor3();
		int result1 = 1;
	//	String sql =" update page_templete set report_kind = "+"\'"+pageTemplete.getReportKind()+"\'"+", timersql ="+"\'"+pageTemplete.getTimersql()+"\'"+" ,title= "+"\'"+pageTemplete.getTitle()+"\'"+" where file_name = "+ " \'"+pageTemplete.getFileName()+" \'";
		String sql="update page_templete set stack = '"+pageTemplete.getStack()+"',timersql = '"+pageTemplete.getTimersql()+"', "+" legend= '"+pageTemplete.getLegend()+"', kind = '"+ pageTemplete.getKind() +"' , "+" catalog = '"+ pageTemplete.getCatalog()+"', file_name = '"+pageTemplete.getFileName()+"', title= '"+ pageTemplete.getTitle()+ "', subtitle = '"+pageTemplete.getSubtitle() +"', pmenuName = '"+pageTemplete.getPmenuName() +"', menuName= '"+ pageTemplete.getMenuName()+"' , comitment ='"+pageTemplete.getComitment()+"',report_kind='"+pageTemplete.getReportKind()+"' , sql_yaxis ='"+pageTemplete.getSqlyaxis()+"' ,yaxisNames ='"+pageTemplete.getYaxisNames()+"', other_option = '"+pageTemplete.getOtherOption()+"',realtime='"+pageTemplete.getRealtime()+"',timetype='"+pageTemplete.getTimetype()+"' , isColor ='"+ iscolor+"',multime='"+pageTemplete.getMultime()+ "',daynum='"+pageTemplete.getDaynum()+"' where file_name ="+ "\""+pageTemplete.getFileName()+"\"";
		jdbcTemplate1.update(sql);
		//更新着色方案
       if(iscolor.contains("是")){
		   String color1= pageTemplete.getCol1_cols_1()+"|"+pageTemplete.getCol2_cols_1()+"|"+pageTemplete.getCol3_cols_1();
		   String color2 =pageTemplete.getCol1_cols_2()+"|"+pageTemplete.getCol2_cols_2()+"|"+pageTemplete.getCol3_cols_2();
		   String color3 = pageTemplete.getCol1_cols_3()+"|"+pageTemplete.getCol2_cols_3()+"|"+pageTemplete.getCol3_cols_3();
		   String data1_1 = pageTemplete.getCol1_data_1_from()+"|"+pageTemplete.getCol1_data_1_to();
		   String data1_2 =pageTemplete.getCol1_data_2_from()+"|"+pageTemplete.getCol1_data_2_to();
		   String data1_3 =pageTemplete.getCol1_data_3_from()+"|"+pageTemplete.getCol1_data_3_to();
		   String data2_2 = pageTemplete.getCol2_data_2_from()+"|"+pageTemplete.getCol2_data_2_to();
		   String data2_1 = pageTemplete.getCol2_data_1_from()+"|"+pageTemplete.getCol2_data_2_to();
		   String data2_3 = pageTemplete.getCol2_data_3_from()+"|"+pageTemplete.getCol2_data_3_to();
		   String data3_1 = pageTemplete.getCol3_data_1_from()+"|"+pageTemplete.getCol3_data_1_to();
		   String data3_2= pageTemplete.getCol3_data_2_from()+"|"+ pageTemplete.getCol3_data_2_to();
		   String data3_3 = pageTemplete.getCol3_data_3_from() +"|"+pageTemplete.getCol3_data_3_to();
		   String condition1 =data1_1+"^"+data2_1+"^"+data3_1;
		   String condition2 = data1_2+"^"+data2_2+"^"+data3_2;
		   String condition3 =data1_3+"^"+data2_3+"^"+data3_3;
		   sql = " select count(*) from sys_templ_colr where templete_id = (select templeteId from menu where menu.id = "+ pageTemplete.getId()+") ";
		   result1 =jdbcTemplate1.queryForInt(sql);
		   if(result1>=1){
			   sql = "update sys_templ_colr set color1_id = '"+color1+"\'"+" , color2_id = '"+color2+"\'"+ " , color3_id = '"+color3 +"\'"+" ,condition1 = '"+condition1+"\'"+" , condition2 =\'"+condition2+"\'"+ " ,condition3 = '"+condition3+"\' where" +
					   " templete_id = (select templeteId from menu where menu.id = "+ pageTemplete.getId()+") ";
			   result1 = jdbcTemplate1.update(sql);
		   }
		   if(result1<=0){
			   sql ="select templeteId from menu where menu.id = "+ pageTemplete.getId();
			   int pageNo = jdbcTemplate1.queryForInt(sql);
			   sql ="insert into sys_templ_colr(templete_id,color1_id,color2_id,color3_id,condition1,condition2,condition3) values ("+"\""+pageNo+"\""+","+"\""+color1+"\""+" ,"+"\""+color2+"\""+","+"\""+color3+"\""+","+"\""+condition1+"\""+","+"\""+condition2+"\""+","+"\""+condition3+"\""+")";
			   result1 =  jdbcTemplate1.update(sql);
		   }
	   }
		return result1 ;

	}

	//更新page_templete
	public int updatemenuName(String NewmenuName,String fileName){
		String sql = "update page_templete set menuName ="+"\'"+NewmenuName+"\'"+" where file_name = "+ " \'"+fileName+" \'";

		Integer i = jdbcTemplate1.update(sql);
		return i;
	}

	public int updatepmenuName(String NewmenuName,String OldmenuName){
		String sql = "update page_templete set pmenuName ="+"\'"+NewmenuName+"\'"+" where pmenuName = "+ " \'"+OldmenuName+" \'";
		Integer i = jdbcTemplate1.update(sql);
		return i;
	}
	public int updatePageTemplete(String parentName,String fileName){
		String sql = "update page_templete set pmenuName ="+"\'"+parentName+"\'"+" where file_name = "+ " \'"+fileName+" \'";
		Integer i = jdbcTemplate1.update(sql);
		return i;
	}
	public int searchFileName(String fileName){
		String sql = "select count(*) from page_templete where file_name = "+ " \'"+fileName+" \'";
		Integer i = jdbcTemplate1.queryForInt(sql);
		return i;
	}


	//根据filename查找id(2015-9-25新加)
	@Override
	public int searchIdByFileName(String fileName) {
		// TODO Auto-generated method stub
		String sql = "select id from page_templete where file_name = "+"\'"+fileName+" \'";
		Integer i =jdbcTemplate1.queryForInt(sql);
		return i;
	}

	 public int updateRoleById(String id,SysRole role){
		 String sql = "update sys_role set name="+"\'"+role.getName()+"\'"+"\' where id="+id;
		 Integer i =jdbcTemplate1.update(sql);
		 return i;
	  }

	public List<String> findColums(String tableName) throws Exception{
		String sql ="select column_name from Information_schema.columns where table_Name ="+ "\'"+tableName+"\'";
		//List<Map<String,Object>> rs= jdbcTemplate1.queryForList(sql);
		List<Map<String,Object>> rs=jdbcTemplate.queryForList(sql);
      List<String> result =new ArrayList<String>();
		for(int i=0;i<rs.size();i++){
			for(String key:rs.get(i).keySet()){
				result.add(String.valueOf(rs.get(i).get(key)));
			}
		}
   		return result;
	}

	public List<OptionResult> findOptions(String tableName,String colName )throws Exception {
		String sql ="select distinct  "+ colName +" , id  from "+tableName +"  group by "+colName+" order by id asc" ;
		List<Map<String,Object>> rs= jdbcTemplate.queryForList(sql);
		//Map<String,Object> rs=jdbcTemplate1.queryForMap(sql);
		List<OptionResult> result =new ArrayList<OptionResult>();
		for(int i=0;i<rs.size();i++){
			OptionResult optionResult = new OptionResult();
			optionResult.setId(rs.get(i).get("id").toString());
			optionResult.setName(rs.get(i).get(colName).toString());
			result.add(optionResult);
		}
		return result;
	}

	public List<OptionResult> findOption(String sql){
		List<Map<String,Object>> rs= jdbcTemplate.queryForList(sql);

		List<OptionResult> result =new ArrayList<OptionResult>();
		for(int i=0;i<rs.size();i++){
			OptionResult optionResult = new OptionResult();
			optionResult.setId(rs.get(i).get("id").toString());
			optionResult.setName(rs.get(i).get("name").toString());
			result.add(optionResult);
		}
		return result;
	}

	public List<SysUser> findUserByUserNameAndPassword(String userName,String password){
	String sql="select * from sys_user su where su.username='"+userName +"' and su.password = '"+password+"' and state ='+1+'";
		List<Map<String,Object>>  map = jdbcTemplate1.queryForList(sql);
		List<SysUser> sysUsers =new ArrayList<SysUser>();
		if(map==null){
			return null;
		}else{
			fullfill(sysUsers,map);
			return sysUsers;
		}


	}
	public int saveComit(String comitmentarea,int pageTempNo) throws Exception{
		String sql=" update page_templete set comitment= '"+comitmentarea+"' where id = "+pageTempNo;
		return jdbcTemplate1.update(sql);
	}

	private void fullfill(List<SysUser> sysUsers,List<Map<String,Object>> map) {
		for(int i=0;i<map.size();i++){
			SysUser sysUser = new SysUser();
			sysUser.setUsername(map.get(i).get("username").toString());
			sysUser.setPassword(map.get(i).get("password").toString());
			sysUsers.add(sysUser);
		}
	}
	public String  findUserIdByUsername(String username) throws Exception{
		String sql =" select userid from sys_user a where a.username = '"+username+"'";
		String result = jdbcTemplate1.queryForObject(sql, String.class);
		return result;
	}
	public String  findMenuIdByNameAndPageNo(String reportname,Integer pageTempNo) throws Exception{
       String sql ="select id from menu mu where mu.name = '"+reportname+"' and templeteId = '"+pageTempNo+"'";
		String result = jdbcTemplate1.queryForObject(sql, String.class);
		return result;
	}

	public int addCollect(String menuid, String userid){
	//	String sql =" update sys_collection sc  set sc.userid = '"+userid+"' ,menuid = '"+ menuid +"'";
	String sql = "insert into sys_collection(userid,menuid)  values ("+userid+","+menuid+" )";
	int result = jdbcTemplate1.update(sql);
	return result;
	}
	public int delCollect(String menuid,String userid) {
		String sql = "delete from sys_collection  where userid = '"+userid+" ' and menuid = '"+menuid+"'";
		int result = jdbcTemplate1.update(sql);
		return result;
	}
	public int findByUserIdAndMenuId(String userid,String menuid){
		String sql ="select count(*) from sys_collection sc where sc.userid= '"+userid+"' and sc.menuid = '"+menuid+"'";
	    int result = jdbcTemplate1.queryForObject(sql, Integer.class);
	    return result;
	}
	public int  updateComit(int templeteId, String comitment){
		String sql="update page_templete set comitment="+"\'"+comitment+"\'"+" where id = "+"\'"+templeteId+"\'";
		Integer i = jdbcTemplate1.update(sql);
		return i;
	}


	public List<Color> findColors()  throws Exception{
		String sql = "select id,color from sys_color ";
		List<Map<String,Object>>   strs =jdbcTemplate1.queryForList(sql) ;
		List<Color> result = new ArrayList<Color>();
		for(int i=0;i<strs.size();i++){
			Color color = new Color();
			color.setId(Integer.parseInt(strs.get(i).get("id").toString()));
			color.setColor(strs.get(i).get("color").toString());

			result.add(color);
		}
		return result;

	}
	public static void main(String[] args){
		String t = "8100| ^|^|";
		String result  =t.split("\\^")[0].equalsIgnoreCase("|") ? "0":t.toString().split("\\^")[0].split("\\|")[1];
		System.out.println(result);

	}
}
