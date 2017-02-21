package cc.atu123.learn.patterns.interpreter;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 15:20
 */
public class MainRunner {
    public static void main(String[] args) {
        //计算2+8-6
        int result = new Minus().interpret(new Context(new Plus().interpret(new Context(2,8)),6));
        System.out.println(result);
    }
}
