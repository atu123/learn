package cc.atu123.learn.patterns.command;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 15:03
 */
public class MainRunner {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new MyCommand(new MyReceiver()));
        invoker.action();
    }
}
