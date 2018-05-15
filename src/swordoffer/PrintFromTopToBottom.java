package swordoffer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList();
        if (root == null)
            return list;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            //for循环控制层数
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                list.add(t.val);
                if (t.left != null) {
                    q.add(t.left);
                }
                if (t.right != null) {
                    q.add(t.right);
                }
            }
        }
        return list;
    }

    /**
     * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     * @param root
     * @return
     */
    ArrayList<ArrayList<Integer> > Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        if (root == null)
            return list;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            //for循环控制层数
            int size = q.size();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                a.add(t.val);
                if (t.left != null) {
                    q.add(t.left);
                }
                if (t.right != null) {
                    q.add(t.right);
                }
            }
            list.add(a);
        }
        return list;
    }

    public static void main(String[] args) {
        PrintFromTopToBottom(TreeNode.getTestTree());
    }
}
