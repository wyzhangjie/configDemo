package com.framework.demo.utils;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * @author hassop
 * @Description
 * @date 2016/9/1 0001
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MapperJsonUtil {
    private static final String DEFAULT_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";  
                private static final ObjectMapper mapper;
              
                static {  
                SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
                mapper = new ObjectMapper();  
                mapper.setDateFormat(dateFormat);  
            }  
                  
                public static String toJson(Object obj) {  
                try {  
                        return mapper.writeValueAsString(obj);  
                    } catch (Exception e) {  
                        throw new RuntimeException("转换json字符失败!");  
                    }  
            }  
                  

}
