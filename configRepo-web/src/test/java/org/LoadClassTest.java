package org;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.IOException;
import java.util.Properties;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/7/19 0019
 * To change this template use File | Settings | File Templates.
 */

public class LoadClassTest {
    private static final String DEFAULT_STRATEGIES_PATH = "classpath:conf/test.properties";
    private static final Properties defaultStrategies;

    static {
        // Load default strategy implementations from properties file.
        // This is currently strictly internal and not meant to be customized
        // by application developers.
        try {
            ClassPathResource resource = new ClassPathResource(DEFAULT_STRATEGIES_PATH, DispatcherServlet.class);
            defaultStrategies = PropertiesLoaderUtils.loadProperties(resource);
        }
        catch (IOException ex) {
            throw new IllegalStateException("Could not load 'DispatcherServlet.properties': " + ex.getMessage());
        }
    }

}
