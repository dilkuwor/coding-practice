package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopifyProblem {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("a","d"));
        List<String[]> items = new ArrayList<>();
        items.add(new String[]{"a","10"});
        items.add(new String[]{"b","100"});
        items.add(new String[]{"c","5"});
        items.add(new String[]{"d","10"});
        ShopifyProblem s = new ShopifyProblem();
        System.out.println(s.solve(arr,items));

    }

    String solve(List<String> arr, List<String[]> items)
    {
        String ans = "";
        int max = Integer.MIN_VALUE;
        for(String[] item: items)
        {
            if(arr.contains(item[0]))
                continue;
            if(Integer.parseInt(item[1])>max)
            {
                ans = item[0];
                max = Integer.parseInt(item[1]);
            }
        }
        return ans;
    }
}
