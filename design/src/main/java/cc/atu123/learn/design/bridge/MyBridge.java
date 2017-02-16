package cc.atu123.learn.design.bridge;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/15
 * Time: 15:36
 */
public class MyBridge extends Bridge{
    public void method(){
        getSource().method();
    }
}
