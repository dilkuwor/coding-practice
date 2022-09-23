package com.leetcode.contest;

import java.util.Arrays;

public class MakeArrayZero {
    public static void main(String[] args) {
        int[] arr = {0};
        MakeArrayZero m = new MakeArrayZero();
        System.out.println(m.minimumOperations(arr));
    }

    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int steps = 0;
        int subtract = 0;
        for(int i = 0;i<nums.length;i++)
        {
            int temp = nums[i] - subtract;
            if(temp>0)
            {
                steps++;
                subtract +=temp;
            }
        }
        return steps;

    }
}
