package cc.atu123.learn.design.strategy;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/16
 * Time: 16:12
 */
public abstract class AbstractCalculator {
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
