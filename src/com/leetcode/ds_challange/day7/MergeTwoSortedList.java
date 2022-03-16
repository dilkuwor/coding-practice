package com.leetcode.ds_challange.day7;

import com.leetcode.amazon.linkedlist.ListNode;

public class MergeTwoSortedList {
    public static void main(String[] args) {

        MergeTwoSortedList t = new MergeTwoSortedList();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(3);

        ListNode r = t.mergeTwoLists(l1,l2);
        while(r!=null)
        {
            System.out.println(r.val);
            r = r.next;
        }

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode(-1);

        ListNode temp = result;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        temp.next = list1!=null?list1:list2!=null?list2:null;
        return result.next;

    }
}
