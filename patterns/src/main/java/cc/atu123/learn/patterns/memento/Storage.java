package cc.atu123.learn.patterns.memento;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 16:07
 */
public class Storage {
    private Memento memento;
    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
