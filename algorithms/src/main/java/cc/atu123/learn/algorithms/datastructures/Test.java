package cc.atu123.learn.algorithms.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.remove(1);
        list.remove(1);
        System.out.println(list.size());
    }
}
