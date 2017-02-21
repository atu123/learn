package cc.atu123.learn.patterns.mediator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 14:45
 */
public class User1 extends User {
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exec");
    }
}
