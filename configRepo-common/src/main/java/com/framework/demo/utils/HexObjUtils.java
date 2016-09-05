package com.framework.demo.utils;

import com.framework.demo.exception.BaseException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.output.ByteArrayOutputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/6/21 0021
 * To change this template use File | Settings | File Templates.
 */
public class HexObjUtils {
//数据库返回回来的session 转化成为对象
    public static  Object nullSafeGet(String hexStr) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new ByteArrayInputStream(Hex.decodeHex(hexStr.toCharArray())));
            return ois.readObject();
        } catch (Exception e) {
            throw new BaseException(e.getMessage());
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
            }
        }
    }

    public static String  nullSafeSet( Object value) throws IOException {
        ObjectOutputStream oos = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        oos = new ObjectOutputStream(bos);
        oos.writeObject(value);
        byte[] objectBytes = bos.toByteArray();
        String hexStr = Hex.encodeHexString(objectBytes);
           return hexStr;
    }
}