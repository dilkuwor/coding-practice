package com.leetcode.microsoft.sorting_sorting;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        for(int i = 0;i<5;++i)
        {
            System.out.println(i);
        }

        for(int i = 0;i<5;i++)
        {
            System.out.println(i);
        }

    }

    public int findMin(int[] nums) {

        if(nums[0]<nums[nums.length-1])
            return nums[0];
        int low = 0;
        int high = nums.length - 1;

        while(low<=high)
        {
            int mid = low + (high -low)/2;
            if(nums[mid]>nums[mid+1])
                return nums[mid+1];
            if(nums[mid-1]>nums[mid])
                return nums[mid];

            if(nums[mid]>nums[0])
                low = mid+1;
            else
                high = mid -1;
        }
        return -1;
    }
}
