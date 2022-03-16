package com.leetcode.microsoft.online_assessment;

import java.lang.reflect.Array;
import java.util.Arrays;

/*

https://leetcode.com/discuss/interview-question/364618/
Alexa is given n piles of equal or unequal heights. In one step, Alexa can remove any number of boxes from the pile which has the maximum height and try to make it equal to the one which is just lower than the maximum height of the stack. Determine the minimum number of steps required to make all of the piles equal in height.

Example 1:

Input: piles = [5, 2, 1]
Output: 3
Explanation:
Step 1: reducing 5 -> 2 [2, 2, 1]
Step 2: reducing 2 -> 1 [2, 1, 1]
Step 3: reducing 2 -> 1 [1, 1, 1]
So final number of steps required is 3.
 */
public class MinStepsInPile {
    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 4};
        System.out.println(minSteps(arr));
    }

    public static  int minSteps(int[] piles){
        if(piles.length<=1)
            return 0;

        //Arrays.sort(piles);
        //5 5 4 4
        int result = 0;
        int distinct = 0;
        for(int i = 0;i<piles.length-1;i++)
        {
            if(piles[i]!=piles[i+1])
            {
                distinct++;
            }
            result +=distinct;
        }

//        for(int i = 1;i<piles.length;i++)
//        {
//            if(piles[i]!= piles[i-1])
//            {
//                distinct++;
//            }
//            result +=distinct;
//        }
        return result;
    }
}
