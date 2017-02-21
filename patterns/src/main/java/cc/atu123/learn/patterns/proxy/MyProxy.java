package cc.atu123.learn.patterns.proxy;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/14
 * Time: 18:25
 */
public class MyProxy implements Sourceable {
    private Source source;
    public MyProxy(){
        super();
        this.source = new Source();
    }
    public void method() {
        System.out.println("before");
        source.method();
        System.out.println("after");
    }
}
