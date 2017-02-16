package cc.atu123.learn.design.singleton;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/13
 * Time: 14:44
 */
public class Singleton2 {
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        return StaticInstance.instance;
    }

    private static class StaticInstance{
        private static Singleton2 instance = new Singleton2();
    }
}
