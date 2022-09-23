package com.leetcode.contest;

import java.util.Arrays;

public class LargestLocal {
    public static void main(String[] args) {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        LargestLocal l = new LargestLocal();
        for(int[]  arr: l.largestLocal(grid))
        {
            System.out.println(Arrays.toString(arr));
        }

    }

    public int[][] largestLocal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] maxLocal = new int[n-2][n-2];

        for(int a = 0;a<maxLocal.length;a++)
        {
            for(int b = 0;b<maxLocal[0].length;b++)
            {
                int max = Integer.MIN_VALUE;
                for(int i = a;i<a+3;i++)
                {
                    for(int j = b;j<b+3;j++)
                    {
                        max = Math.max(max,grid[i][j]);
                    }
                }
                maxLocal[a][b] = max;
            }
        }
        return maxLocal;

    }
}
