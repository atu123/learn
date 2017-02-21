package cc.atu123.learn.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/17
 * Time: 10:50
 */
public class MainRunner {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        Iterator<String> iterator = strings.iterator();

        MyArrayList<String> stringMyArrayList = new MyArrayList<String>();
        System.out.println(stringMyArrayList.size());
        cc.atu123.learn.patterns.iterator.Iterator iterator1 = stringMyArrayList.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
