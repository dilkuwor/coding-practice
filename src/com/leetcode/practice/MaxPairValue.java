package com.leetcode.practice;

import java.util.*;

public class MaxPairValue {
    public static void main(String[] args) {
        MaxPairValue m = new MaxPairValue();
        int[] arr = new int[(int)Math.pow(10,4)];
        for(int i = 0;i<Math.pow(10,4);i++)
        {
            arr[i] = i%2 == 0? (int)Math.pow(10,9):343;
        }

        System.out.println(m.maximumSum(arr));
    }
    int findSum(int a)
    {
        int sum = 0;
        int t = a;
        if(m.containsKey(t))
        {
            sum = m.get(t);
        }
        else{
            while(t>0)
            {
                sum +=t%10;
                t /=10;
                if(m.containsKey(t))
                {
                    sum +=m.get(t);
                    break;
                }
            }
            m.put(a,sum);
        }
        return sum;
    }
    Map<Integer, Integer> m = new HashMap<>();
    public int maximumSum(int[] nums) {

        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i = nums.length-1;i>0;i--)
        {
            int sum = findSum(nums[i]);
            for(int j = i-1;j>=0;j--)
            {
                int sumSecond = findSum(nums[j]);
                if(sum == sumSecond)
                {
                    max = Math.max(max, nums[i]+nums[j]);
                    break;
                }
            }
        }

        return max == Integer.MIN_VALUE?-1:max;

    }
}
