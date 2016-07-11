/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package orm.mybatis.plugin.page.dialect;

import cn.vansky.framework.core.orm.mybatis.plugin.page.dialect.*;
import org.apache.commons.lang.StringUtils;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/3/24
 */
public enum DialectType {
    MYSQL("mysql", "cn.vansky.framework.core.orm.mybatis.plugin.page.dialect.MySQLDialect"),
    ORACLE("oracle", ""),
    SQL_SERVER("microsoft sql server", ""),
    ;

    private String name;

    private String className;

    DialectType(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public static cn.vansky.framework.core.orm.mybatis.plugin.page.dialect.Dialect getDialect(String name) {
        DialectType[] types = DialectType.values();
        for (DialectType type : types) {
            if (StringUtils.equalsIgnoreCase(type.getName(), name)) {
                try {
                    Class<cn.vansky.framework.core.orm.mybatis.plugin.page.dialect.Dialect> forName = (Class<cn.vansky.framework.core.orm.mybatis.plugin.page.dialect.Dialect>) Class.forName(type.getClassName());
                    return forName.newInstance();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
