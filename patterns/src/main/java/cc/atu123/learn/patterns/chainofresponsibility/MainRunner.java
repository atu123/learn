package cc.atu123.learn.patterns.chainofresponsibility;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 14:54
 */
public class MainRunner {
    public static void main(String[] args) {
        MyHandler handler1 = new MyHandler("handler1");
        MyHandler handler2 = new MyHandler("handler2");
        MyHandler handler3 = new MyHandler("handler3");
        MyHandler handler4 = new MyHandler("handler4");
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler3.setHandler(handler4);
        handler1.operate();
    }
}
