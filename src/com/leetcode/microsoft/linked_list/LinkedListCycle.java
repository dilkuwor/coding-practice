package com.leetcode.microsoft.linked_list;

import com.leetcode.amazon.linkedlist.ListNode;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        //head.next = head.next.next;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;

        }
        return false;
    }
}
