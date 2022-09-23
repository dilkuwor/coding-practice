package com.leetcode.contest;

import java.util.Arrays;

public class NumberOfWaysToReachAfter {
    public static void main(String[] args) {
        NumberOfWaysToReachAfter n = new NumberOfWaysToReachAfter();
        System.out.println(n.numberOfWays(1,2,3));
        System.out.println(n.numberOfWays(1000,413,716));

    }

    public int numberOfWays(int startPos, int endPos, int k) {
        int[][] dp = new int[startPos+2*k+2][k+1];
        for(int[] a:dp)
            Arrays.fill(a,-1);
        return ways(startPos,endPos,k, dp, k);
    }

    int ways(int start, int end, int k, int[][] dp, int s)
    {
        if(k == 0 && start == end)
            return 1;
        if(k<0)
            return 0;
        if(dp[start+s][k]>=0)
            return dp[start+s][k];
        return dp[start+s][k] = (ways(start-1,end,k-1, dp,s) + ways(start+1,end,k-1, dp,s))%(int)(Math.pow(10,9)+7);
    }
}
