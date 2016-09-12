package com.framework.demo.dto.template;


import com.framework.demo.dto.echarts.*;
import com.framework.demo.dto.page.DataVelodity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2015/9/14.
 */
@Component("hlineTemplate")
public class HlineTemplate<T> extends BaseDataTemplate {

    protected void fillSeriesForConfig(OutputParams outputParams) throws Exception {
        int count=0;
        for(int i=0;i<outputParams.getLegend().length;i++){

            Series series=new Series();
            List<Double> dataList=new ArrayList<Double>();
            series.setName(outputParams.getLegend()[i].toString());
            series.setType(outputParams.getKind());

          /*  series.setBarWidth(45);*/
            series.setBarMinHeight(50);
            series.setBarMaxWidth(100);
           /* series.setBarCategoryGap("30");*/
            series.setStack(outputParams.getStack());

            for(int j=0;j<outputParams.getData().size();j++ ){

                reflectForConfig((Map)outputParams.getData().get(j),outputParams.getLegend()[i],dataList);
            }
            int tmp=fellPM(dataList);//感知该组数据的正负
            Normal normal= new Normal();
            Label label =new Label();
            label.setShow(true);
            normal.setLabel(label);
            ItemStyle itermStyle =new ItemStyle();
            itermStyle.setNormal(normal);
            series.setItemStyle(itermStyle);
            series.setType("bar");
            if(outputParams.getIspercent().equalsIgnoreCase("11")){
                label.setFormatter("{c} %");
            }
            if(tmp>=0){
                count++;
                if(count%2!=0){
                    //1、3、5单数显示到外面
                    label.setPosition(Position.right);

                    series.setBarWidth(5);
                }else{
                    //双数显示到里面；
                    label.setPosition(Position.inside);
                    series.setBarWidth(35);
                }
            }else{
                series.setBarWidth(5);
                label.setPosition(Position.left);
            }
            //感知数据正负,

            if(dataList.size()!=0){
                String isPercent=outputParams.getIspercent();
                String isMaxAndMin=outputParams.getMaxandmin();
                String isAverage=outputParams.getAverage();
                if(isMaxAndMin.equalsIgnoreCase("11")){
                    if(isPercent.equalsIgnoreCase("11")){
                        fillMarkPointPercent(series);
                    }else{
                        fillMarkPoint(series);
                    }
                }
                if(isAverage.equalsIgnoreCase("11")){
                    if(isPercent.equalsIgnoreCase("11")){
                        fillMarkLinePercent(series);
                    }else{
                        fillMarkLine(series);
                    }
                }
            }
            /*if(dataList.size()!=0){
                fillMarkLine(series);
                fillMarkPoint(series);
            }*/
            series.setData(dataList);
            seriesList.add(series);
        }
    }


    protected void fillCategoryList(OutputParams outputParams, List<String> categoryList) {
        for (int i=0;i<outputParams.getData().size();i++){
            T dataVo=(T) outputParams.getData().get(i);

            //横坐标的数据对应的字段为category
            try {
                fillCateReflectForConfig((T) dataVo,outputParams.getCategory(),categoryList);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                logger.info("在获取横坐标的时候报错，错误信息为："+e.getMessage());
            }
        }

    }


    protected void fillLegendListForConfig(OutputParams outputParams) throws Exception {
        for(int i=0;i<outputParams.getLegend().length;i++){
            legendList.add(outputParams.getLegend()[i]);
        }
    }


    public <T> DataVelodity fillTemplate(OutputParams outputParams) throws Exception {
        legendList.clear();
        pieSeriesList.clear();
        seriesList.clear();
        categoryList.clear();
        fillLegendListForConfig(outputParams);
        fillCategoryList(outputParams, categoryList);
        fillSeriesForConfig(outputParams);
        dataVelodity.setCategoryList(categoryList);
        dataVelodity.setLegendList(legendList);
        dataVelodity.setSeriesList(seriesList);
        return dataVelodity;
    }
}
