package com.leetcode.microsoft.practice_ms_questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer, Integer> {
//    public static void main(String[] args) {
//        LRUCache lRUCache = new LRUCache(2);
//        lRUCache.put(1, 1);
//        lRUCache.put(2, 2);
//        System.out.println(lRUCache.get(1));
//        lRUCache.put(3, 3);
//        System.out.println(lRUCache.get(2));
//        lRUCache.put(4, 4);
//        lRUCache.get(1);    // return -1 (not found)
//        lRUCache.get(3);    // return 3
//        lRUCache.get(4);    // return 4
//    }
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, - 1);
    }

    public void put(int key, int value) {
        super.put(key,value);
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
