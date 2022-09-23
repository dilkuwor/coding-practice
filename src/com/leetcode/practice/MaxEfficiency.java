//package com.leetcode.practice;
//
//import java.util.*;
//
//public class MaxEfficiency {
//    int max = 0;
//    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
//        Map<String,Integer> dp = new HashMap<>();
//        perm(speed,efficiency,k, new ArrayList<>(),new boolean[n], dp);
//        return max;
//    }
//
//    int calculate(Map<String,Integer> dp, List<Integer> currentSet, int[] speed, int[] eff)
//    {
//        Collections.sort(currentSet);
//        String key = currentSet.stream().collect(Collectors.joining(","));
//        if(dp.containsKey(key))
//            return dp.get(key);
//
//        //calculate max
//        int total = 0;
//        int min = Integer.MAX_VALUE;
//        for(int a: currentSet)
//        {
//            total +=speed[a];
//            min = Math.min(eff[a],min);
//        }
//        dp.put(key,total*min);
//        return dp.get(key);
//
//    }
//
//    void perm(int[] speed, int[] eff, int k, List<Integer> currentSet, boolean[] used, Map<String,Integer> dp)
//    {
//
//        max = Math.max(max,calculate(dp,currentSet,speed,eff));
//        if(currentSet.size() >=k)
//            return;
//
//        for(int i = 0;i<speed.length;i++)
//        {
//            if(!used[i])
//            {
//                used[i] = true;
//                currentSet.add(i);
//                perm(speed,eff,k,currentSet,used);
//                currentSet.remove(currentSet.size()-1);
//                used[i] = false;
//            }
//        }
//    }
//}
