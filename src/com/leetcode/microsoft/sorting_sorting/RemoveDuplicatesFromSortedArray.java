package com.leetcode.microsoft.sorting_sorting;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        System.out.print(r.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {

        //edge case
        if (nums.length == 0)
            return 0;

        int prev = nums[0];
        int pointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (prev == nums[i]) {

                continue;
            } else {
                pointer++;
                nums[pointer] = nums[i];
                prev = nums[i];

            }
        }


        return pointer+1;


    }
}
