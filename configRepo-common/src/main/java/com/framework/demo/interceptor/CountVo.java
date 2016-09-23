package com.framework.demo.interceptor;

/**
 * Created by demo .
 * Auth: hyssop
 * Date: 2016-09-13-11:00
 */
public class CountVo {
    /**
     * 计数器
     */
    private String count;
    /**
     * 方法名称
     */
    private String methodName;
    /**
     * 类名称
     */
    private String className;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
