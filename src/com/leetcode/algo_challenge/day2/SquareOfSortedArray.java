package com.leetcode.algo_challenge.day2;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        SquareOfSortedArray s = new SquareOfSortedArray();
        int[] test = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(s.sortedSquares(test)));
    }

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int j = 0;
        int[] ans = new int[n];
        int c = n-1;
        int i = n-1;
        while(j<=i){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[c] = nums[i] * nums[i];
                i--;
            }
            else{
                ans[c] = nums[j] * nums[j];
                j++;
            }
            c--;
        }

        return ans;
    }
}
