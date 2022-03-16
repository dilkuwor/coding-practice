package com.leetcode.ds_challange.day7;

import com.leetcode.amazon.linkedlist.ListNode;

public class RemoveLinkedListElement {
    public static void main(String[] args) {
        RemoveLinkedListElement r = new RemoveLinkedListElement();
        ListNode n = new ListNode(1);
        n.add(2);
        n.add(6);
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(6);

        ListNode t = r.removeElements(n,6);
        while (t!=null)
        {
            System.out.println(t.val);
            t = t.next;
        }

    }

    public ListNode removeElements(ListNode head, int val) {
        return null;

    }

}
