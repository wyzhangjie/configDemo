package interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by demo .
 * Auth: hyssop
 * Date: 2016-09-13-12:57
 */
public class MyMethodInterceptor1 implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("第一个拦截器开始了");
        invocation.proceed();
        System.out.println("第一个拦截器结束了");
        return null;
    }
}
