package com.leetcode.contest;

public class DistanceBetweenSameLetter {
    public static void main(String[] args) {
        DistanceBetweenSameLetter d = new DistanceBetweenSameLetter();
        int[] distance = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String s = "aa";
        System.out.println(d.checkDistances(s,distance));
    }

    public boolean checkDistances(String s, int[] distance) {
        for(char c: s.toCharArray())
        {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);

            if((last-first-1)!=distance[c-'a'])
                return false;
        }
        return true;
    }
}
