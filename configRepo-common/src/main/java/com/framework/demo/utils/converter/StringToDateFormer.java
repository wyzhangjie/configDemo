package com.framework.demo.utils.converter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * @author hassop
 * @Description
 * @date 2016/8/30 0030
 * To change this template use File | Settings | File Templates.
 */
public class StringToDateFormer implements Formatter {
    @Override
    public Object parse(String text, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Object object, Locale locale) {
        return null;
    }
}
