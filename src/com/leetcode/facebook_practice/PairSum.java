package com.leetcode.facebook_practice;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1,5,3,3,3};
        int k = 6;
        System.out.println(findPairSum(arr,k));

    }

    static int findPairSum(int[] arr, int k)
    {

        int total = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++)
        {
            int complement = k - arr[i];
            if(map.containsKey(complement))
            {
                int count = map.getOrDefault(complement,0);
                total += count;

            }
            int count = map.getOrDefault(arr[i],0);
            map.put(arr[i], ++count);
        }
        return total;
    }
}
