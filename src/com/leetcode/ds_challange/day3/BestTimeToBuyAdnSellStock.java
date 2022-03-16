package com.leetcode.ds_challange.day3;

public class BestTimeToBuyAdnSellStock {
    public static void main(String[] args) {
        BestTimeToBuyAdnSellStock b = new BestTimeToBuyAdnSellStock();
        int[] test = {6,4,7};
        System.out.println(b.maxProfit(test));
    }

    //Brute force algo
    //o(n^2)
    public int maxProfit1(int[] prices)
    {
        if(prices.length == 0)
            return 0;


        int profit = 0;
        int lowInd = 0;
        int high = lowInd+1;

        while (high<prices.length)
        {

            while (high+1<prices.length && prices[high]<=prices[high+1])
            {
                if(prices[lowInd]>=prices[high])
                {
                    lowInd = high;
                }
                high++;
            }

            profit = Math.max(profit,prices[high] - prices[lowInd]);
            high++;
        }
        return profit;


    }

    public int maxProfit(int[] prices){
        if(prices.length == 0)
            return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0;i<prices.length;i++)
        {
            if(minPrice>prices[i])
            {
                minPrice = prices[i];
            }
            else
            {
                maxProfit = Math.max(maxProfit,prices[i] - minPrice);
            }
        }
        return maxProfit;
    }
    public int maxProfit12(int[] prices)
    {
        if(prices.length == 0)
            return 0;

        int profit = 0;

        for(int i =0;i<prices.length-1;i++){
            for(int j = i+1;j<prices.length;j++)
            {
                profit = Math.max(profit, prices[j] - prices[i]);
            }
        }
        return profit;
    }
}
