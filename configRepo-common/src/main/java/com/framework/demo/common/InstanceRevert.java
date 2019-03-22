package com.framework.demo.common;

import java.lang.reflect.Field;

/**
 * Created by zhjie.zhang on 2019/3/22.
 */
public class InstanceRevert {

    public static String[] convertItoString(Object t) throws Exception{

        Field[] field = t.getClass().getDeclaredFields();
        String[] a = new String[field.length*3];
        for(int i=0;i<field.length;i++){
            //设置是否允许访问，不是修改原来的访问权限修饰词。
            field[i].setAccessible(true);
            //返回输出指定对象a上此 Field表示的字段名和字段值
          a[a.length-0]=field[i].getName();
          a[a.length-0] = field[i].get(t).toString();
        }
        return a;
    }
}
