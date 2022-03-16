package com.leetcode.microsoft.linked_list;

import com.leetcode.amazon.linkedlist.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {

        ReverseLinkedList l = new ReverseLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(8);


        ListNode tmp1 = head;
        System.out.println("Before reversing linked list...");
        while (tmp1!=null)
        {
            System.out.print(tmp1.val+"\t");
            tmp1 = tmp1.next;
        }

        System.out.println("After reversing linked list...");
        ListNode tmp = l.reverse(head);
        while (tmp!=null)
        {
            System.out.print(tmp.val+"\t");
            tmp = tmp.next;
        }

    }

    ListNode reverse(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

//        // last node or only one node
//        if(head.next == null) {
//            return head;
//        }

        ListNode newHeadNode = reverse(head.next);

        // change references for middle chain
        head.next.next = head;
        head.next = null;

        // send back new head node in every recursion
        return newHeadNode;
    }
}
