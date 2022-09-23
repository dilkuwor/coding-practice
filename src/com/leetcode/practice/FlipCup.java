package com.leetcode.practice;

import java.util.Arrays;

public class FlipCup {
    public static void main(String[] args) {
        FlipCup fp = new FlipCup();
        int[] flips = {1,4,2};
        int res = fp.fillCups(flips);
        System.out.println(res);
    }

    public int fillCups(int[] amount) {
        int steps = 0;
        Arrays.sort(amount);
        int max = amount[2];
        int second = amount[1];
        int third = amount[0];
        while(true)
        {

            if(second>0)
            {
                max--;
                second--;
                steps++;
            }
            else if(max!=0){
                max--;
                steps++;
            }

            if(max == 0 && second == 0 && third == 0)
                break;

            if(third>max)
            {
                int t = max;
                max = third;
                third = t;

            }
            if(third>second)
            {
                int t = third;
                third = second;
                second = t;

            }
        }
        return steps;
    }
    void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
