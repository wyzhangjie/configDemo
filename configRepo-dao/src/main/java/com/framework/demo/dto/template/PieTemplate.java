package com.framework.demo.dto.template;

import com.framework.demo.dto.echarts.OutputParams;
import com.framework.demo.dto.echarts.PieSeries;
import com.framework.demo.dto.page.DataVelodity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by user on 2015/9/14.
 */

@Component("pieTemplate")
public class PieTemplate<T> extends BaseDataTemplate {

    public  <T> DataVelodity fillTemplate(OutputParams outputParams) throws Exception {
        legendList.clear();
        pieSeriesList.clear();
        seriesList.clear();
        categoryList.clear();
        fillLegendListForConfig(outputParams);
        fillCategoryList(outputParams, categoryList);
        fillSeriesForConfig(outputParams);
        dataVelodity.setCategoryList(categoryList);
        dataVelodity.setLegendList(legendList);

        dataVelodity.setPieSeriesList(pieSeriesList);
        return dataVelodity;
    }

    @Override
    protected void fillSeriesForConfig(OutputParams outputParams) throws Exception {
        for(int i=0;i<outputParams.getData().size();i++ ){
            PieSeries pieSeries=new PieSeries();
            reflectDataForConfig(pieSeries, (Map) outputParams.getData().get(i), outputParams.getLegend(), outputParams.getLvalue());
            pieSeriesList.add(pieSeries);
        }

    }
    private void reflectDataForConfig(PieSeries pieSeries, Map obj, String[] legend,String[] lvalue) throws Exception {
        if (obj == null) return;
        for (Object key : obj.keySet()) {
            for (int i = 0; i < legend.length; i++) {
                if (key.toString().equalsIgnoreCase(legend[i])) {
                    pieSeries.setName(obj.get(key).toString());
                }
                if (key.toString().equalsIgnoreCase(lvalue[i])) {
                    String value =obj.get(key).toString();
                    if(value.contains(",")){
                       value= value.replaceAll(",","");
                    }
                    pieSeries.setValue(Double.parseDouble(value));
                }
            }
        }
    }
    @Override
    protected void fillCategoryList(OutputParams outputParams, List<String> categoryList) {
        //填充横坐标  categoryList
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
        for(int i=0;i<outputParams.getData().size();i++){
            fillPieLegendForConfig((Map)outputParams.getData().get(i),outputParams.getLegend(),legendList);
        }

    }
    public  void fillPieLegendForConfig(Map obj,String[] legend,List<String> legendList) throws Exception {
        if (obj == null) return ;
        for(Object key:obj.keySet()){
            for(int j=0;j<legend.length;j++){

                if(legend[j].equalsIgnoreCase(key.toString())){
                    legendList.add(obj.get(key).toString());
                }

            }
        }
    }




}
