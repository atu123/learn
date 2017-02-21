package cc.atu123.learn.patterns.bridge;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/15
 * Time: 15:36
 */
public abstract class Bridge {
    private Sourceable source;
    public void method(){
        source.method();
    }
    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
