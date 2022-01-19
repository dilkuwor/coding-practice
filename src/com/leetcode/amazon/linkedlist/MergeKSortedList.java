package com.leetcode.amazon.linkedlist;

public class MergeKSortedList {
    public static void main(String[] args) {
        MergeKSortedList k = new MergeKSortedList();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(9);

        ListNode[] arr = {
                l1,l2
        };

        ListNode result = k.mergeKLists(arr);

        while (result!=null)
        {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode result = null;

        for(ListNode l:lists){
            result = this.mergeList(result,l);
        }
        return result;

    }


    public ListNode mergeList(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(-1);
        ListNode  current = dummy;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else
            {
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            }

            current = current.next;
        }

        current.next = l1!=null?l1:l2!=null?l2:null;
        return dummy.next;
    }
}
