package com.general.practice;

public class MyTree {
    Node root;

    public void insert(int a){
        Node data = getNode(a);
        if(root == null){
            root = data;
        }
        else{

        }
    }

    private Node getNode(int value){
        return new Node(value);
    }
}

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}
