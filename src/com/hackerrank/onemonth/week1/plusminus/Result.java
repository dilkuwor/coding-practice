package com.hackerrank.onemonth.week1.plusminus;

import java.text.DecimalFormat;
import java.util.List;

public class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int p_count = 0;
        int n_count = 0;
        int z_count = 0;
        int count = arr.size();
        for(int a:arr){
            if(a>0)
                p_count++;
            else if(a== 0)
                z_count++;
            else
                n_count++;
        }

        System.out.printf("%.6f\n",(float)p_count/count);
        System.out.printf("%.6f\n",(float)n_count/count);
        System.out.printf("%.6f\n",(float)z_count/count);
    }

}
