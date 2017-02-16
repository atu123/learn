package cc.atu123.learn.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/13
 * Time: 17:33
 */
public class MainRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        String child1 = "123";
        System.out.println("child1:"+child1.hashCode());
        Prototype p1 = new Prototype();
        List children = new ArrayList<String>();
        children.add(child1);
        child1 = "234";
        System.out.println("child1:"+child1.hashCode());
        p1.setName("王一");
        p1.setAge(5);
        p1.setChildren(children);
        Prototype p2 = p1.clone();
        System.out.println(children.hashCode());
        System.out.println(children.hashCode());
        children.add("456");
        System.out.println(p1.hashCode()+" p1:"+p1.getName());
        System.out.println(p1.hashCode()+" p1:"+p1.getChildren());
        System.out.println(p1.hashCode()+" p1:"+p1.getChildren().hashCode());
        System.out.println(p2.hashCode()+" p2:"+p2.getName());
        System.out.println(p2.hashCode()+" p2:"+p2.getChildren());
        System.out.println(p2.hashCode()+" p2:"+p2.getChildren().hashCode());
        System.out.println(p1.getAge()==p2.getAge());
    }
}
