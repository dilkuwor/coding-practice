package com.brain;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(23);
        queue.add(1);
        queue.add(454);
        queue.add(-34);

        queue.forEach((k) ->{
            System.out.println(k);
        });
    }
}
