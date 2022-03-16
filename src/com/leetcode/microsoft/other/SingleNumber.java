package com.leetcode.microsoft.other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        int[] arr = {2,2,1};
        System.out.println(s.singleNumber(arr));
        Set<String> str = new HashSet<>();
        str.stream().forEach(r->{

        });


    }
    public int singleNumber(int[] nums)
    {
        int a = 0;
        for(int i:nums)
        {
            a ^=i;
        }
        return a;
    }
    public int singleNumber1(int[] nums) {


//        Set<Integer> unique = new HashSet<>();
//        for(int a:nums)
//        {
//            if(!unique.add(a))
//            {
//                unique.remove(a);
//            }
//        }
//
//        return unique.iterator().next();

        Map<Integer,Integer> map = new HashMap<>();

        for(int a:nums)
        {
            int count = map.getOrDefault(a,0);
            map.put(a,++count);

        }

        for(int a: map.keySet())
        {
            if(map.get(a) == 1)
                return a;
        }
        return 0;

    }

}
