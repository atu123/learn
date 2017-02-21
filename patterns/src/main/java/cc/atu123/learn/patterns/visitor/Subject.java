package cc.atu123.learn.patterns.visitor;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 16:58
 */
public interface Subject {
    public void accept(Visitor visitor);
    public void Println();
}
