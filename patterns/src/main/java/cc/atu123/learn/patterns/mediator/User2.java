package cc.atu123.learn.patterns.mediator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 14:46
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exce");
    }
}
