package com.leetcode.algo_challenge.day3;

import java.util.Arrays;

public class TwoSumInputArraySorted {
    public static void main(String[] args) {
        TwoSumInputArraySorted t = new TwoSumInputArraySorted();
        int[] test = {1,2,3,4,5};
        System.out.println(Arrays.toString(t.twoSum(test,6)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while (i<j){
            if(numbers[i] + numbers[j] == target)
            {
                return new int[] {i,j};
            }
            else if(numbers[i]+numbers[j]>target)
                j--;
            else
                i++;

        }
        return null;
    }
}
