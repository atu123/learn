package cc.atu123.learn.patterns.decorator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/14
 * Time: 18:15
 */
public class Decorator implements  DecoratorSourceable {
    DecoratorSourceable decoratorSourceable;
    public Decorator(DecoratorSourceable decoratorSourceable){
        super();
        this.decoratorSourceable = decoratorSourceable;
    }
    public void method() {
        System.out.println("装饰器添加方法执行前");
        decoratorSourceable.method();
        System.out.println("装饰器添加方法执行后");
    }
}
