package cc.atu123.learn.design.composite;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/15
 * Time: 15:52
 */
public class MainRunner {
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        tree.root.add(nodeB);
        nodeB.add(nodeC);
        nodeB.add(nodeD);
    }
}
