package com.leetcode.amazon.linkedlist;

import java.util.List;

public class AddTwoNumber {
    public static void main(String[] args) {
        AddTwoNumber a = new AddTwoNumber();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode re = a.addTwoNumbers(l1,l2);
        while (re!=null){
            System.out.print(re.val);
            re = re.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;


            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
        }
        if(carry>0)
            curr.next = new ListNode(carry);
        return dummyHead.next;
    }
}

