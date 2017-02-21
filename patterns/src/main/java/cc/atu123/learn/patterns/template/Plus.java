package cc.atu123.learn.patterns.template;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/16
 * Time: 16:26
 */
public class Plus extends AbstractCalculator {
    @Override
    int calculate(int num1, int num2) {
        return num1+num2;
    }
}
