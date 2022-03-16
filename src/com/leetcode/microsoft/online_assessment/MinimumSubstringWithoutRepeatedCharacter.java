package com.leetcode.microsoft.online_assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
Count of all unique substrings with non-repeating characters
Given a string S, return the minimum amount of substrings without repeating characters
 */
public class MinimumSubstringWithoutRepeatedCharacter {
    public static void main(String[] args) {
        String test = "dddd";
        System.out.println(minimumSubstring(test));
    }

    static int minimumSubstring(String s)
    {
        HashSet<String> unique = new HashSet();
        for(int i = 0;i<s.length();i++)
        {
            StringBuilder bldr = new StringBuilder();
            boolean[] chars = new boolean[26];
            for(int j = i;j<s.length();j++)
            {
                int index = s.charAt(j) - 'a';
                if(chars[index] == true)
                {
                    break;
                }
                bldr.append(s.charAt(j));
                chars[index] = true;
                unique.add(bldr.toString());
            }

        }
        System.out.println(unique.stream().toList());
        return unique.size();
    }
}
