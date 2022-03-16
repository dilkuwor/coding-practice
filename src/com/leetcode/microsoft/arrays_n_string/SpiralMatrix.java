package com.leetcode.microsoft.arrays_n_string;

import com.leetcode.microsoft.DataHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] test = {{7},{9},{6}};
        DataHelper.printMatrix(test);
        var ans = spiralOrder(test);
        System.out.println(Arrays.toString(ans.toArray()));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> answers = new ArrayList<>();
        int total = matrix.length * matrix[0].length;

        int l = 0;
        int r = matrix[0].length -1;
        int t = 0;
        int b = matrix.length - 1;
        int start = 0;
        int end = 0;
        while(total>0)
        {
            //right
            start = l;
            end = r;

            while(start<=end && total>0)
            {
                answers.add(matrix[t][start]);
                start++;
                total--;
            }
            ++t;
            start = t;
            end = b;
            //down
            while(start<=end && total>0)
            {
                answers.add(matrix[start][r]);
                start++;
                total--;
            }

            --r;
            start = r;
            end = l;

            //left

            while(start>=end && total>0)
            {
                answers.add(matrix[b][start]);
                start--;
                total--;
            }

            --b;
            start = b;
            end = t;

            //up
            while(start>=end && total>0)
            {
                answers.add(matrix[start][l]);
                start--;
                total--;
            }
            l++;
        }
        return  answers;
    }
}
