package com.leetcode.review;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RTwoSum {
    public static void main(String[] args) {
        int[] input = {-3,4,3,90};
        RTwoSum ts = new RTwoSum();
        int target = 0;
        System.out.println("Answer for target "+target+ " is "+ Arrays.toString(ts.twoSum(input,target)));
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> complements = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int c = target - nums[i];
            if(complements.containsKey(c)){
                return new int[]{complements.get(c),i};
            }
            else{
                complements.put(nums[i],i);
            }
        }
        return null;

    }
}
