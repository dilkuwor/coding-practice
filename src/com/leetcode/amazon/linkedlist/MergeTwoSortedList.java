package com.leetcode.amazon.linkedlist;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(6  );

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);

        MergeTwoSortedList a = new MergeTwoSortedList();
        ListNode re = a.mergeTwoLists(l1,l2);
        ListNode abc = re;
        while (re!=null){
            System.out.print(re.val);
            re = re.next;
        }

        abc = a.reverseNode(abc);
        System.out.println("------");
        while (abc!=null){
            System.out.print(abc.val);
            abc = abc.next;
        }

    }

    //merge sorted linked list with recursive approach
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else{
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = list1!=null?list1:list2!=null?list2:null;
        return dummy.next;

    }

    public ListNode reverseNode(ListNode node){
        ListNode current = node;
        ListNode following = node;
        ListNode prev = null;

        while (current!=null)
        {
            following = following.next;
            current.next = prev;
            prev = current;
            current = following;
        }
        return prev;
    }
    public ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {

        if(list1==null)
            return list2;
        else if (list2 == null)
            return list1;
        else if (list1.val<list2.val)
        {
            list1.next = mergeTwoListsRecursive(list1.next,list2);
            return list1;
        }
        else
        {
            list2.next = mergeTwoListsRecursive(list1,list2.next);
            return list2;
        }

    }
}
