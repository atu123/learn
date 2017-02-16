package cc.atu123.learn.design.strategy;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/16
 * Time: 15:57
 */
public class MainRunner {
    public static void main(String[] args) {
        Calculatorable calculator = new Plus();
        int result = calculator.calculate("8+10");
        System.out.println(result);
    }
}
