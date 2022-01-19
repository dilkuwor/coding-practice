package com.leetcode.ds_challange;

import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        MaximumSubArray sa = new MaximumSubArray();
        int[] arr = {-1,-2};
        System.out.println(sa.maxSubArray(arr));
    }

    public int maxSubArray(int[] nums) {
        int max_current = nums[0];
        int max_global = nums[0];

        for(int i =0;i<nums.length;i++){

            max_current = Math.max(nums[i],nums[i]+max_current);
            max_global = Math.max(max_global,max_current);

        }
        return max_global;

    }

}
