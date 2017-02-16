package cc.atu123.learn.design.adapter;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/14
 * Time: 15:14
 * Desc: 对象适配器,当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行
 */
public class ObjectAdapter implements Targetable{
    private Source source;

    public ObjectAdapter(Source source){
        super();
        this.source = source;
    }

    public void method1() {
        this.source.method1();
    }

    public void method2() {
        System.out.println("this is method2");
    }
}
