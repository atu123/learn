package cc.atu123.learn.patterns.mediator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 11:58
 */
public class MainRunner {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
