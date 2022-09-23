package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        CombinationSum3 s = new CombinationSum3();
        for(List<Integer> a:s.combinationSum3(3,7))
        {
            System.out.println(Arrays.toString(a.toArray(new Integer[0])));
        }
    }
    List<List<Integer>>  result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        recursive(k,n,0, new ArrayList<>());
        return result;
    }


    void recursive(int k, int n,int t, List<Integer> comb)
    {
        if(comb.size() == k && n == t)
        {
            Collections.sort(comb);
            for(List<Integer> arr: result)
            {
                boolean all = true;
                for(int j = 0;j<comb.size();j++)
                {
                    if(comb.get(j) != arr.get(j))
                    {
                        all = false;
                    }
                }
                if(all)
                    return;
            }
            result.add(new ArrayList<>(comb));
            return;
        }
        else if (t>n || comb.size()>=k)
        {
            return;
        }

        for(int i = 1;i<=n;i++)
        {
            if(!comb.contains(i) && t+i<=n)
            {
                System.out.println(Arrays.toString(comb.toArray()));
                System.out.println(t);
                System.out.println(t+i);
                comb.add(i);
                recursive(k,n,t+i,comb);
                comb.remove(comb.size()-1);
            }
        }

        //comb.remove(comb.size()-1);

    }
}
