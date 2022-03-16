package com.leetcode.ds_challange.day4;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        ReshapeMatrix rs = new ReshapeMatrix();
        int[][] test = {
                {1,2},{3,4}
        };
        int[][] ans = rs.matrixReshape(test,2,4);
        for(int i =0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        //edge case
        if(mat.length*mat[0].length> r*c)
            return mat;

        c = (mat.length*mat[0].length)/r;
        int[][] newArr = new int[r][c];

        int tempRow = 0;
        int tempCol = 0;

        for(int i = 0;i<mat.length;i++)
        {
            for(int j = 0;j< mat[0].length; j++)
            {
                newArr[tempRow][tempCol++] = mat[i][j];
            }
            if(tempCol==c)
            {
                tempRow++;
                tempCol = 0;
            }
        }
        return newArr;
    }
}
