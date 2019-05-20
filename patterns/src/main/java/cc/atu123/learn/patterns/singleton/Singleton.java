package cc.atu123.learn.patterns.singleton;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/13
 * Time: 11:02
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}
    public static  Singleton getInstance(){
        if(instance==null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
                return instance;
            }
        }
        return instance;
    }

    class Inner{
        public  void main(String[] args) {
            new Singleton();
        }
    }
}


