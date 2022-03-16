package com.leetcode.algo_challenge.day3;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] test = {4,2,4,0,0,3,0,5,1,0};
        MoveZeros z = new MoveZeros();
        z.moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while(i<nums.length){
            if(nums[i] == 0)
            {
                j = i+1;
                while(j<nums.length){
                    if(nums[j]!=0){
                        nums[i] = nums[j];
                        break;
                    }
                    j++;
                }

            }
            i++;
        }

    }
}
