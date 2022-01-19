package com.leetcode.practice;


import java.util.LinkedList;
import java.util.List;

public class NaryTreePostorderTraversalDemo {
    public static void main(String[] args) {

    }

    public List<Integer> postorder(Node root){
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if(root  == null){
            return output;
        }

        stack.add(root);
        while(!stack.isEmpty()){
            Node n = stack.pollLast();
            output.addFirst(n.val);
            for(Node child: n.children){
                stack.add(child);
            }
        }

        return output;
    }
}
class Node{
    public int val;
    public List<Node> children;
    public Node(){}
    public Node(int _val, List<Node> _children){
        this.val = _val;
        this.children = _children;
    }
}
