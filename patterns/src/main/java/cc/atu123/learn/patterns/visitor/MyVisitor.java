package cc.atu123.learn.patterns.visitor;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 16:59
 */
public class MyVisitor implements Visitor {
    public void visit(Subject subject) {
        subject.Println();
    }
}
