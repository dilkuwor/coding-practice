package com.leetcode.practice;

import java.util.List;

public class PalindromeLinkedListDemo {
    public static void main(String[] args) {
        PalindromeLinkedListDemo d = new PalindromeLinkedListDemo();
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        head.next = next1;
        ListNode next2 = new ListNode(9);
        next1.next = next2;
        ListNode next3 = new ListNode(3);
        next2.next = next3;

        System.out.println(d.isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head){

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reversed(slow);
        fast = head;
        while(slow!=null){
            if(slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    ListNode reversed(ListNode head){

        //1->2->3->NULL
        //NULL<-1<-2<-3
        ListNode previous = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return  previous;
    }

}


