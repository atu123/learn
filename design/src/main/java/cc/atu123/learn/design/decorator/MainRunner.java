package cc.atu123.learn.design.decorator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/14
 * Time: 18:18
 */
public class MainRunner {
    public static void main(String[] args) {
        DecoratorSourceable source = new DecoratorSource();
        Decorator decorator = new Decorator(source);
        source.method();
        decorator.method();
    }
}
