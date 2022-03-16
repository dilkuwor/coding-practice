package com.leetcode.microsoft.linked_list;

import com.leetcode.amazon.linkedlist.ListNode;
import com.leetcode.amazon.linkedlist.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {
        IntersectionOfTwoLinkedList l = new IntersectionOfTwoLinkedList();
        ListNode node = new ListNode(4);
        node.next = new ListNode(1);
        node.next.next = new ListNode(8);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);


        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(1);
        node2.next.next.next = node.next.next;
//        l.backTrackPrint(node);
//        l.stackPrint(node);

        //ListNode r = l.reverseLinkedList(node2);
        ListNode inter = l.getIntersectionNode(node,node2);
        System.out.println(inter.val);


    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp!=null)
        {
            visited.add(temp);
            temp = temp.next;
        }

        ListNode temp2 = headB;
        while (temp2!=null)
        {
            if(!visited.add(temp2))
            {
                return temp2;
            }

            temp2 = temp2.next;
        }

        return null;
    }

    void backTrackPrint(ListNode node)
    {
        if(node == null)
            return;
        else
            backTrackPrint(node.next);
        System.out.println(node.val);
    }

    void stackPrint(ListNode node)
    {
        System.out.println("Printing value using stack");
        Stack<ListNode> myStack = new Stack<>();
        ListNode tmp = node;
        while (tmp!=null)
        {
            myStack.push(tmp);
            tmp = tmp.next;
        }

        while (!myStack.isEmpty())
        {
            ListNode n = myStack.pop();
            System.out.println(n.val);
        }
    }

    ListNode reverseLinkedList(ListNode head)
    {
        ListNode prev = null;
        ListNode current = head;
        ListNode follower = head;
        while (current!=null)
        {
            follower = follower.next;
            current.next = prev;
            prev = current;
            current = follower;
        }
        return prev;
    }
}
