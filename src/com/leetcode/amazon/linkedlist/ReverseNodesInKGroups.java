package com.leetcode.amazon.linkedlist;

import org.w3c.dom.NodeList;

import java.util.Stack;

public class ReverseNodesInKGroups {
    public static void main(String[] args) {

        ReverseNodesInKGroups r = new ReverseNodesInKGroups();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);


        ListNode re = r.g(l1,2);
        while (re!=null){
            System.out.print(re.val);
            re = re.next;
        }

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode ptr = head;
        while(count<k && ptr!=null){
            //skip the nodes tht will be reversed
            ptr = ptr.next;
            count++;
        }

        if(count == k){
            ListNode reversedHead = this.reverseNode(head,k);
            head.next = this.reverseKGroup(ptr,k);
            return reversedHead;
        }
        return head;

    }

    public ListNode g(ListNode head,int k){


        ListNode ptr = head;

        ListNode new_head = null;

        ListNode tail = null;
        while(ptr!=null){
            int count = 0;

            while(count<k && ptr!=null){
                //skip the nodes tht will be reversed
                ptr = ptr.next;
                count++;
            }


            if(count == k){

                ListNode reversedHead = this.reverseNode(head,k);
                if(new_head==null)
                    new_head = reversedHead;

                else if(tail!=null){
                    tail.next = reversedHead;
                }

                tail = head;
                head = ptr;

            }
          if(tail!=null){
              tail.next = head;
          }

        }


        return new_head !=null?new_head:head;
    }



//this will reverse linked list

    ListNode reverseNode(ListNode head,int k){
        ListNode current = head;
        ListNode prev = null;
        ListNode following = head;

        while(k>0){
            following = following.next;
            current.next = prev;
            prev = current;
            current = following;
            k--;
        }
        return prev;
    }
    public ListNode reverseNode1(ListNode head){
        ListNode following = head;
        ListNode current = head;
        ListNode prev = null;
        while (current!=null){
            following = following.next;
            current.next = prev;
            prev = current;
            current = following;
        }
        return prev;
    }
}
