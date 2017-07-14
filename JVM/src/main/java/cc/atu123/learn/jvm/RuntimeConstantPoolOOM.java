package cc.atu123.learn.jvm;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/3/29
 * Time: 15:23
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        // String str3 = new StringBuilder("wanglichong").toString();
        String str2 = new StringBuilder("wanglichong").toString();
        System.out.println(str2);
        System.out.println(str2.intern() == str2);

        String str1 = new StringBuilder("计算机").append("软件12321").toString();
        System.out.println(str1.intern() == str1);
        System.out.println(str1.intern() == str1);

    }
}
