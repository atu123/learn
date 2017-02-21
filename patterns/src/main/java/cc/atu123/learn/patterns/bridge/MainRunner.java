package cc.atu123.learn.patterns.bridge;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/15
 * Time: 15:34
 */
public class MainRunner {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        Sourceable source1 = new Source1();
        Sourceable source2 = new Source2();

        bridge.setSource(source1);
        bridge.method();

        bridge.setSource(source2);
        bridge.method();
    }
}
