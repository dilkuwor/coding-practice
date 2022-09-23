package com.leetcode.practice;

import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class NumberOfExcellentPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        NumberOfExcellentPairs ep = new NumberOfExcellentPairs();
        ep.helper(arr);

        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>(map);
    }

    void helper(int[] nums)
    {
        for(int i = 0;i<nums.length;i++)
        {
            for(int j = 0;j<nums.length;j++)
            {
                System.out.println("("+nums[i]+","+nums[j]+")");
            }
        }
    }
    public long countExcellentPairs(int[] nums, int k) {
        return -1;
    }
}
