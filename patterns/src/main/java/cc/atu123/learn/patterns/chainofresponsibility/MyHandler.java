package cc.atu123.learn.patterns.chainofresponsibility;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 14:58
 */
public class MyHandler extends AbstractHandler implements Handler  {
    private String name;
    public  MyHandler(String name){
        this.name = name;
    }
    public void operate() {
        System.out.println(name);
        if(getHandler()!=null){
            getHandler().operate();
        }
    }
}
