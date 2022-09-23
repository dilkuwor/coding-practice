package com.leetcode.practice;

import com.leetcode.ListNode;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        r.reverseBetween(head,2,4);

        while (head!=null)
        {
            System.out.print(head.val);
            if(head.next!=null)
                System.out.print("->");
            head = head.next;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || m == n) return null;
        ListNode dummy = new ListNode(-1); // create a dummy node to mark the head of this list
        dummy.next = head;
        ListNode pre = dummy; // make a pointer pre as a marker for the node before reversing
        for(int i = 0; i<m-1; i++) pre = pre.next;

        ListNode tail = pre.next;

        for(int i = 0;i<n-m;i++)
        {
            ListNode temp = pre.next;
            pre.next = tail.next;
            tail.next = tail.next.next;
            pre.next.next = temp;
        }

//
//        ListNode start = pre.next; // a pointer to the beginning of a sub-list that will be reversed
//        ListNode then = start.next; // a pointer to a node that will be reversed
//
//        // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
//        // dummy-> 1 -> 2 -> 3 -> 4 -> 5
//
//        for(int i=0; i<n-m; i++)
//        {
//            start.next = then.next;
//            then.next = pre.next;
//            pre.next = then;
//            then = start.next;
//        }
//
//        // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
//        // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)

        return dummy.next;

    }
}
