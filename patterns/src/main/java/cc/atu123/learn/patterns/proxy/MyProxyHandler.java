package cc.atu123.learn.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/15
 * Time: 10:12
 */
public class MyProxyHandler implements InvocationHandler {
    private Object proxy;
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        System.out.println("before method");
        Object result = method.invoke(this.proxy,args);
        System.out.println("after method");
        return result;
    }

    public Object getProxyInstance(Class clazz) throws IllegalAccessException, InstantiationException {
        this.proxy = clazz.newInstance();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
}
