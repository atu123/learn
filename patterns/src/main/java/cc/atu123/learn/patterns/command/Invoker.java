package cc.atu123.learn.patterns.command;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 15:24
 */
public class Invoker {
    private Command command ;
    public Invoker(Command command){
        this.command = command;
    }
    public void action(){
        command.exce();
    }

}
