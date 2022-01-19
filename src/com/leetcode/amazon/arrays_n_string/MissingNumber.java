package com.leetcode.amazon.arrays_n_string;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] test = {3,4,1,0};
        System.out.println(mn.missingNumberXOR(test));
    }

    public int missingNumber(int[] nums) {
        int expectedSum = nums.length * (nums.length+1)/2;

        int actualSum = 0;
        for(int num:nums){
            actualSum +=num;
        }
        return expectedSum - actualSum;
    }

    //using XOR operation
    public int missingNumberXOR(int[] nums) {
        int X1 = nums[0];
        for(int i = 1;i<nums.length;i++){
            X1 = X1 ^ nums[i];
        }
        int X2 = 1;
        for(int i = 1;i<nums.length;i++){
            X2 = X2 ^ nums[i];
        }
        return (X1 ^ X2);
    }

    public int missingNumberBruteForce(int[] nums) {
        Set<Integer> lst = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            lst.add(nums[i]);
        }

        for(int i = 0;i<nums.length;i++){
            if(!lst.contains(i))
                return i;
        }
        return -1;
    }
}
