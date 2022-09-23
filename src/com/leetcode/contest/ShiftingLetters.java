package com.leetcode.contest;

public class ShiftingLetters {
    public static void main(String[] args) {
        ShiftingLetters sf = new ShiftingLetters();
        String s = "abc";
        int[] shifts = {3,5,9};
        System.out.println(sf.shiftingLetters(s,shifts));
    }

    public String shiftingLetters(String s, int[] shifts) {
        for(int i = shifts.length-2;i>=0;i--)
        {
            shifts[i] +=shifts[i+1];
        }

        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++)
        {
            int temp = (c[i] - 'a') + shifts[i];
            c[i] = (char)((temp%26+'a'));
        }

        return new String(c);
    }
}
