package com.leetcode.bitmanipulation;

public class LogicalArthematicShift {
    public static void main(String[] args) {
        int count = 40;
        int a= - 93242;
        System.out.println(logicalShift(a,count));
        System.out.println(arthematiclShift(a,count));
    }

    static int arthematiclShift(int a, int count)
    {

        for(int i = 0;i<count;i++)
        {
            a >>=1;
        }

        return a;
    }

    static int logicalShift(int a, int count)
    {

        for(int i = 0;i<count;i++)
        {
            a >>>=1;
        }

        return a;
    }
}
