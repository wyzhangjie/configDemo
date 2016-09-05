package com.framework.demo.web.controller.template;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.enums.BooleanEnum;
import cn.vansky.framework.core.util.JsonResp;
import com.alibaba.fastjson.JSON;

import com.framework.demo.bo.datagrid.EasyuiColumn;
import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.pageTemplate.EchartsPg;
import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.bo.showcaseSample.ShowcaseSample;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.framework.demo.dto.echarts.OutputParams;
import com.framework.demo.dto.jqgrid.JqGridConfigInfo;
import com.framework.demo.dto.page.DataVelodity;
import com.framework.demo.enm.*;
import com.framework.demo.service.collection.CollectionService;
import com.framework.demo.service.datagrid.EasyuiColumnService;
import com.framework.demo.service.datagrid.EasyuiDatagridService;
import com.framework.demo.service.dbservice.DBService;
import com.framework.demo.service.menu.MenuService;
import com.framework.demo.service.pageTemplate.PageTempleteService;
import com.framework.demo.vo.template.EasyUiDatagridPage;
import com.framework.demo.service.util.PageTempleteUtil;
import com.framework.demo.service.util.TimerUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.framework.demo.web.controller.BaseController;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/5/24 0024
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/config")
public class ConfigController   extends BaseController<PageTemplete, Long> {
    Logger logger = LoggerFactory.getLogger(ConfigController.class);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Autowired
    PageTempleteService pageTempleteService;

    @Autowired
    CollectionService collectionService;

    @Autowired
    PageTempleteUtil pageTempleteUtil;

    @Autowired
    MenuService menuService;

    @Autowired
    EasyuiDatagridService easyuiDatagridService;

    @Autowired
    EasyuiColumnService easyuiColumnService;

    @Autowired
    DBService dbService;

    private static String   delim ="&";

    @RequestMapping(value = "/menu")
    @ResponseBody
    public String menu(@RequestParam("modl") String modl,HttpServletRequest httpServletRequest) throws Exception{

        //获取库中数据
        PageTemplete pageTemplete = pageTempleteService.selectPg(modl.replaceAll(" ",""));
        //获取一些字段信息
        pageTempleteUtil.findForThermometer(pageTemplete);
        //一些变量

        //获取echarts配置数据
        String sql = pageTempleteUtil.fillTime(pageTemplete);
        List<Map<String, Object>> mapDatas = pageTempleteUtil.getEchartsDataMap(pageTemplete, sql);
        pageTemplete.setMapDatas(mapDatas);
        OutputParams outputParams = pageTempleteUtil.fullFillOutputParams(pageTemplete, mapDatas);
        DataVelodity dataVelodity = pageTempleteUtil.findTemplate(pageTemplete.getKind(), outputParams);
        pageTemplete.setDataVelodity(dataVelodity);
        httpServletRequest.setAttribute("modl", modl);
        logger.info(JSON.toJSONString(pageTemplete));
        httpServletRequest.getSession().setAttribute("pageTemplete", JSON.toJSONString(pageTemplete));
       return  JSON.toJSONString(pageTemplete);

    }

    @RequestMapping({ "/dt" })
    @ResponseBody
    public String dt(@RequestParam("modl") String modl,EchartsPg echartsPg) throws Exception {
       //获取pageTemplete
        PageTemplete pageTemplete = pageTempleteService.selectPg(modl.replaceAll(" ",""));
        BeanUtils.copyProperties(pageTemplete, echartsPg);
        //获取一些字段信息( by syr )
        pageTempleteUtil.findForThermometer(pageTemplete);
        //sql提取，填充时间 填充条件
        pageTempleteUtil.replaceTimer(pageTemplete);
        //获取数据
        List<Map<String, Object>> mapDatas = pageTempleteUtil.getEchartsDataMap(pageTemplete, pageTemplete.getTimersql());
        //填充pageTemplete
        pageTemplete.setMapDatas(mapDatas);
        //返回异步刷新图表
        OutputParams outputParams = pageTempleteUtil.fullFillOutputParams(pageTemplete, mapDatas);
        DataVelodity dataVelodity = pageTempleteUtil.findTemplate(pageTemplete.getKind(), outputParams);
        pageTemplete.setDataVelodity(dataVelodity);
        return JSON.toJSONString(pageTemplete);
    }



    @RequestMapping({ "/getsqlData" })
    @ResponseBody
    public String getsqlData(@RequestParam("sql") String sql) throws Exception {
        List<Map<String, Object>> mapDatas = null;
        mapDatas=pageTempleteService.getData(sql);
        return JSON.toJSONString(mapDatas);
    }

    @RequestMapping({ "/saveComit" })
    @ResponseBody
    public String saveComit(@RequestParam("model") String model,@RequestParam("comitmentarea")String  comitmentarea,HttpServletRequest httpRequest) throws Exception {
        logger.info("comitmentarea" + comitmentarea);
        int t = 0;
        try {
            t = pageTempleteService.saveComit(comitmentarea,Integer.parseInt(model) );
        } catch (Exception e) {
            throw e;
        }
        if(t==1){
           return JsonResp.asData().success().toJson();
        }else{

            return  JsonResp.asData().error("保存评论数据数据失败").toJson();
        }
    }

    @ResponseBody
    @RequestMapping({"/findNoFirestMenu"})
    public String findNoFirestMenu() throws DataAccessException {
        List<Menu> menus = menuService.findNoFirestMenu();
        return JSON.toJSONString(menus);
    }

    @RequestMapping({"/jqgridCreate"})
    @ResponseBody
    public String jqgridCreate(JqGridConfigInfo jqGridConfigInfo) throws Exception {
        String sql;

        PageTemplete pageTemplete = new PageTemplete();
        BeanUtils.copyProperties(jqGridConfigInfo,pageTemplete);
        //数据处理
        pageTempleteUtil.jqGridHandler(jqGridConfigInfo,pageTemplete);
        //颜色处理
        SysTemplColr sysTemplColr= new SysTemplColr();
        pageTempleteUtil.jqGridColorHandler(sysTemplColr, pageTemplete);
        //入库r
        int result =menuService.insertPageInfoForJq(pageTemplete, sysTemplColr);
        if(result==1){
            return "配置成功！";
        }else{
            return "配置失败！";
        }

    }

    @RequestMapping({"/create/bootconfigJqGridDemo"})
    public String renderJqGrid(HttpServletRequest request,Model model){
        model.addAttribute("m", new JqGridConfigInfo());
        setCommonDataForJq(model);
        return viewName("/create/bootconfigJqGridDemo");
    }

    @RequestMapping({"/create/bootconfigEasyDatagrid"})
    public String renderEasyUiGrid(HttpServletRequest request,Model model){
        model.addAttribute("m", new EasyuiDatagrid());
        setCommonDataForEasyUi(model);
        return viewName("/create/bootconfigEasyDatagrid");
    }

    /**
     * easyui修改方法
     * @param request
     * @param model
     * @param easyuiDatagrid
     * @return
     */

    @RequestMapping({"/create/easydatagridmodify"})
    public String easydatagridmodify(HttpServletRequest request,Model model,EasyuiDatagrid easyuiDatagrid){

        return viewName("/create/bootconfigEasyDatagrid");
    }

    private void setCommonDataForEasyUi(Model model) {
        List<Menu> menus = menuService.findNoFirestMenu();
        JSON.toJSONString(menus);
        Map<String,String> menu =new HashMap();
        int size = menus.size();
        for(int i=0;i<size;i++){
            menu.put(menus.get(i).getName(),menus.get(i).getName());
        }
        model.addAttribute("pmenuName",menu.keySet());
        model.addAttribute("boolean", BooleanEnum.values());
        model.addAttribute("kind", Kind.values());
    }

    private void setCommonDataForJq(Model model) {
        List<Menu> menus = menuService.findNoFirestMenu();
        JSON.toJSONString(menus);
        Map<String,String> menu =new HashMap();
        int size = menus.size();
        for(int i=0;i<size;i++){
            menu.put(menus.get(i).getName(),menus.get(i).getName());
        }
        model.addAttribute("pmenuName",menu.keySet());
        model.addAttribute("reportKind", ReportKind.values());
        model.addAttribute("realtime", Realtime.values());
        model.addAttribute("timetype", Timetype.values());
    }

    @RequestMapping({"/create/bootconfigGeneralDemo"})
    public String renderEchars(HttpServletRequest request,Model model){
        model.addAttribute("m", new PageTemplete());

        setCommonData(model);
        return viewName("/create/bootconfigGeneralDemo");

    }
    protected void setCommonData(Model model) {
        List<Menu> menus = menuService.findNoFirestMenu();
         JSON.toJSONString(menus);
        Map<String,String> menu =new HashMap();
        int size = menus.size();
        for(int i=0;i<size;i++){
            menu.put(menus.get(i).getName(),menus.get(i).getName());
        }
        model.addAttribute("pmenuName",menu.keySet());
        model.addAttribute("kind", Kind.values());
        model.addAttribute("reportKind", ReportKind.values());
        model.addAttribute("realtime", Realtime.values());
        model.addAttribute("timetype", Timetype.values());
        model.addAttribute("ispercent", Ispercent.values());
        model.addAttribute("maxandmin", Maxandmin.values());
        model.addAttribute("average",Average.values());

    }

    @RequestMapping({"/easydatagrid"})
    @ResponseBody
    public String easydatagrid(EasyuiDatagrid easyUiDatagrid) throws Exception {
    //col信息转换
      String[] cols = easyUiDatagrid.getParam().split(",");
      List<EasyuiColumn> lcols = new ArrayList<EasyuiColumn>();
      int len = cols.length;
      for(int i=0;i<len;i++){
          EasyuiColumn column =new EasyuiColumn();
          column.setField(cols[i].split(":")[0].trim());
          column.setTitle(cols[i].split(":")[1].trim());
          lcols.add(column);
          defaultSet(column);
      }

        easyUiDatagrid.getColumns().add(0, lcols);

        int result =menuService.insertPageInfoForDatagrid(easyUiDatagrid);
        if(result==1){
            return "配置成功！";
        }else{
            return "配置失败！";
        }


    }




    @RequestMapping({"/easyuimenu"})
    @ResponseBody
    public String easyuimenu(EasyUiDatagridPage easyUiDatagridPage) throws Exception {

        EasyuiDatagrid easyuiDatagrid=   easyuiDatagridService.findByModel(Integer.parseInt(easyUiDatagridPage.getModl()));
        List<EasyuiColumn> easyuiColumns= easyuiColumnService.findByModel(Integer.parseInt(easyUiDatagridPage.getModl()));
       //列信息
        easyuiDatagrid.getColumns().add(easyuiColumns);
        //获取sql
        String sql = pageTempleteUtil.fillTimeForEasyUi(easyuiDatagrid,easyUiDatagridPage);
        //fill data
        pageTempleteUtil.fillDatagrid(easyuiDatagrid, sql);
        return JSON.toJSONString(easyuiDatagrid);
    }


    private void defaultSet(EasyuiColumn column) {
        column.setAlign("left");
        column.setCheckbox("");
        column.setOrder("desc");
        column.setResizable("true");
        column.setSortable("true");
        column.setWidth(70);

    }

    @RequestMapping({"/echartsCreate"})
        @ResponseBody
    public String echartsCreate(PageTemplete pageTemplete,HttpServletRequest request) throws DataAccessException {
         String sql;
        //有些字段特殊处理下
        if("null".equalsIgnoreCase(pageTemplete.getDaynum())||pageTemplete.getDaynum()==null){
            pageTemplete.setDaynum("0");
        }
        if(pageTemplete.getMultime()==null){
            pageTemplete.setMultime("0");
        }

       //时间处理
       String endtime= TimerUtil.processMulTimeForModiifyAndCreate(pageTemplete.getReportKind(), pageTemplete);
       String starttime=TimerUtil.processMulStartTimeForMenu(pageTemplete.getDaynum(), endtime);
        String timer = TimerUtil.processTimeForModifyAndCreate(pageTemplete.getReportKind(), pageTemplete);
        pageTemplete.setStarttime(starttime);
        pageTemplete.setEndtime(endtime);
        pageTemplete.setTimer(timer);
        //条件处理
        pageTempleteUtil.toOption(pageTemplete,request);
        //获取data
        if(pageTemplete.getMultime().equalsIgnoreCase("1")){
            sql= StringUtils.replace(pageTemplete.getTimersql(), "{start}", "\"" + starttime + "\"");
            sql=StringUtils.replace(sql, "{end}", "\"" + endtime + "\"");
        }else{
            sql = StringUtils.replace(pageTemplete.getTimersql(), "{pt}", "\"" + timer + "\"");
        }
        //pageTemplate入库
        if( pageTemplete.getOtherOption()==null||StringUtils.isEmpty( pageTemplete.getOtherOption())||pageTemplete.getOtherOption().equalsIgnoreCase("null")){

        }else{
            String[] subOption = pageTemplete.getOtherOption().split(delim);
            for(int i=0;i<subOption.length;i++){
                String subtmp  =subOption[i].replaceAll(", name","");
                sql = StringUtils.replace(sql, "{"+(i+1)+"}", "(" + subtmp + ")");
            }
        }
        List<Map<String, Object>> mapDatas = null;
        try{
            mapDatas = pageTempleteService.getData(sql);
            pageTemplete.setMapDatas(mapDatas);
        }catch (Exception e){


            return "返回报错"+e.getMessage().toString();
        }
        //插入数据到menu表和page_template 表。

         //插入menu
        if(menuService.insertPageInfo(pageTemplete)==1){
            return "配置成功！";
        }else{
            return "配置失败！";
        }


   }


    protected boolean hasError(ShowcaseSample m, BindingResult result) {
        Assert.notNull(m);

        //字段错误 前台使用<es:showFieldError commandName="showcase/sample"/> 显示
        try {
            if (m.getBirthday() != null && dateFormat.parse(m.getBirthday()).after(new Date())) {
                //前台字段名（前台使用[name=字段名]取得dom对象） 错误消息键。。
                result.rejectValue("birthday", "birthday.past");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //全局错误 前台使用<es:showGlobalError commandName="showcase/sample"/> 显示
        if (m.getName().contains("admin")) {
            result.reject("name.must.not.admin");
        }

        return result.hasErrors();
    }


    @RequestMapping({"/checkMenuName"})
    @ResponseBody
    public String checkMenuName(@RequestParam("pmenuName") String pmenuName,@RequestParam("menuName") String menuName) throws DataAccessException {
        int i = 1;
        i = dbService.findMenu(pmenuName, menuName);
        if (i == 0) {
            return "1";
        }
        return "0";
    }


}
