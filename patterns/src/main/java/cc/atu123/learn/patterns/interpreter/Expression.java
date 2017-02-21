package cc.atu123.learn.patterns.interpreter;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/21
 * Time: 15:25
 */
public interface Expression {
    public int interpret(Context context);
}
