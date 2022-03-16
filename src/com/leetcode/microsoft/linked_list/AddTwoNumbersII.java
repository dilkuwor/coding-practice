package com.leetcode.microsoft.linked_list;

import com.leetcode.amazon.linkedlist.ListNode;
import com.leetcode.amazon.treesandgraph.TreeNode;

public class AddTwoNumbersII {
    public static void main(String[] args) {
        ListNode n = new ListNode(1);
//        n.next = new ListNode(2);
//        n.next.next = new ListNode(4);
//        n.next.next.next = new ListNode(3);

        ListNode s = new ListNode(9);
        s.next = new ListNode(9);
//        s.next = new ListNode(6);
//        s.next.next = new ListNode(4);
        AddTwoNumbersII a = new AddTwoNumbersII();

        ListNode result = a.addTwoNumbers(n,s);
        while(result!=null)
        {
            System.out.println(result.val);
            result = result.next;
        }


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        else if (l2 == null)
            return l1;
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode result = new ListNode(-1);
        int carryOver = 0;
        while (l1!=null || l2 !=null)
        {
            int total = (l1!=null?l1.val:0) + (l2!=null?l2.val:0) + carryOver;
            int sum = (total%10);
            carryOver = total/10;

            ListNode n = new ListNode(sum);
            ListNode temp = result.next;
            n.next = temp;
            result.next = n;
            l1 = l1!=null?l1.next:l1;
            l2 = l2!=null?l2.next:l2;

        }
        if(l1== null && l2 == null && carryOver>0)
        {
            ListNode n = new ListNode(carryOver);
            ListNode temp = result.next;
            n.next = temp;
            result.next = n;
        }
        return result.next;
    }

    ListNode reverse(ListNode head)
    {
        ListNode current = head;
        ListNode prev = null;
        ListNode following = head;
        while(current!=null)
        {
            following = following.next;
            current.next = prev;
            prev = current;
            current = following;
        }
        return prev;
    }
}
