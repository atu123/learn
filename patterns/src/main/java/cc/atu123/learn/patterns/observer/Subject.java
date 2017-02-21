package cc.atu123.learn.patterns.observer;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/16
 * Time: 18:08
 */
public interface Subject {
    public void add(Observer observer);
    public void delete(Observer observer);
    public void notifyObservers();
    public void operate();
}
