package cc.atu123.learn.patterns.command;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 15:26
 */
public class MyReceiver implements Receiver {
    public void action(){
        System.out.println("MyReceiver command is actioned!!");
    }
}
