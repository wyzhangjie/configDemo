package interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by demo .
 * Auth: hyssop
 * Date: 2016-09-13-12:59
 */
public class MyMethodInterceptor2 implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("第二个拦截器开始了");
        invocation.proceed();
        System.out.println("第二个拦截器结束了");
        return null;
    }
}
