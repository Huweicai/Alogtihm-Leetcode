package swordoffer;

import java.util.HashSet;

/**
 * 一个链表中包含环，请找出该链表的环的入口结点。
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        HashSet<ListNode> set = new HashSet<>();
        while (pHead != null) {
            if (set.contains(pHead)) {
                return pHead;
            } else {
                set.add(pHead);
            }
            pHead = pHead.next;
        }
        return null;
    }
}
