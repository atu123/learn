package cc.atu123.learn.patterns.mediator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 14:42
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator){
        this.mediator = mediator;
    }
    public abstract void work();
}
