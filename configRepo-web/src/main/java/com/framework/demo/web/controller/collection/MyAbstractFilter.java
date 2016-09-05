package com.framework.demo.web.controller.collection;

import org.apache.shiro.subject.ExecutionException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.mgt.WebSecurityManager;
import org.apache.shiro.web.servlet.OncePerRequestFilter;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.concurrent.Callable;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/7/15 0015
 * To change this template use File | Settings | File Templates.
 */
public abstract class MyAbstractFilter extends OncePerRequestFilter {


    protected void doFilterInternal(ServletRequest servletRequest, ServletResponse servletResponse, final FilterChain chain)
            throws ServletException, IOException {

        Throwable t = null;
        MyInterfaceBean myInterfaceBean = new MyInterfaceBean() {
            @Override
            public <V> V execute(Callable<V> callable) throws Exception {
                return null;
            }
        };
        try {

            //noinspection unchecked
            myInterfaceBean.execute(new Callable() {
                public Object call() throws Exception {
                    System.out.println("回调");
                    return null;
                }
            });
        } catch (ExecutionException ex) {
            t = ex.getCause();
        } catch (Throwable throwable) {
            t = throwable;
        }

        if (t != null) {
            if (t instanceof ServletException) {
                throw (ServletException) t;
            }
            if (t instanceof IOException) {
                throw (IOException) t;
            }
            //otherwise it's not one of the two exceptions expected by the filter method signature - wrap it in one:
            String msg = "Filtered request failed.";
            throw new ServletException(msg, t);
        }
    }

}
