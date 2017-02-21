package cc.atu123.learn.patterns.factory;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/13
 * Time: 15:59
 */
public class AutoFactoryAodi implements AutoFactory {
    public void product() {
        new AodiAuto().product();
    }
}
