package com.leetcode.contest;

import java.util.HashSet;
import java.util.Set;

public class OptimalPartitionString {
    public static void main(String[] args) {
        String s = "abacaba";
        //ab,ac,ab,a
        Set<Character> set = new HashSet<>();
        set.clear();
    }

    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int count = 1;
        for(int i = 0;i<s.length();i++)
        {
            if(!set.add(s.charAt(i)))
            {
                count++;
                set.clear();
                set.add(s.charAt(i));
            }
        }
        return count;
    }
}
