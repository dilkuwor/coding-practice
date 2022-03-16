package com.leetcode.ds_challange.day6;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        FirstUniqueCharacterInString f = new FirstUniqueCharacterInString();
        String t = "leetcode";

        System.out.println(f.firstUniqChar(t));
    }

    public int firstUniqChar(String s) {
        int[] charFrequency = new int[26];

        for(char c: s.toCharArray())
        {
            charFrequency[c -'a']++;
        }
        for(int i = 0;i<s.length();i++)
        {
            if(charFrequency[s.charAt(i) -'a'] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
