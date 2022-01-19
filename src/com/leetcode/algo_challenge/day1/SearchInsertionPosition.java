package com.leetcode.algo_challenge.day1;

public class SearchInsertionPosition {
    public static void main(String[] args) {
        SearchInsertionPosition ip = new SearchInsertionPosition();
        int[] test = {1};
        System.out.println(ip.searchInsert(test,1));
    }

    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low<high){

            int mid = low + (high - low)/2;

            if(nums[mid] == target)
                return mid;

            if(target>nums[mid])
                low = mid+1;
            else{
                high = mid;
            }
        }
        return low>nums.length-1?low+1:high<0?high-1:high;

    }
}
