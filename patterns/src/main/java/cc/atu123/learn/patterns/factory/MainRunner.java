package cc.atu123.learn.patterns.factory;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/13
 * Time: 16:00
 */
public class MainRunner {
    public static void main(String[] args) {
        //简单工厂
        new AutomobileFactory().product("BMW");
        new AutomobileFactory().product("123");
        new AutomobileFactory().product("Aodi");

        //抽象工厂
        new AutoFactoryBMW().product();
        new AutoFactoryAodi().product();
    }
}
