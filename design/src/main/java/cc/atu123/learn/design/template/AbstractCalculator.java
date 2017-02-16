package cc.atu123.learn.design.template;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/16
 * Time: 16:22
 */
public abstract class AbstractCalculator {
    public final int calculate(String exp,String opt){
        String [] nums = exp.split(opt);
        return calculate(Integer.parseInt(nums[0]),Integer.parseInt(nums[1]));
    }
    abstract int calculate(int num1,int num2);

}
