package cc.atu123.learn.patterns.state;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 16:35
 */
public class MainRunner {
    public static void main(String[] args) {
        Status status = new Status();
        Context context = new Context(status);
        status.setValue("method2");
        context.method();
        status.setValue("method1");
        context.method();
    }
}
