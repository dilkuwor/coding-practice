package com.leetcode.microsoft.online_assessment;

import java.util.*;

public class MaximumLengthOfConcatnatedString {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();

        String[] arrr = {"a", "abc", "d", "de", "def"};
        arr.add("abcdefghijklmnopqrstuvwxyz");
        //arr.add("bb");

        MaximumLengthOfConcatnatedString m = new MaximumLengthOfConcatnatedString();
        System.out.println(m.maxLength(Arrays.asList(arrr)));
    }

    public int maxLength(List<String> arr) {

        List<String> result = new ArrayList<>();
        result.add("");
        int best = 0;
        for(String s: arr)
        {
            int resultSize = result.size();

            for(int i = 0;i<resultSize;i++)
            {
                Set<Character> unique = new HashSet<>();
                String temp = result.get(i) + s;
                for(char c: temp.toCharArray())
                {
                    unique.add(c);
                }
                if(unique.size()!=temp.length())
                    continue;
                result.add(temp);
                best = Math.max(best,temp.length());
            }
        }
        return best;
    }
}
