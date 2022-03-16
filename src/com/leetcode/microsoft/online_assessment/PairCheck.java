package com.leetcode.microsoft.online_assessment;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

//Return if you can create array pairs from the given array. Eg: [1,2,2,1] - > True since [1,1] and [2,2] are pairs. But [1,1,2,2,2] can't because there in an extra 2 that can't be paired with anything.
public class PairCheck {
    public static void main(String[] args) {
        int[] test = new int[100000];

        for(int i = 0;i<test.length;i++)
        {
            test[i] =  ThreadLocalRandom.current().nextInt(0, 1000 + 1);
        }


        long startTime = System.nanoTime();
        boolean t = checkPair(test);
        long endTime = System.nanoTime();
        System.out.format("Time Difference with XOR %d and %s",endTime-startTime,t);
        startTime = System.nanoTime();
        checkPairs(test);
        endTime = System.nanoTime();
        System.out.format("\nTime Difference with set %d and %s",endTime-startTime,t);
    }

//    static boolean checkPairsUsingStack()
//    {
//
//    }

    /*
    Solution using bit manipulation XOR operation
     */
    static boolean checkPair(int[] arr)
    {
        int a = 0;
        for(int aa:arr)
        {
            a ^=aa;
        }
        return a == 0;
    }

    static boolean checkPairs(int[] arr)
    {
        if(arr.length%2 !=0)
            return false;

        Set<Integer> pair = new HashSet<>();
        for(int a:arr)
        {
            if(!pair.add(a))
            {
                pair.remove(a);
            }
        }
        return pair.size() == 0;
    }
}
