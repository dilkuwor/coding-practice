package com.leetcode.practice;

import java.util.TreeMap;

public class TreeMapExample {
    TreeMap<Integer, Integer> calendar = new TreeMap<>();

    public static void main(String[] args) {

    }

    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start),
                next = calendar.ceilingKey(start);
        if ((prev == null || calendar.get(prev) <= start) &&
                (next == null || end <= next)) {
            calendar.put(start, end);
            return true;
        }
        return false;
    }
}
