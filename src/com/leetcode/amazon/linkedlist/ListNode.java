package com.leetcode.amazon.linkedlist;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void add(int a){
        ListNode temp = next;
        if(temp == null)
        {
            next = new ListNode(a);
            return;
        }
        while (temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = new ListNode(a);
    }
}
