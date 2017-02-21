package cc.atu123.learn.patterns.proxy;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/14
 * Time: 18:20
 */
public class MainRunner {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Sourceable source = new MyProxy();
        source.method();
        System.out.println("********** dynamic proxy **********");
        MyProxyHandler jdkProxy = new MyProxyHandler();
        Sourceable proxySource = (Sourceable)jdkProxy.getProxyInstance(Source.class);
        proxySource.method();

        System.out.println("********** cglib proxy **********");
        CglibProxy cglibProxy = new CglibProxy();
        Sourceable cglibSource = (Sourceable)cglibProxy.getProxyInstance(Source.class);
        cglibSource.method();
    }
}
