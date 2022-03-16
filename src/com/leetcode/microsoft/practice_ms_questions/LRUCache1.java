package com.leetcode.microsoft.practice_ms_questions;

import java.util.HashMap;
import java.util.Map;

public class LRUCache1 {
    public static void main(String[] args) {
        LRUCache1 lRUCache = new LRUCache1(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        System.out.println(lRUCache.get(1));
        lRUCache.put(3, 3);
        System.out.println(lRUCache.get(2));
        lRUCache.put(4, 4);
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4
    }

    int[] cacheUses;
    Map<Integer,Integer> map = new HashMap<>();
    Map<Integer, Integer> counterMap = new HashMap<>();
    int counter = 0;
    public LRUCache1(int capacity) {

        cacheUses = new int[capacity];

    }

    public int get(int key) {
        if(!counterMap.containsKey(key))
            return -1;
        int tempKey = counterMap.get(key);
        cacheUses[tempKey]++;
        return map.get(tempKey);

    }

    public void put(int key, int value) {
        int minCounter = 0;
        if(counter == cacheUses.length)
        {
            int minUsed = Integer.MAX_VALUE;

            for(int i = 0;i<cacheUses.length;i++)
            {
                if(cacheUses[i]<minUsed)
                {
                    minCounter = i;
                    minUsed = cacheUses[i];
                }
            }
            cacheUses[minCounter] = 0;
        }
        else
        {
            minCounter = counter;
            counter++;
        }
        counterMap.put(minCounter,key);
        map.put(minCounter, value);

    }
}
