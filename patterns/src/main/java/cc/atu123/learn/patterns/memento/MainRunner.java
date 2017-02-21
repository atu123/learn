package cc.atu123.learn.patterns.memento;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 15:57
 */
public class MainRunner {
    public static void main(String[] args) {
        Original original = new Original("original");
        Storage storage = new Storage(original.createMemento());
        System.out.println(original.getValue());
        original.setValue("now");
        System.out.println(original.getValue());
        original.restoreMemento(storage.getMemento());
        System.out.println(original.getValue());
    }
}
