package cc.atu123.learn.design.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/15
 * Time: 16:18
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(){

    }

    public TreeNode(String name){
        this.name = name;
    }
    public void add(TreeNode treeNode){
        children.add(treeNode);
    }

    public void remove(TreeNode treeNode){
        children.remove(treeNode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }
}
