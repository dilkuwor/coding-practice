package com.leetcode.amazon.arrays_n_string;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf ps = new ProductOfArrayExceptSelf();
        int[] input = {1,2,3,4};
        int[] ans = ps.bruteForce(input);
        System.out.println(Arrays.toString(ans));
    }

    //without using extra space n(1)
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;
        for(int i = 1;i<nums.length;i++){
            result[i] = result[i-1] * nums[i];
        }

        int right = 1;
        for(int i = nums.length-2;i>=0;i--){
            result[i] = right * result[i+1];
            right = result[i];
        }
        return result;
    }
    public int[] productExceptSelf1(int[] nums) {
        int[] answer = new int[nums.length];
        int[] L = new int[nums.length];
        int[] R = new int[nums.length];
        //calculate product of left array
        L[0] = 1;
        for(int i = 1;i<nums.length;i++){
            L[i] = L[i-1] * nums[i-1];
        }

        //calculate product of right array
        R[nums.length-1] = 1;
        for(int i = nums.length-2;i>=0;i--){
            R[i] = nums[i+1] * R[i+1];
        }
        //calculate answer array

        for(int i = 0;i<nums.length;i++){
            answer[i] = L[i] * R[i];
        }
        return answer;
    }

    public int[] productExceptSelfMy(int[] nums) {
        int total = 1;
        for(int i =0;i<nums.length;i++){
            total *=nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = total/nums[i];
        }
        return nums;
    }

    public int[] bruteForce(int[] nums){
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            result[i] = 1;
           for(int j = 0;j<nums.length;j++){
               if(j != i){
                   result[i] = result[i] * nums[j];
               }
           }
        }
        return result;
    }
}
