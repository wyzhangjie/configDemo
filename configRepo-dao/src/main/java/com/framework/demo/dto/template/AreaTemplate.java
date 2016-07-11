package com.framework.demo.dto.template;


import com.framework.demo.dto.echarts.*;
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
@Component("areaTemplate")
public class AreaTemplate<T> extends BaseDataTemplate {
    Logger logger = LoggerFactory.getLogger(AreaTemplate.class);

    @Override
    protected void fillSeriesForConfig(OutputParams outputParams) throws Exception {
        int count=0;

        for(int i=0;i<outputParams.getLegend().length;i++){

            Series series=new Series();
            List<Double> dataList=new ArrayList<Double>();
            series.setName(outputParams.getLegend()[i].toString());
            series.setType(outputParams.getKind());

            series.setBarWidth(45);
            series.setBarMinHeight(50);
            series.setBarMaxWidth(100);
            series.setBarCategoryGap("30");
            series.setStack(outputParams.getStack());
            AreaStyle areaStyle = new AreaStyle();
            areaStyle.setType("default");
            Normal normal= new Normal();
            normal.setAreaStyle(areaStyle);
            ItemStyle itermStyle =new ItemStyle();
            itermStyle.setNormal(normal);
            series.setItemStyle(itermStyle);
            series.setType("line");
            for(int j=0;j<outputParams.getData().size();j++ ){

                reflectForConfig((Map)outputParams.getData().get(j),outputParams.getLegend()[i],dataList);
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

//            if(dataList.size()!=0){
//                fillMarkLine(series);
//                fillMarkPoint(series);
//            }
            series.setData(dataList);
            seriesList.add(series);
        }
    }

    @Override
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


    @Override
    protected void fillLegendListForConfig(OutputParams outputParams) throws Exception {
        for(int i=0;i<outputParams.getLegend().length;i++){
            legendList.add(outputParams.getLegend()[i]);
        }
    }

    @Override
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
