package cc.atu123.learn.patterns.chainofresponsibility;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 14:57
 */
public class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
