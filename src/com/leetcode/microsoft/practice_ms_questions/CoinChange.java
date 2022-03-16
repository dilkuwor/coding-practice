package com.leetcode.microsoft.practice_ms_questions;

public class CoinChange {
    public static void main(String[] args) {
        CoinChange c = new CoinChange();
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(c.coinChange(coins,amount));

    }
    public int coinChange(int[] coins, int amount) {
        return coinChangeRecursive(coins,amount, new int[amount+1]);
    }

    public int coinChangeRecursive(int[] coins, int totalRemain, int[] dp)
    {

        if(totalRemain == 0)
            return 0;
        else if (totalRemain<0)
            return -1;

        if(dp[totalRemain]>0)
            return dp[totalRemain];

        int minChange = Integer.MAX_VALUE;
        for(int coin: coins)
        {
            int count = coinChangeRecursive(coins,totalRemain - coin,dp);
            if(count>0)
                dp[totalRemain - coin] = count;
            if(count == -1)
                continue;
            minChange = Math.min(minChange,count+1);
        }
        return minChange == Integer.MAX_VALUE?-1:minChange;
    }
}
