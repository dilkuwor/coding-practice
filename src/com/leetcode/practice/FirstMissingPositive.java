//package com.leetcode.practice;
//
//public class FirstMissingPositive {
//    public static void main(String[] args) {
//        FirstMissingPositive f = new FirstMissingPositive();
//    }
//
//    public int firstMissingPositive(int[] nums) {
//        int lowMissing = Integer.MAX_VALUE;
//        int highMissing = Integer.MIN_VALUE;
//        int count = 0;
//        for(int i =0;i<nums.length;i++)
//        {
//            count = i;
//            if(nums[i]>0){
//                int tLow = nums[i] - 1;
//                if(tLow>0 && tLow<lowMissing && nums[i]!=lowMissing){
//                    lowMissing = tLow;
//                }
//                int high = nums[i] + 1;
//                highMissing =
//
//            }
//        }
//        return -1;
//    }
//}
