package com.framework.demo.web.controller.collection;

import org.apache.shiro.subject.ExecutionException;

import java.util.concurrent.Callable;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/7/15 0015
 * To change this template use File | Settings | File Templates.
 */
public interface MyInterfaceBean {

    <V> V execute(Callable<V> callable) throws Exception;
}
