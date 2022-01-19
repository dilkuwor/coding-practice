package com.ds.sorting.queue;

public interface Queue {
    void enqueue(int a);
    int dequeue();
    int peek();
    boolean isEmpty();
    boolean isFull();
    int size();
}
