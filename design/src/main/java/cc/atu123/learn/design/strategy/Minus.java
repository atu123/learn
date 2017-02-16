package cc.atu123.learn.design.strategy;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/16
 * Time: 16:14
 */
public class Minus extends AbstractCalculator implements Calculatorable {
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}
