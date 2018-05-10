import java.util.*;
public class Question102 {
	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=true,b=false,c=true;
		System.out.println(a&b);
	}
	public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return null;
		Queue<TreeNode> q=new LinkedList<>();
        TreeNode t=root;
        q.add(t);
        while(q!=null){
        	t=q.poll();
        	System.out.println(t);
        	if(t.left!=null) 
        		q.add(t.left);
        	if(t.right!=null)
        		q.add(t.right);
        }
        return null;
    }
}	
