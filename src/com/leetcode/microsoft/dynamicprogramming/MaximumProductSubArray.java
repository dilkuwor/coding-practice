package com.leetcode.microsoft.dynamicprogramming;

import java.util.Arrays;

/*
https://leetcode.com/problems/maximum-product-subarray/


//Input: nums = [2,3,-2,4]
//        Output: 6
//        Explanation: [2,3] has the largest product 6.

 */
public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] test = {2,3,-2,4};
        System.out.println(maxProduct(test));
    }
    public static int maxProduct(int[] arr) {
        // max positive product
        // ending at the current position
        int max_ending_here = arr[0];

        // min negative product ending
        // at the current position
        int min_ending_here = arr[0];

        // Initialize overall max product
        int max_so_far = arr[0];
        int n = arr.length;
        /* Traverse through the array.
        the maximum product subarray ending at an index
        will be the maximum of the element itself,
        the product of element and max product ending previously
        and the min product ending previously. */
        for (int i = 1; i < n; i++)
        {
            int temp = Math.max(arr[i], Math.max(arr[i] * max_ending_here, arr[i] * min_ending_here));
            min_ending_here = Math.min(arr[i], Math.min(arr[i] * max_ending_here, arr[i] * min_ending_here));
            max_ending_here = temp;
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}
