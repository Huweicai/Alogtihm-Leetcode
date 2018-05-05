package swordoffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


public class PrintListReverse3 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList list = new ArrayList();
        if (listNode == null) {
            return list;
        }
        Deque stack = new LinkedList<ListNode>();
        while (listNode.next != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ListNode t;
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode t = new ListNode(1);
        t.next = new ListNode(2).next = new ListNode(3).next = new ListNode(4);
        System.out.println(printListFromTailToHead(t));
    }

}
