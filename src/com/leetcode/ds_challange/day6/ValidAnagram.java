package com.leetcode.ds_challange.day6;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

        ValidAnagram a = new ValidAnagram();
        String s = "aacc";
        String t = "ccac";

        System.out.println(a.isAnagram(s,t));

    }
    public boolean isAnagram(String s, String t) {

        //edge case
        if(s.length()!=t.length())
            return false;

        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c: s.toCharArray())
        {
            int count = freq.getOrDefault(c,0);
            freq.put(c,++count);
        }


        for(char c: t.toCharArray())
        {

            if(freq.containsKey(c))
            {
                int count = freq.get(c);
                freq.put(c,--count);
            }
            else
            {
                return false;
            }
        }

        for(Integer a: freq.values())
        {
            if(a!=0)
                return false;
        }

        return true;

    }
}
