package cc.atu123.learn.design.adapter;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/14
 * Time: 15:11
 * Desc: 类适配器,当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可
 */
public class ClassAdapter extends Source implements Targetable{
    public void method2() {
        System.out.println("this is method2");
    }
}
