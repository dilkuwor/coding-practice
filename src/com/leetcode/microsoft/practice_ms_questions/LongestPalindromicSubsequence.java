package com.leetcode.microsoft.practice_ms_questions;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        LongestPalindromicSubsequence l = new LongestPalindromicSubsequence();
        String s = "bcc";
        System.out.println(l.longestPalindromeSubseq(s));
    }

    public int longestPalindromeSubseq(String s) {
        int size = s.length()+1;
        int[][] dp = new int[size][size];
        int counter = s.length();

        for(int i = 1;i<=s.length();i++)
        {
            for(int j = 1;j<=s.length();j++)
            {
                if(s.charAt(i-1) == s.charAt(counter-j))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[s.length()][s.length()];
    }
}
