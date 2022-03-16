package com.leetcode.microsoft.other;

/*
https://leetcode.com/problems/longest-common-prefix/
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "floight"};

        System.out.println(longestCommonPrefix(arr));

    }

    public static String longestCommonPrefix(String[] strs) {

        int maxLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            maxLength = Math.min(maxLength, strs[i].length());
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < maxLength; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return strs[0].substring(start, end );
                }
            }
            end++;
        }
        return strs[0].substring(start, end);

    }
}
