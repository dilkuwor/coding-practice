package com.leetcode.microsoft.backtracking;

public class WildCardMatching {
    public static void main(String[] args) {
        String  a = "acdcb";
        String p = "a*c?b";
        WildCardMatching w = new WildCardMatching();
        System.out.println(w.isMatch(a,p));
    }

    public boolean isMatch(String s, String p) {

        boolean[][] dp = new boolean[s.length()+1][p.length()+1];

        //base case
        dp[0][0] = true;

        //update first row
        for(int j = 1;j<dp.length;j++)
        {
            if(p.charAt(j-1) == '*')
            {
                dp[0][j] = true;
            }
        }

        for(int i =1;i<s.length();i++)
        {
            for(int j = 1;j<p.length();j++)
            {
                if((s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') && dp[i-1][j-1])
                {
                    dp[i][j] = true;
                }
                else if(p.charAt(i-1) == '*' && (dp[i][j-1]|| dp[i-1][j]))
                {
                    dp[i][j] = true;
                }
                else
                {
                    dp[i][j] = false;
                }
            }
        }

        return dp[s.length()][p.length()];

    }
}
