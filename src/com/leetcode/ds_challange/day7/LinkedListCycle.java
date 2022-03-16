package com.leetcode.ds_challange.day7;

import com.leetcode.amazon.linkedlist.ListNode;

public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedListCycle l = new LinkedListCycle();

        ListNode n = new ListNode(3);
//        n.next = new ListNode(2);
//        n.next.next = new ListNode(0);
//        n.next.next.next = new ListNode(-4);
        //n.next.next.next.next = n.next;

        System.out.println(l.hasCycle(n));

    }
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;

        ListNode fast = head;

        while(fast !=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}
