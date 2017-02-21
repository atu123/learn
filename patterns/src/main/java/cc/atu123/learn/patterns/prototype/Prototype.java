package cc.atu123.learn.patterns.prototype;

import java.util.List;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/13
 * Time: 17:33
 */
public class Prototype implements Cloneable{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private String name;
    private List<String> children;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Prototype clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }
}
