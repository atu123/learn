package cc.atu123.learn.patterns.memento;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 16:06
 */
public class Memento {
    private String value;
    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
