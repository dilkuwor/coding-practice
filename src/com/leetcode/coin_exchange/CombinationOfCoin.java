package com.leetcode.coin_exchange;

import java.util.ArrayList;
import java.util.List;

public class CombinationOfCoin {
    public static void main(String[] args) {
        int[] coins = {2,1};
        int target = 4;
        CombinationOfCoin c = new CombinationOfCoin();
        List<List<Integer>> comb = c.combinations(target,coins);
        for(List<Integer> combinations : comb)
        {
            System.out.println(combinations.toString());
        }
    }

    public List<List<Integer>> combinations(int target, int[] coins) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<Integer>(), 0, target, coins);
        return ans;
    }
    private void helper(List<List<Integer>> ans, List<Integer> count, int level, int remaining, int[] coins) {
        if (level >= coins.length) {
            if (remaining == 0) {
                ans.add(new ArrayList(count));
            }
            return;
        }
        count.add(0);
        int cnt = 0;
        for (int i = 0; i <= remaining; i += coins[level]) {
            count.set(level, cnt);
            helper(ans, count, level + 1, remaining - i, coins);
            cnt++;
        }
        count.remove(count.size() - 1);
    }
}
