package cc.atu123.learn.patterns.command;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 15:22
 */
public class MyCommand implements Command {
    public Receiver receiver;
    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }
    public void exce() {
        receiver.action();
    }
}
