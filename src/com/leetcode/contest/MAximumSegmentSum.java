package com.leetcode.contest;

import java.util.Arrays;

public class MAximumSegmentSum {
    public static void main(String[] args) {
        int[] nums = {1,2,5,6,1};
        int[] queries = {0,3,2,4,1};
        MAximumSegmentSum m = new MAximumSegmentSum();
        System.out.println(Arrays.toString(m.maximumSegmentSum(nums,queries)));
    }

    public long[] maximumSegmentSum(int[] nums, int[] removeQueries) {
        long[] prefixSum = new long[nums.length];
        prefixSum[0] = nums[0];
        for(int i = 1;i<nums.length;i++)
        {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        long[] rest = new long[removeQueries.length];
        for(int i = 0;i<removeQueries.length;i++)
        {

            int ind = removeQueries[i];
            for(int k = removeQueries[i];k<nums.length;k++)
            {
                prefixSum[k] -=nums[removeQueries[i]];
            }
            long lm = ind>0?prefixSum[ind-1]:0;
            long rm = ind<prefixSum.length-1?prefixSum[ind+1]:0;

            rest[i] = Math.max(lm,rm);
        }
        return rest;
    }
}
