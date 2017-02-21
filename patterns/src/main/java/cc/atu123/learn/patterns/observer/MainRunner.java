package cc.atu123.learn.patterns.observer;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/16
 * Time: 18:18
 */
public class MainRunner {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();
        mySubject.add(new Observer1());
        mySubject.add(new Observer2());
        mySubject.add(new Observer2());
        mySubject.add(new Observer2());
        mySubject.operate();
    }
}
