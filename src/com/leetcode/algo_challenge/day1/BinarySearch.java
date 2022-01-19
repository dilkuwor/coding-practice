package com.leetcode.algo_challenge.day1;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] test = {4, 5,6,7,7,8,9,12,22,444,6666};
        System.out.println(bs.search(test,22));
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        while(low<high){

            int mid = low + (high -low)/2;
            System.out.println(mid);
            System.out.println((low+high)/2);
            if(nums[mid] == target)
                return mid;
            else if( nums[mid]<target)
            {
                low = mid;
            }
            else{
                high = mid-1;
            }

        }
        return -1;
    }
}
