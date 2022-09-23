package com.leetcode.contest;

import java.util.Arrays;
import java.util.TreeMap;

public class LongestWithLimitedSum {
    public static void main(String[] args) {
        /*
        [736411,184882,914641,37925,214915]
[331244,273144,118983,118252,305688,718089,665450]
         */
        int[] nums = {736411,184882,914641,37925,214915};
        int[] q = {331244,273144,118983,118252,305688,718089,665450};


        LongestWithLimitedSum l = new LongestWithLimitedSum();
        System.out.println(Arrays.toString(l.answerQueries(nums,q)));
    }

    public int[] answerQueries(int[] nums, int[] queries) {
//        int[] res = new int[queries.length];
//        for(int i = 0;i<queries.length;i++)
//        {
//            res[i] = length(nums,queries[i]);
//        }
//        return res;

        int[] res = new int[queries.length];

        for(int i = 0;i<queries.length;i++)
        {
            int max = 0;

            for(int j = 0;j<nums.length;j++)
            {
                int sum = 0;
                for(int k = j;k<nums.length+1;k++)
                {
                    sum +=nums[k%nums.length];
                    if(sum<=queries[i])
                    {
                        max = Math.max(max,k-j+1);
                    }
                }
            }
            res[i] = max;
        }
        return res;
    }

    int length(int[] arr, int t)
    {
        TreeMap<Long,Integer> map = new TreeMap<>();

        int len = 0;
        long sum = 0;
        map.put(0L,0);
        for(int i = 1;i<=arr.length;i++)
        {
            sum +=arr[i-1];
            Long result = map.ceilingKey(sum-t);
            if(result!=null)
            {
                len = Math.max(len, i - map.get(result));
            }
            map.put(sum,i);
        }
        return len;

    }
}
