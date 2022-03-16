package com.leetcode.algo_challenge.day5;

import com.leetcode.amazon.linkedlist.ListNode;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        MiddleOfTheLinkedList m = new MiddleOfTheLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.print(m.middleNode(head).val);
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null)
        {
            fast = fast.next!=null?fast.next.next:null;
            slow = slow.next;
        }
        return slow;

    }
}
