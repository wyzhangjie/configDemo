package com.framework.demo.web.controller.template;

import com.alibaba.fastjson.JSON;

import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.framework.demo.dto.jqgrid.*;
import com.framework.demo.service.pageTemplate.PageTempleteService;
import com.framework.demo.service.util.PageTempleteUtil;
import com.framework.demo.vo.template.JqGridPage;
import com.framework.demo.vo.template.SqlPage;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


@Controller
@RequestMapping({ "/jqgrid" })
public class JqGridController  {

	Logger logger = LoggerFactory.getLogger(JqGridController.class);

	private final static  String dim ="@#";
	@Autowired
	PageTempleteService pageTempleteService;
	@Autowired
	PageTempleteUtil pageTempleteUtil;



	@RequestMapping({ "/menu" })
	@ResponseBody
	public Object  demo(@RequestParam("modl") String modl,@RequestParam(value = "page",required = false) Integer page,
						@RequestParam(value = "rows",required = false) Integer rows,HttpServletResponse response) throws Exception {
		//报表环境处理
		//获取库中数据
		PageTemplete pageTemplete = pageTempleteService.selectPg(modl.replaceAll(" ", ""));
		//获取sql数据
		String sql = pageTempleteUtil.getSql(pageTemplete);
		//填充jqGridConfigInfo
		JqGridConfigInfo jqGridConfigInfo = pageTempleteUtil.getJqGridConfigInfo(pageTemplete);
		SqlPage sqlPage = new SqlPage();
		page = page==null?1:page;
		rows = rows==null?1:rows;
		sqlPage.setPage(page==null?1:page);
		sqlPage.setRow(rows);
		sqlPage.setSql(sql);

		pageTempleteUtil.getJqGrid(sqlPage, pageTemplete, jqGridConfigInfo);
		return JSON.toJSONString(jqGridConfigInfo) ;

	}
	@RequestMapping(value = "/pt")
	@ResponseBody
	public Object  pt(JqGridPage jqGridPage,@RequestParam(value = "page",required = false) Integer page,
	@RequestParam(value = "rows",required = false) Integer rows,HttpServletResponse response) throws Exception {
		//获取库中数据
		PageTemplete pageTemplete = pageTempleteService.selectPg(jqGridPage.getModl().replaceAll(" ", ""));
		//获取sql数据
		BeanUtils.copyProperties(jqGridPage, pageTemplete);
		String sql = pageTempleteUtil.getSqlForPt(pageTemplete);
		//填充jqGridConfigInfo
		JqGridConfigInfo jqGridConfigInfo = pageTempleteUtil.getJqGridConfigInfo(pageTemplete);
		SqlPage sqlPage = new SqlPage();
		sqlPage.setPage(page);
		sqlPage.setRow(rows);
		sqlPage.setPage(page==null?1:page);

		pageTempleteUtil.getJqGrid(sqlPage, pageTemplete, jqGridConfigInfo);
		return JSON.toJSONString(jqGridConfigInfo) ;

	}
	@RequestMapping(value = "/jqgriddata")
	@ResponseBody
	public Object  jqgriddata( JqGridPage jqGridPage,@RequestParam(value = "page",required = false) Integer page,
			@RequestParam(value = "rows",required = false) Integer rows,HttpServletResponse response) throws Exception {
		//报表环境处理
		//获取库中数据

		PageTemplete pageTemplete = pageTempleteService.selectPg(jqGridPage.getModl().replaceAll(" ", ""));
		//获取sql数据
		BeanUtils.copyProperties(jqGridPage, pageTemplete);
		String sql = pageTempleteUtil.getSqlForPt(pageTemplete);
		//填充jqGridConfigInfo
		JqGridConfigInfo jqGridConfigInfo = pageTempleteUtil.getJqGridConfigInfo(pageTemplete);
		SqlPage sqlPage = new SqlPage();
		sqlPage.setPage(page==null?1:page);
		sqlPage.setRow(rows);
		sqlPage.setSql(sql);

		pageTempleteUtil.getJqGrid(sqlPage, pageTemplete, jqGridConfigInfo);
		return JSON.toJSONString(jqGridConfigInfo.getJdData()[jqGridPage.getI()]) ;

	}

}
