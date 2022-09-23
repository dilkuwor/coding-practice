package com.leetcode.coin_exchange;

import java.util.List;

public class CoinExchange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int target = 11;
        CoinExchange ce = new CoinExchange();
        int minCount = ce.changeCoin(coins,target,new int[target]);
        System.out.print(minCount);
    }

    int changeCoin(int[] coins, int rem, int[] count)
    {
        if(rem == 0)
            return 0;
        else if (rem<0)
            return -1;

        //dynamic programming check if the sub problem has been already calculated
        if(count[rem-1]!=0)
            return count[rem-1];

        int min = Integer.MAX_VALUE;
        for(int coin:coins)
        {
            int tempCount = changeCoin(coins,rem-coin,count);
            if(tempCount>=0 && tempCount<min)
            {
                min = tempCount+1;
            }
        }

        count[rem-1] = (min == Integer.MAX_VALUE)?-1:min;
        return count[rem-1];
    }

    void changeCoinCombination(List<List<Integer>> result, List<Integer> combination,int[] coins, int remaining)
    {
        if(remaining == 0)
        {
            result.add(combination);
        }
        else if (remaining<0)
            return;

        for(int coin: coins)
        {
            combination.add(coin);
        }
    }
}
