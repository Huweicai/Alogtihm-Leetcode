public class Question83 {
	
	
	 public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	  }
	 
	public static void main(String[] args) {
		ListNode test=new ListNode(1);
		test.next=new ListNode(2);
		test.next.next=new ListNode(2);
		test.next.next.next=new ListNode(2);
		test=deleteDuplicates(test);
		while(test!=null) {
			System.out.println(test.val);
			test=test.next;
		}
	}
	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null) return null;
		java.util.Map<Integer,String> set=new java.util.HashMap<Integer,String>();
		ListNode temp=head;
		set.put(temp.val, "k");
		while(temp!=null&&temp.next!=null) {
			ListNode next=temp.next;
			//如果已经存在，即冗余
			if(set.get(next.val)!=null) {
				temp.next=next.next;
			}else {
				set.put(next.val,"k");
				temp=temp.next;
			}
			
		}
		return head;
    }

}
