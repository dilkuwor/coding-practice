package com.hackerrank.onemonth.week1.wordrequency;

import com.leetcode.amazon.linkedlist.ListNode;

import java.util.*;

public class MatchingString {
    public static void main(String[] args) {
        MatchingString a = new MatchingString();
        List<String> strings = new ArrayList<>();
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");

        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");

        List<Integer> result = a.matchingStrings(strings,queries);
        System.out.println(result);

    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        Map<String,Integer> wordFrequency = new HashMap<String,Integer>();

        for(String str: strings){

            if(wordFrequency.containsKey(str)){
                wordFrequency.put(str,wordFrequency.get(str)+1);
            }
            else{
                wordFrequency.put(str,1);
            }

        }

        List<Integer> result = new ArrayList<>();
        for(String str: queries)
        {
            if(wordFrequency.containsKey(str)){
                result.add(wordFrequency.get(str));
            }
            else{
                result.add(0);
            }

        }
        return result;


    }
}
