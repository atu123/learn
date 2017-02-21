package cc.atu123.learn.patterns.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/15
 * Time: 11:04
 */
public class CglibProxy implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib before method");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("cglib after method");
        return result;
    }
    public Object getProxyInstance(Class obj){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj);
        enhancer.setCallback(this);
        return  enhancer.create();
    }
}
