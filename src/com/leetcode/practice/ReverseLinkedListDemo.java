package com.leetcode.practice;

import com.leetcode.ListNode;

/**
 * 1->2->4->5->NULL
 * NULL<-1<-2<-4<-5
 */
public class ReverseLinkedListDemo {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        ListNode next1 = new ListNode(2);
        head.next = next1;
        ListNode next2 = new ListNode(4);
        next1.next = next2;
        ListNode next3 = new ListNode(5);
        next2.next = next3;
        System.out.println(head.toString());

        ReverseLinkedListDemo d = new ReverseLinkedListDemo();
        ListNode reversed = d.reverseList1(head);
        System.out.println("Reversed :"+ reversed.toString());
    }

    public ListNode reverseList(ListNode head){
        ListNode previous = null;

        //1->2->3->NULL
        //NULL<-1<-2<-3

        while(head!=null){
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;

        }

        while (head!=null){
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }

    public ListNode reverseList1(ListNode head){
        ListNode next = null;
        //NULL<-1<-2<-4<-5
        while (head!=null){
            ListNode rNext = head.next;
            head.next = next;

            next = head;
            head = rNext;
        }
        return next;
    }
}

