package com.basics.datastructure.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList llist = new LinkedList();
        llist.add("abc");
        System.out.println(llist);
        llist.set(1,"werw");
        System.out.println(llist);
    }
}
