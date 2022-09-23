package com.leetcode.contest;

public class NthBinaryBit {
    public static void main(String[] args) {
        int n = 5;
        int nthBit = 1 << n;
//        System.out.println(nthBit);
//        for (int i = 0; i < (int)Math.pow(2, n); ++i) {
//            // generate bitmask, from 0..00 to 1..11
//            String bitmask = Integer.toBinaryString(i | nthBit).substring(1);
//            System.out.println(bitmask);
//        }

        for (int i = (int)Math.pow(2, n); i < (int)Math.pow(2, n + 1); ++i) {
            // generate bitmask, from 0..00 to 1..11
            String bitmask = Integer.toBinaryString(i).substring(1);
            System.out.println(bitmask);
        }
    }
}
