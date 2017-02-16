package cc.atu123.learn.design.factory;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/13
 * Time: 15:58
 */
public class AutoFactoryBMW implements AutoFactory {
    public void product() {
        new BMWAuto().product();
    }
}
