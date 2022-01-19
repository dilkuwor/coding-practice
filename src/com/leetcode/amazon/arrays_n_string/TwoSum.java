package com.leetcode.amazon.arrays_n_string;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = {-3,4,3,90};
        TwoSum ts = new TwoSum();
        int target = 0;
        System.out.println("Answer for target "+target+ " is "+ Arrays.toString(ts.twoSum1(input,target)));
    }

    //non optimal solution
    public int[] twoSum(int[] nums, int target){
        //this is worst case solution with O(n2)
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target)
                    return new int[]{i,j};
            }
        }
        return null;
    }

    public int[] twoSum1(int[] nums, int target){
        HashMap<Integer, Integer> indexs = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int complement = target-nums[i];
            if(indexs.containsKey(complement)){
                return new int[]{indexs.get(complement),i};
            }
            else{
                indexs.put(nums[i],i);
            }
        }
        return null;
    }

    int getComplement(int number, int target){
        return Math.abs(number - target);
    }
}
