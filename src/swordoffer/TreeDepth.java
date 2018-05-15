package swordoffer;

/**
 * 求二叉树高度
 * depth = Max(left.depth , right.depth) +1
 */
public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root == null ) {
            return 0;
        }
        return Math.max(TreeDepth(root.left) , TreeDepth(root.right)) +1;
    }
}
