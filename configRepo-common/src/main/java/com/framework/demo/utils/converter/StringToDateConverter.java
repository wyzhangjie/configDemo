package com.framework.demo.utils.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hassop
 * @Description
 * @date 2016/8/30 0030
 * To change this template use File | Settings | File Templates.
 */
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        String former = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(former);
        Date result = new Date();
        try {
            result = simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}
