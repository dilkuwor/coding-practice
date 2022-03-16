package com.leetcode.practice;

public class RemoveElement {
    public static void main(String[] args) {
        int[] test = {3,2,2,3};
        System.out.println(removeElement(test,3));
    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;
        int j = nums.length - 1;
        int length = 0;
        for(int i = 0;i<=j;i++)
        {
            if(nums[i] == val)
            {
                nums[i] = nums[j];
                nums[j] = 0;
                j--;
                i--;
            }

            length = i;
        }
        return  length+1;
    }
}
