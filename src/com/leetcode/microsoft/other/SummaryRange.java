package com.leetcode.microsoft.other;

import java.util.ArrayList;
import java.util.List;

/*
228. Summary Ranges
 */
public class SummaryRange {
    public static void main(String[] args) {
        SummaryRange sr = new SummaryRange();
        int[] test = {0,1,2,4,5,7};
        System.out.println(sr.summaryRanges(test).toString());
    }

    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        int start = 0;
        int rs = nums[0];
        int re = nums[0];
        while(start<nums.length)
        {
            if(start+1<nums.length && nums[start]+1 == nums[start+1])
            {
                re = nums[start+1];
            }
            else{
                if(rs!=re)
                    result.add(rs+"->"+re);
                else{
                    result.add(rs+"");
                }
                if(start+1<nums.length)
                {
                    rs = nums[start+1];
                    re = rs;
                }

            }
            start++;
        }

        return result;
    }
}
