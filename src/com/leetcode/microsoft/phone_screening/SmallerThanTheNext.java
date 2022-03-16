package com.leetcode.microsoft.phone_screening;

import com.leetcode.microsoft.DataHelper;

import java.util.*;

public class SmallerThanTheNext {
    public static void main(String[] args) {
        int[] test = DataHelper.getRandomArray(10);
        System.out.println("\n"+Arrays.toString(test));
        long startTime = System.nanoTime();
        int[] ans = deleteAllSmallerNumbers(test);

        long endTime = System.nanoTime();
        System.out.println("\n"+Arrays.toString(ans));
        System.out.format("\nTime Difference with Stack %d",endTime-startTime);
        startTime = System.nanoTime();
        var ans1 = deleteAllSmallerNumbers1(test);
        endTime = System.nanoTime();
        System.out.format("\nTime Difference with DECQ %d",endTime-startTime);
        System.out.println("\n"+Arrays.toString(ans1));

    }
    public static int[] deleteAllSmallerNumbers(int[] arr)
    {
        Stack<Integer> s = new Stack();
        for(int a: arr)
        {
            while (!s.empty() && s.peek()<a)
            {
                s.pop();
            }
            s.push(a);
        }
        return s.stream().mapToInt(r->r).toArray();
    }
    public static int[] deleteAllSmallerNumbers1(int[] arr)
    {
        Deque<Integer> answers = new LinkedList<>();
        int last = arr.length-1;
        answers.addFirst(arr[last]);
        int localMax = arr[last];
        while(last>0)
        {
            if(localMax<arr[last])
            {
                answers.addFirst(arr[last]);
                localMax = arr[last];
            }
            last--;
        }

        return answers.stream().mapToInt(i->i).toArray();
    }
}
