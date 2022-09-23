package com.leetcode.contest;

public class ReArrangeBinaryStrings {
    public static void main(String[] args) {
        ReArrangeBinaryStrings r = new ReArrangeBinaryStrings();
        String s = "001011";
        System.out.println(r.secondsToRemoveOccurrences(s));
    }

    public int secondsToRemoveOccurrences(String s) {
        {

            int cnt = 0;
            while(s.contains("01"))
            {
                s = s.replaceAll("01","10");
                cnt++;
            }
            return cnt;
        }
    }
}
