package com.leetcode.contest;

import java.util.HashSet;
import java.util.Set;

public class CountingSpecialNumbers {
    public static void main(String[] args) {
        CountingSpecialNumbers s = new CountingSpecialNumbers();
        System.out.println(s.countSpecialNumbers(2 * (int)Math.pow(10,9)));
        //System.out.println(s.countSpecialNumbers(10000));
        //11,22,33,44,55,66,77,88,99,100
        //100 = 100-10 = 90
        //110,101,122,133,144,155,166,177,188,199
        //123,123
    }

    public int countSpecialNumbers(int n) {
        int cnt = 0;
        Set<Integer> dp = new HashSet<>();
        for(int i = n;i>=1;i--)
        {
            if(dp.contains(i) ||isSpecial(i,dp))
                cnt++;
        }
        return cnt;
    }

    boolean isSpecial(int a, Set<Integer> dp)
    {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        while(a>0)
        {
            if(!seen.add(a%10))
                return false;
            a /=10;
            temp.add(a);

        }
        for(int aa: temp)
        {
            dp.add(aa);
        }
        return true;
    }
}
