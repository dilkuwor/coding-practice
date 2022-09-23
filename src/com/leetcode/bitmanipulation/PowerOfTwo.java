package com.leetcode.bitmanipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        for(int i = 0;i<10;i++)
        {
            int pft = (int)Math.pow(4,i);
            System.out.println(Integer.toBinaryString(pft));
        }
    }
}
