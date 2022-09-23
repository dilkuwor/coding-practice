package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumberOfWeakCharactersInGame {
    public static void main(String[] args) {
        //[[1,1],[2,1],[2,2],[1,2]]
        //[[7,9],[10,7],[6,9],[10,4],[7,5],[7,10]]
        //[[10,1],[5,1],[7,10],[4,1],[5,9],[6,9],[7,2],[1,10]]
        NumberOfWeakCharactersInGame g = new NumberOfWeakCharactersInGame();
        int[][] test ={{10,1},{5,1},{7,10},{4,1},{5,9},{6,9},{7,2},{1,10}};// {{7,9},{10,7},{6,9},{10,4},{7,5},{7,10}};
        System.out.println(g.numberOfWeakCharacters(test));
    }

    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(a,b)->a[0]-b[0]);
        int cnt = 0;
        TreeMap<Integer, Integer> first = new TreeMap<>();
        Map<Integer,Integer> max = new HashMap<>();
        int[] maxSuffix = new int[properties.length];

        int n = properties.length-1;
        for(int i = 0;i<properties.length;i++)
        {
            first.put(properties[i][0],i);
            max.put(properties[i][0],Math.max(max.getOrDefault(properties[i][0],0),properties[i][1]));
            maxSuffix[n-i] = i == 0? properties[n-i][1]: Math.max(properties[n-i][1], maxSuffix[n-i+1]);

        }

        for(int i = 0;i<properties.length;i++)
        {
            Integer a = first.ceilingKey(properties[i][0]+1);
            if(a!=null && (maxSuffix[first.get(a)]>properties[i][1] || max.get(a)>properties[i][1]))
            {
                cnt++;
            }
        }
        return cnt;
    }
}
