package com.leetcode.contest;

import java.math.BigInteger;
import java.util.Arrays;

public class Fibo {
    public static void main(String[] args) {
        Fibo f = new Fibo();
        int n = 100;
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE).length());
        //System.out.println(f.fibo(n,dp));
    }

    long fibo(int n,long[] dp)
    {
        if(n == 0 || n == 1)
            return n;
        if(dp[n]>=0)
            return dp[n];
        return dp[n] = fibo(n-1, dp)+fibo(n-2, dp);
    }
}
