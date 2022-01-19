package com.hackerrank.onemonth.week1.maxminsum;

import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int max = arr.get(0);
        int min = max;
        long total = 0;

        for(int a:arr){
            if(a>max)
                max = a;
            if(a<min)
                min = a;
            total +=a;
        }

        System.out.printf("%d %d",total-max,total-min);

    }

}
