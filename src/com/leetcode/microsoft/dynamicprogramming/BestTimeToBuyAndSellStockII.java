package com.leetcode.microsoft.dynamicprogramming;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] test = {7,1,5,3,6,4};
        System.out.println(maxProfit(test));
    }

    public static  int maxProfit(int[] prices) {

        int max_profit = 0;

        for(int i = 0;i<prices.length;i++)
        {
            int j = i;
            while(j+1<prices.length && prices[j]>=prices[j+1])
            {
                j++;
            }

            if(i!=j || j>prices.length)
            {
                j--;

            }

            i = j;

            while(j+1<prices.length && prices[j]<=prices[j+1])
            {
                j++;
            }
            if(i!=j || j>prices.length)
            {
                j--;
            }
            i = j;

            max_profit =Math.max(max_profit, max_profit + (prices[j] - prices[i]));

        }

        return max_profit;

    }
}
