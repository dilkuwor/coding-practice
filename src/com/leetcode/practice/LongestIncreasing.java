package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasing {
    public static void main(String[] args) {

    }

    public int lengthOfLIS(int[] nums) {
        List<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);
        //[8, 1, 6, 2, 3, 10]
        for(int i = 1;i<nums.length;i++)
        {
            int num = nums[i];
            if(num>sub.get(sub.size()-1))
            {
                sub.add(num);
            }
            else{
                int j = Collections.binarySearch(sub,num);

                        sub.set(j,num);
            }
        }

        return sub.size();
    }
}
