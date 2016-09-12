package com.framework.demo.dto.template;


import com.framework.demo.dto.echarts.OutputParams;
import com.framework.demo.dto.echarts.Series;
import com.framework.demo.dto.page.DataVelodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2015/9/14.
 */
@Component("ylinesTemplate")
public class YlinesTemplate<T> extends BaseDataTemplate {
    Logger logger = LoggerFactory.getLogger(BaseDataTemplate.class);

    protected void fillSeriesForConfig(OutputParams outputParams) throws Exception {
        String numLeftLegend=outputParams.getLeftLegendNum();
        int numLegendLeft= Integer.parseInt(numLeftLegend);
        String isMaxAndMin=outputParams.getMaxandmin();
        String isAverage=outputParams.getAverage();
        String isPercent =outputParams.getIspercent();
        for(int i=0;i<outputParams.getLegend().length;i++){
            if(i<numLegendLeft){
                Series series=new Series();
                List<Double> dataList=new ArrayList<Double>();
                series.setName(outputParams.getLegend()[i].toString());
                series.setType(outputParams.getKind());

                series.setBarWidth(45);
                series.setBarMinHeight(50);
                series.setBarMaxWidth(100);
                series.setBarCategoryGap("30");
                series.setStack(outputParams.getStack());
                series.setYAxisIndex(Integer.parseInt(outputParams.getSqlYaxis()[i].trim()));
                String[] kinds=outputParams.getKind().toString().split(",");
                if(series.getYAxisIndex()==0){
                    series.setType(kinds[1]);
                }
                if(series.getYAxisIndex()==1){
                    series.setType(kinds[2]);
                }
                for(int j=0;j<outputParams.getData().size();j++ ){

                    reflectForConfig((Map)outputParams.getData().get(j),outputParams.getLegend()[i],dataList);
                }
                //感知数据正负,

                if(dataList.size()!=0){
                   /* if(isPercent.equalsIgnoreCase(""))
                    fillMarkLine(series);
                    fillMarkPoint(series);*/
                    fillMarkPointLineLeft(isPercent,isMaxAndMin,isAverage,series);
                }
                //ArryList pv ArryList uv
                series.setData(dataList);
                seriesList.add(series);
            }else{
                Series series=new Series();
                List<Double> dataList=new ArrayList<Double>();
                series.setName(outputParams.getLegend()[i].toString());
                series.setType(outputParams.getKind());

                series.setBarWidth(45);
                series.setBarMinHeight(50);
                series.setBarMaxWidth(100);
                series.setBarCategoryGap("30");
                series.setStack(outputParams.getStack());
                series.setYAxisIndex(Integer.parseInt(outputParams.getSqlYaxis()[i].trim()));
                String[] kinds=outputParams.getKind().toString().split(",");
                if(series.getYAxisIndex()==0){
                    series.setType(kinds[1]);
                }
                if(series.getYAxisIndex()==1){
                    series.setType(kinds[2]);
                }
                for(int j=0;j<outputParams.getData().size();j++ ){

                    reflectForConfig((Map)outputParams.getData().get(j),outputParams.getLegend()[i],dataList);
                }
                //感知数据正负,

                if(dataList.size()!=0){
                  /*  fillMarkLine(series);
                    fillMarkPoint(series);*/
                    fillMarkPointLineRight(isPercent,isMaxAndMin,isAverage,series);
                }
                //ArryList pv ArryList uv
                series.setData(dataList);
                seriesList.add(series);
            }

           /* Series series=new Series();
            List<Double> dataList=new ArrayList<Double>();
            series.setName(outputParams.getLegend()[i].toString());
            series.setType(outputParams.getKind());

            series.setBarWidth(45);
            series.setBarMinHeight(50);
            series.setBarMaxWidth(100);
            series.setBarCategoryGap("30");
            series.setStack(outputParams.getStack());
            series.setYAxisIndex(Integer.parseInt(outputParams.getSqlYaxis()[i].trim()));
            String[] kinds=outputParams.getKind().toString().split(",");
            if(series.getYAxisIndex()==0){
                series.setType(kinds[1]);
            }
            if(series.getYAxisIndex()==1){
                series.setType(kinds[2]);
            }
            for(int j=0;j<outputParams.getData().size();j++ ){

                reflectForConfig((Map)outputParams.getData().get(j),outputParams.getLegend()[i],dataList);
            }
            //感知数据正负,

            if(dataList.size()!=0){
                fillMarkLine(series);
                fillMarkPoint(series);
            }
            //ArryList pv ArryList uv
            series.setData(dataList);
            seriesList.add(series);*/
        }
    }
    private void fillMarkPointLineLeft(String isPercent,String isMaxAndMin,String isAverage,Series series){
        if(isPercent.equalsIgnoreCase("11")||isPercent.equalsIgnoreCase("10")){
            if(isMaxAndMin.equalsIgnoreCase("11")||isMaxAndMin.equalsIgnoreCase("10")){
                fillMarkPointPercent(series);
            }
            if(isAverage.equalsIgnoreCase("11")||isAverage.equalsIgnoreCase("10")){
                fillMarkLinePercent(series);
            }
        }else{
            if(isMaxAndMin.equalsIgnoreCase("11")||isMaxAndMin.equalsIgnoreCase("10")){
                fillMarkPoint(series);
            }
            if(isAverage.equalsIgnoreCase("11")||isAverage.equalsIgnoreCase("10")){
                fillMarkLine(series);
            }
        }
    }
    private void fillMarkPointLineRight(String isPercent,String isMaxAndMin,String isAverage,Series series){
        if(isPercent.equalsIgnoreCase("11")||isPercent.equalsIgnoreCase("01")){
            if(isMaxAndMin.equalsIgnoreCase("11")||isMaxAndMin.equalsIgnoreCase("01")){
                fillMarkPointPercent(series);
            }
            if(isAverage.equalsIgnoreCase("11")||isAverage.equalsIgnoreCase("01")){
                fillMarkLinePercent(series);
            }
        }else{
            if(isMaxAndMin.equalsIgnoreCase("11")||isMaxAndMin.equalsIgnoreCase("01")){
                fillMarkPoint(series);
            }
            if(isAverage.equalsIgnoreCase("11")||isAverage.equalsIgnoreCase("01")){
                fillMarkLine(series);
            }
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
        this.categoryList=categoryList.subList(0,categoryList.size()/2);


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
