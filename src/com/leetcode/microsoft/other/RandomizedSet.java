package com.leetcode.microsoft.other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

class RandomizedSet {
    public static void main(String[] args) {
        RandomizedSet r = new RandomizedSet();
    }
    private HashMap<Integer,Integer> ds;

    public RandomizedSet() {
        ds = new HashMap<>();
    }

    public boolean insert(int val) {
        int count = ds.getOrDefault(val,0);
        ds.put(val,count+1);
        return count == 0;

    }

    public boolean remove(int val) {

        if(ds.containsKey(val))
        {
            int count = ds.getOrDefault(val,0);
            ds.put(val,--count);
            if(count==0)
            {
                ds.remove(val);
            }
            return true;
        }

        return false;
    }

    public int getRandom() {
        int size = ds.size();
        Random r = new Random();
        int random = r.nextInt(size - 0 + 1) + 0;
        int count = 0;
        for(int key:ds.keySet())
        {
            if(random == count)
            {
                return key;
            }
            count++;

        }
        return 0;
    }
}
