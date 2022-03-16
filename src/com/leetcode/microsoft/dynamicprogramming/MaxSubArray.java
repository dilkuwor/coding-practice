package com.leetcode.microsoft.dynamicprogramming;

import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(test));
    }

    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);

        dp[0] = nums[0];
        int maxSum = dp[0];
        for(int i = 1;i<nums.length;i++)
        {
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            maxSum = Math.max(dp[i],maxSum);

        }
        return maxSum;

    }

    public static int maxSubArray2(int[] nums)
    {
//        int max_sum = nums[0];
//        int currentSum = 0;
//        for(int a: nums)
//        {
//            if(currentSum<0)
//            {
//                currentSum = 0;
//            }
//            max_sum = Math.max(max_sum,currentSum);
//        }
//
//        return  max_sum;

        int max_sum = nums[0];
        int current_sum = nums[0];
        for(int i = 1;i<nums.length;i++)
        {
            current_sum = Math.max(current_sum+nums[i],nums[i]);
            max_sum = Math.max(current_sum,max_sum);
        }
        return max_sum;
    }
}
