package swordoffer;

public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

    public static TreeNode getTestTree(){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left =left;
        left.left =  new TreeNode(4);
        left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        return root;
    }
}
