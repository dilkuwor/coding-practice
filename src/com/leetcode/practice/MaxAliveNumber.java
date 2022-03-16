//package com.leetcode.practice;
//
//import java.util.Arrays;
//
//public class MaxAliveNumber {
//    public static void main(String[] args) {
//        int[] birthYear = {1990,1991,1995,2003,1993,1991};
//        int[] deathYear = {2001,2003,2004,2006,2009,2000};
//        Arrays.sort(birthYear);
//        Arrays.sort(deathYear);
//
//        int birthCount  = 0;
//        int yearMax = 0;
//        int maxAlive = Integer.MIN_VALUE;
//        int start = 0;
//        int deathStart = 0;
//        while (start<birthYear.length)
//        {
//            int temp = start;
//            while (birthYear[temp]>deathYear[deathStart])
//            {
//                deathStart++;
//            }
//
//            if(birthCount+1 - deathStart>maxAlive)
//            {
//                maxAlive = birthCount+1 - deathStart;
//                yearMax = deathYear[deathStart];
//            }
//            birthCount++;
//        }
//
//        return yearMax;
//    }
//}
