package com.framework.demo.dto.template;

import com.framework.demo.dto.echarts.*;
import com.framework.demo.dto.page.DataVelodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2015/9/14.
 */
public abstract class BaseDataTemplate implements DataTemplate {
    Logger logger = LoggerFactory.getLogger(BaseDataTemplate.class);

    public List<String> legendList=new ArrayList<String>();

    public List<Series> seriesList=new ArrayList<Series>();

    public List<PieSeries> pieSeriesList=new ArrayList<PieSeries>();

    public List<String> categoryList=new ArrayList<String>();

    public DataVelodity dataVelodity=new DataVelodity();


    //填充Series
    protected abstract void fillSeriesForConfig(OutputParams outputParams) throws Exception;
    //填充Category
    protected abstract void fillCategoryList(OutputParams outputParams, List<String> categoryList);
    //填充legend
    protected abstract void fillLegendListForConfig(OutputParams outputParams) throws Exception;


    public void  output(HttpServletResponse response,String outString){
        try {
            response.reset();
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=UTF-8");
            PrintWriter out=response.getWriter();
			/*out.print(outString.toString().getBytes("UTF-8"));*/
            out.write(outString.toString());
            out.flush();
            out.close();
		/*	response.getOutputStream().write(
					outString.toString().getBytes("UTF-8"));*/
            logger.info("输出数据为"+outString.toString().getBytes("UTF-8"));
			/*response.getOutputStream().flush();
			response.getOutputStream().close();*/
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
    public int fellPM(List<Double> dataList) {
        int i=1;
        for(int datal=0;datal<dataList.size();datal++){
            if(dataList.get(datal)<0){
                i=-1;
                break;
            }
        }
        return i;
    }
    //带百分号的平均值线
    public void fillMarkLinePercent(Series series){
        MarkLine markLine = new MarkLine();
        DataTN dataTN = new DataTN();
        dataTN.setType("average");
        dataTN.setName("平均值");
        ItemStyle itemStyle = new ItemStyle();
        Normal normal=new Normal();
        Label label=new Label();
        label.setShow(true);
        label.setPosition("end");
        label.setFormatter("{c}%");
        normal.setLabel(label);
        itemStyle.setNormal(normal);
        markLine.setItemStyle(itemStyle);
        List<Object> data=new ArrayList<Object>();
        data.add(dataTN);
        markLine.setData(data);
        series.setMarkLine(markLine);
    }
    //带百分号的最大值和最小值
    public void fillMarkPointPercent(Series series){
        MarkPoint markPoint = new MarkPoint();
        List<Object> data = new ArrayList<Object>();
        DataTN maxDataTN = new DataTN();
        maxDataTN.setType("max");
        maxDataTN.setName("最大值");
        DataTN minDataTN= new DataTN();
        minDataTN.setType("min");
        minDataTN.setName("最小值");
        data.add(maxDataTN);
        data.add(minDataTN);
        markPoint.setData(data);
        ItemStyle itemStyle=new ItemStyle();
        Normal normal=new Normal();
        Label label=new Label();
        label.setShow(true);
        label.setFormatter("{c}%");
        normal.setLabel(label);
        itemStyle.setNormal(normal);
        markPoint.setItemStyle(itemStyle);
        series.setMarkPoint(markPoint);
    }
    public void fillMarkLine(Series series) {
        MarkLine markLine = new MarkLine();
        DataTN dataTN = new DataTN();
        dataTN.setType("average");
        dataTN.setName("平均值");
        List<Object> data =new ArrayList<Object>();
        data.add(dataTN);
        markLine.setData(data);
        series.setMarkLine(markLine);

    }
    public  void fillMarkPoint(Series series) {
        MarkPoint markPoint =new MarkPoint();
        List<Object> list =new ArrayList<Object>();
        DataTN dataTN = new DataTN();
        dataTN.setType("max");
        dataTN.setName("最大值");
        list.add(dataTN);
        DataTN dataTN2 = new DataTN();
        dataTN2.setType("min");
        dataTN2.setName("最小值");
        list.add(dataTN2);
        markPoint.setData(list);
        series.setMarkPoint(markPoint);
    }
    /*
         * data是行数据的key,value值，如果key值等于data里面的key那么数据该放置到dataList中
         */
    public static void reflectForConfig(Map data,Object key,List<Double> datas) throws Exception {
        if (data == null) return ;
        //	List<Double> data=new ArrayList<Double>();
        for(Object d:data.keySet()){
            if(key.toString().equalsIgnoreCase(d.toString())){
                datas.add(Double.parseDouble(data.get(d).toString().trim().replaceAll(",", "")));
            }
        }


    }
    	/*
  fields[j].getName()  字段名称
  fields[j].get(obj)  字段的值
  */

    public static void reflect(Object obj,Object param,List<Double> data) throws Exception {
        if (obj == null) return ;
        //	List<Double> data=new ArrayList<Double>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int j = 0; j < fields.length; j++) {
            fields[j].setAccessible(true);

            if(fields[j].getName().equalsIgnoreCase(param.toString())){
                data.add(Double.parseDouble(fields[j].get(obj).toString().trim().replaceAll(",", "")));

            }

        }

    }
    public void fillCateReflectForConfig(Object obj,String[] category,List<String> categoryList)throws Exception {
        if( obj == null) return ;
        Map<String, Object> map=(Map<String, Object>)obj;
        for(String key:map.keySet()){
            for(int i=0;i<category.length;i++){
                if(key.equalsIgnoreCase(category[i])){
                    categoryList.add(map.get(key).toString());
                }
            }

        }
    }
}
