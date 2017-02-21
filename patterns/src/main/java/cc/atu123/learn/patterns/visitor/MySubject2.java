package cc.atu123.learn.patterns.visitor;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 11:02
 */
public class MySubject2 implements Subject {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void Println(){
        System.out.println("this is MySubject2");
    }
}
