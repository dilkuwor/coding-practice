package com.hackerrank.onemonth.week1.LonelyInteger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);

        Integer ans = lonelyinteger(a);
        System.out.println(ans);

    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here

        Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();

        for(Integer c: a){
            int count = myMap.getOrDefault(c,0);
            myMap.put(c,++count);
        }

        for(Integer ks:myMap.keySet()){
            if(myMap.get(ks).intValue() == 1)
                return ks;
        }
        return -1;

    }
}
