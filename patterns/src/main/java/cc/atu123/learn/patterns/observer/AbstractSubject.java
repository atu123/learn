package cc.atu123.learn.patterns.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/16
 * Time: 18:14
 */
public abstract class AbstractSubject implements Subject {
    Vector<Observer> observers = new Vector<Observer>();
    public void add(Observer observer) {
        observers.add(observer);
    }

    public void delete(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Enumeration<Observer> elements = observers.elements();
        while (elements.hasMoreElements()){
            elements.nextElement().update();
        }
    }
}
