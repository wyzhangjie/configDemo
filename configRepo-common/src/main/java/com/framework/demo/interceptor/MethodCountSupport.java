package com.framework.demo.interceptor;

import com.framework.demo.common.InstanceRevert;
import com.framework.demo.spring.SpeedUpSpringProcessor;
import com.github.fartherp.framework.common.util.CsvUtil;
import com.github.fartherp.framework.poi.csv.CSVRead;
import com.github.fartherp.framework.poi.csv.CSVReadDeal;

import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by demo .
 * Auth: hyssop
 * Date: 2016-09-13-10:28
 */
public abstract class MethodCountSupport implements InitializingBean {
    private final Logger log = LoggerFactory.getLogger(MethodCountSupport.class);
    /**
     * csv文件
     */
    private static final String DEFAULT_CSV_PATH = "count.csv";
    /**
     * properties文件
     */
    private static final String DEFAULT_Prop_PATH = "count.properties";

    private static final Properties defaultStrategies;

    private static final CSVRead csvReader = new CSVRead();
    /**
    *类型转换器
    */

    static {
        // Load default strategy implementations from properties file.
        // This is currently strictly internal and not meant to be customized
        // by application developers.
        try {
            ClassPathResource resource = new ClassPathResource(DEFAULT_Prop_PATH, MethodCountSupport.class);
            defaultStrategies = PropertiesLoaderUtils.loadProperties(resource);


        } catch (IOException ex) {
            throw new IllegalStateException("Could not load 'ContextLoader.properties': " + ex.getMessage());
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    public void beforeAccessForCSVCount(Class<? extends MethodInvocation> classc, Method method) throws Exception {
        InputStream inputStream = new BufferedInputStream(new FileInputStream(new File(DEFAULT_CSV_PATH)));
        final String classname = classc.getSimpleName();
        final String methodname = method.getName();
        CSVRead.read(inputStream, new CSVReadDeal<CountVo> () {
            @Override
            public void dealBatchBean(List<CountVo> list) {

                String[] title = new String[]{"类名称","方法名称","访问次数"};
                List<String[]> strs =new ArrayList<String[]>();
                for(CountVo countVo:list){
                    String[] ss = new String[0];
                    try {
                        ss = InstanceRevert.convertItoString(countVo);
                    } catch (Exception e) {
                        log.info("字符串转换错误");
                    }
                    strs.add(ss);
                }
                CsvUtil.writeCsvFile(DEFAULT_CSV_PATH.toString().substring(0, DEFAULT_CSV_PATH.toString().lastIndexOf("csv")-1),title,strs);
            }
            @Override
            public CountVo dealBean(String[] arr) {
                CountVo countVo = new CountVo();
                countVo.setClassName(arr[0]);
                countVo.setMethodName(arr[1]);
                countVo.setCount(arr[2]);
                if(countVo.getClassName().equalsIgnoreCase(classname)&&countVo.getMethodName().equalsIgnoreCase(methodname)){
                    countVo.setCount(String.valueOf(Integer.valueOf(countVo.getCount()) + 1));
                }
                return countVo;
            }
        });
        inputStream.close();
    }

}
