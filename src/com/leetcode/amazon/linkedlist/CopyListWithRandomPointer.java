package com.leetcode.amazon.linkedlist;

import java.util.HashMap;

public class CopyListWithRandomPointer {
    public static void main(String[] args) {
        CopyListWithRandomPointer c = new CopyListWithRandomPointer();

        Node n1 = new Node(1);
//        Node n = c.copyRandomList()
    }
    HashMap<Node,Node> visitedNodes = new HashMap<Node,Node>();

    public Node copyRandomList(Node head) {

        if(head == null)
            return head;

        if(this.visitedNodes.containsKey(head))
            return this.visitedNodes.get(head);

        Node node = new Node(head.val);

        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);

        return node;

    }
}
