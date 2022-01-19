package com.leetcode.amazon.arrays_n_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostCommonWords {
    public static void main(String[] args) {
        MostCommonWords mc = new MostCommonWords();
        String s = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned  = {"hit"};
        System.out.println(mc.mostCommonWord(s,banned));

    }

    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> wordFrequency = new HashMap<>();
        Set<String> bannedMap = Set.of(banned);
        //replace all characters

        for(String s: paragraph.toLowerCase().split("\\W+")){
            System.out.println(s);
            if(!bannedMap.contains(s)){
                int count = wordFrequency.getOrDefault(s,0);
                wordFrequency.put(s,count+1);
            }
        }
        int freq = 0;
        String word = "";
        for(String k: wordFrequency.keySet()){
            if(wordFrequency.get(k).intValue()>freq){
                word = k;
                freq = wordFrequency.get(k).intValue();
            }
        }
        return word;
    }
}
