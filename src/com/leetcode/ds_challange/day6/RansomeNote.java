package com.leetcode.ds_challange.day6;

public class RansomeNote {
    public static void main(String[] args) {
        RansomeNote r = new RansomeNote();
        String a = "bg";
        String b = "bgefjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        System.out.println(r.canConstruct(a,b));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        //edge case

        if (ransomNote.length() > magazine.length())
            return false;

        int[] cf = new int[26];

        for (char c : ransomNote.toCharArray()) {
            cf[c - 'a']++;
        }

        int[] cff = new int[26];

        for (char c : magazine.toCharArray()) {
            cff[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (cff[c - 'a'] < cf[c - 'a'])
                return false;
        }
        return true;
    }
}
