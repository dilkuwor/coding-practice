package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

public class LongestNiceSubArray {
    public static void main(String[] args) {
        LongestNiceSubArray l = new LongestNiceSubArray();
        int[] arr = {3,1,5,11,13};

        System.out.println(l.longestNiceSubarray(arr));
    }

    public int longestNiceSubarray(int[] nums) {
        int longest = 1;

        for(int i = 0;i<nums.length;i++)
        {
            List<Integer> arr = new ArrayList<>();
            arr.add(nums[i]);
            for(int j = i+1;j<nums.length;j++)
            {
                boolean isValid = true;
                for(int a: arr)
                {
                    if((a&nums[j])!=0)
                    {
                        isValid = false;
                        break;
                    }

                }
                if(!isValid)
                {
                    break;
                }
                arr.add(nums[j]);
                longest = Math.max(longest,arr.size());
            }

        }

        return longest;
    }
}
