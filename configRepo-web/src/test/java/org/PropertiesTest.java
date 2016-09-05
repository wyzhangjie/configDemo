package org;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA .
 * Auth: hyssop
 * Date: 2016/9/5 0005
 */
public class PropertiesTest {

    @Test
   public void testProperties() throws IOException {
       Properties properties = new Properties();
       String path = "D:\\sourcestudy\\configdemo\\code-generator-configdemo\\code-generator-web\\src\\main\\profiles\\dev\\logging.properties";
       InputStream inputStream = new BufferedInputStream(new FileInputStream(new File(path)));
       properties.load(inputStream);
       System.out.println(properties.get("org.apache.juli.FileHandler.level"));

    }
}
