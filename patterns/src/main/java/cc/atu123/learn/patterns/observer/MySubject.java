package cc.atu123.learn.patterns.observer;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/16
 * Time: 18:17
 */
public class MySubject extends AbstractSubject {
    public void operate() {
        System.out.println("update self");
        notifyObservers();
    }
}
