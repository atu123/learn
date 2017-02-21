package cc.atu123.learn.patterns.visitor;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 16:44
 */
public class MainRunner {
    public static void main(String[] args) {
        Subject subject1 = new MySubject1();
        Subject subject2 = new MySubject2();
        Visitor visitor = new MyVisitor();
        subject1.accept(visitor);
        subject2.accept(visitor);
    }
}
