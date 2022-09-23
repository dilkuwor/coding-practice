package com.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class DeleteAndEarn {
    public static void main(String[] args) {
        DeleteAndEarn e = new DeleteAndEarn();
        int[] arr = {3,4,2};
        System.out.println(e.deleteAndEarn(arr));
    }

    int result = 0;

    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: nums)
        {
            map.putIfAbsent(a,0);
            map.put(a,map.get(a)+1);
        }
        delete(map,0);
        return result;
    }

    void delete(Map<Integer,Integer> map, int total)
    {
        if(map.isEmpty())
        {
            result = Math.max(total, result);
            return;
        }

        for(int a: map.keySet())
        {
            Map<Integer,Integer> newMap = new HashMap<>(map);
            newMap.remove(a);
            if(map.containsKey(a-1))
            {
                newMap.remove(a-1);
            }
            if(map.containsKey(a+1))
            {
                newMap.remove(a+1);
            }
            delete(newMap,map.get(a)*a + total);
        }


    }
}
