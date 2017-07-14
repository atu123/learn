package cc.atu123.learn.jvm;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/4/7
 * Time: 11:28
 */
public class GCTest {
    public static void main(String[] args) {
        {byte [] placeholder = new byte[16*1024*1024];}
        int a = 0;
        System.gc();
    }
}
