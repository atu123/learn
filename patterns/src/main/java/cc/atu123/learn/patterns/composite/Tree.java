package cc.atu123.learn.patterns.composite;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/15
 * Time: 16:34
 */
public class Tree {
    public TreeNode root;
    public Tree(String name){
        this.root = new TreeNode(name);
    }
}
