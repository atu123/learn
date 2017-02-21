package cc.atu123.learn.patterns.state;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 16:37
 */
public class Context {
    private Status status;
    public Context(Status status){
        this.status = status;
    }
    public void method(){
        if("method1".equals(status.getValue())){
            status.method1();
        }
        if("method2".equals(status.getValue())){
            status.method2();
        }
    }

}
