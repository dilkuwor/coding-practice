package com.leetcode.microsoft.online_assessment;

import java.util.*;

public class MinimumDeletionToMakeCharFrequencyUnique {
    public static void main(String[] args) {
        MinimumDeletionToMakeCharFrequencyUnique u = new MinimumDeletionToMakeCharFrequencyUnique();

        String test = "bbcebab";
        System.out.println(u.minDeletions(test));
    }

    public int minDeletions(String s) {

        Map<Character,Integer> charFrequency = new HashMap<>();
        for(char c: s.toCharArray())
        {
            int count = charFrequency.getOrDefault(c,0);
            charFrequency.put(c,count+1);
        }

        Set<Integer> unique = new HashSet<>();
        int total = 0;
        for(char c: charFrequency.keySet())
        {
            int freq = charFrequency.get(c);
            while(freq>0 && !unique.add(freq))
            {
                total++;
                freq--;
            }
        }

        return total;


    }
    public int minDeletions1(String s) {
        if(s.length() == 1)
            return 0;
        Map<Character, Integer> charFrequency = new HashMap<>();
        for(char c: s.toCharArray())
        {
            int count = charFrequency.getOrDefault(c,0);
            charFrequency.put(c,count+1);
        }

        Integer[] track = charFrequency.values().toArray(new Integer[0]);
        Arrays.sort(track);

        int l = track.length-1;
        int localMax = track[l];
        int c = 0;
        for(int i = l-1;i>=0;i--)
        {
            if(localMax <= track[i])
            {
                int tmp = 0;
                while(track[i]-tmp>0 && track[i]-tmp>=localMax)
                {
                    tmp++;
                }

                c +=tmp;
                localMax = track[i] - tmp;
            }
            else{
                localMax = Math.min(track[i],localMax);
            }

        }
        return c;
    }
}
