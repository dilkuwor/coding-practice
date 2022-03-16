package com.leetcode.microsoft.practice_ms_questions;
/*
1143. Longest Common Subsequence
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        LongestCommonSubsequence l = new LongestCommonSubsequence();
        String text1 = "ezupkr", text2 = "ubmrapg";
        System.out.println(l.longestCommonSubsequence(text1,text2));

    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];
        for(int i = 1;i<=m;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
