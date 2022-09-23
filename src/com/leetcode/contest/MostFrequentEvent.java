package com.leetcode.contest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MostFrequentEvent {
    public static void main(String[] args) {
        MostFrequentEvent mf = new MostFrequentEvent();
        int[] arr = {29,47,21,41,13,37,25,7};
        System.out.println(mf.mostFrequentEven(arr));
    }

    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int max = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        for(int a: nums)
        {
            if(a%2 == 0)
            {
                map.put(a,map.getOrDefault(a,0)+1);
                max = Math.max(map.get(a),max);
            }
        }
        if(map.size() == 0)
            return -1;
        for(int a: map.keySet())
        {
            if(map.get(a) == max)
                return a;
        }
        return -1;

    }
}
