package cc.atu123.learn.design.template;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/16
 * Time: 16:20
 */
public class MainRunner {
    public static void main(String[] args) {
        AbstractCalculator calculator = new Plus();
        int result = calculator.calculate("1+3","\\+");
        System.out.println(result);
    }
}
