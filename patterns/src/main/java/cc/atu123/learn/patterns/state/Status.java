package cc.atu123.learn.patterns.state;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 16:35
 */
public class Status {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("method1");
    }

    public void method2(){
        System.out.println("method2");
    }
}
