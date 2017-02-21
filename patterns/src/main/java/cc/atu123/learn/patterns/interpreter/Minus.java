package cc.atu123.learn.patterns.interpreter;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 15:26
 */
public class Minus implements Expression {
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
