package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class ShortestWordDistance {
    public static void main(String[] args) {
        ShortestWordDistance w = new ShortestWordDistance();
        String[] test = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(w.shortestDistance(test,"makes","coding"));

    }
    public int shortestDistance(String[] wordsDict, String word1, String word2) {

        //edge case
        if(wordsDict.length == 0 || word1.isEmpty() || word2.isEmpty())
            return 0;

        Map<String,Integer> maps = new HashMap<>();
        int distance = Integer.MAX_VALUE;
        for(int i =0;i<wordsDict.length;i++)
        {
            if(wordsDict[i].equals(word1))
            {
                maps.put(word1,i);
            }
            else if (wordsDict[i].equals(word2))
            {
                maps.put(word2,i);
            }

            if(maps.size() ==  2)
            {
                distance = Math.min(Math.abs(maps.get(word1) - maps.get(word2)),distance);
            }
        }
        return distance;
    }
}
