package cc.atu123.learn.patterns.mediator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 14:44
 */
public class MyMediator implements Mediator{
    private User user1;
    private User user2;

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    public void workAll() {
        user1.work();
        user2.work();
    }
}
