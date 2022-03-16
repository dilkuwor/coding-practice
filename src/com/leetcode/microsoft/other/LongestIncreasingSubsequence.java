package com.leetcode.microsoft.other;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();
        int[] test = {1,3,6,7,9,4,10,5,6};
        System.out.println(l.lengthOfLI4(test));
    }

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int longest = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    longest = Math.max(longest, dp[i]);
                }
            }
        }

        return longest;
    }

    public int lengthOfLI4(int[] nums)
    {
        ArrayList<Integer> piles = new ArrayList<>(nums.length);
        for(int a: nums)
        {
            int pile = Collections.binarySearch(piles,a);
            if(pile<0)
            {
                pile = ~pile;
            }
            if(pile == piles.size())
            {
                piles.add(a);
            }
            else{
                piles.set(pile,a);
            }
        }
        return piles.size();
    }
    public int lengthOfLI3(int[] nums) {

        //nearest greater or equal element which is already added in tree set

        TreeSet<Integer> s = new TreeSet();
       for(Integer n:nums)
       {
           Integer x = s.ceiling(n);
           if(x!=null)
           {
               s.remove(x);
           }
           s.add(n);
       }

       return s.size();
    }

    public int lengthOfLIS2(int[] nums) {
        int max = 0;
        int skipped = 0;
        for(int i = 1,j=0;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                max  = Math.max(max,i - j + 1 - skipped);
            }
            else{
                skipped++;
            }

            //find the smallest pointer
            if(nums[j]>nums[i])
            {
                j = i;
                skipped = 0;
            }

        }

        return max == 0?1:max;
    }
}
