package com.basics.datastructure.queue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> myQueue = new PriorityQueue<>();
        myQueue.add("Samir Kunwar");
        myQueue.add("Samir Kunwar");
        myQueue.forEach((t) ->{
            System.out.println(t);
        });
        myQueue.offer("Sunita Kunwar");
//        myQueue.forEach((t) ->{
//            System.out.println(t);
//        });

        String poll = myQueue.poll();
        System.out.println(poll);
        String str = myQueue.element();
        System.out.println(str);

        Set<String> st = new LinkedHashSet<>();


    }
}
