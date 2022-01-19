package com.leetcode.practice;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray m = new FindMinimumInRotatedSortedArray();
        int[] nums = {1,7,8};

        System.out.println("Minimum number is: "+m.findMin(nums));

    }
    public int findMin(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        if(nums[low]<nums[high])
            return nums[low];

        int lowIndex = low;
        while(low<=high){
            int min = (low+high)/2;
            //check left condition for break
            if((min-1>=0) && nums[min-1]> nums[min])
            {
                lowIndex = min;
                break;
            }
            if((min+1)<=high && nums[min+1]<nums[min]){
                lowIndex = min+1;
                break;
            }

            //if we got this far, check for left BS or right BS
            if(nums[low]<nums[min]){
                low = min+1;
            }
            else{
                high = min -1;
            }
        }
        return nums[lowIndex];
    }
}
