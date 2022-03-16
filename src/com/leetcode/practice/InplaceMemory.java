package com.leetcode.practice;

import java.util.*;

public class InplaceMemory {
    public static void main(String[] args) {
//        String str = "Hello world!";
//        char[] cc = str.toCharArray();
//        char[] ccc = str.toCharArray();
//
//        System.out.println(cc);
//        System.out.println(ccc);
//        StringBuilder bldr = new StringBuilder();
//        bldr.append("apple");

        Deque<String> deck = new ArrayDeque<>();
        deck.offer("apple");
        deck.offer("mango");

        Queue<String> str = new PriorityQueue<>();
        str.offer("apple");

        deck.offerFirst("tea");

    }
}
