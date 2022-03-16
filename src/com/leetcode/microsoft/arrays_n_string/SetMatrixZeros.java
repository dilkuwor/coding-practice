package com.leetcode.microsoft.arrays_n_string;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {
    public static void main(String[] args) {
        SetMatrixZeros s = new SetMatrixZeros();
        int[][] myTest = {
                {1,1,1},
                {1,0,1},
                {1,1,1}

        };
        s.setZeroes(myTest);
        for(int i  = 0;i<myTest.length;i++)
        {
            for(int j =0;j<myTest[0].length;j++)
            {
                System.out.print(myTest[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void setZeroes(int[][] matrix) {

        int colCount = 0;
        int rowCount = 0;
        Set<String> mySet = new HashSet<>();
        outerloop:
        for(int i =0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    if(mySet.add("r"+j))
                    {
                        rowCount++;
                    }

                    if(rowCount == matrix.length -1)
                    {
                        break outerloop;
                    }

                    if(mySet.add("c"+j))
                    {
                        colCount++;
                    }

                    if(colCount == matrix[0].length -1)
                    {
                        break outerloop;
                    }
                }
            }
        }

        if(rowCount == matrix.length-1 || colCount == matrix[0].length)
        {
            for(int i =0;i<matrix.length;i++)
            {
                dfs(matrix,i,0);
            }
        }
        else{
            mySet.stream().forEach(r->{
                int a = Integer.parseInt(r.substring(1,2));
                if(r.charAt(0) == 'r')
                {
                    dfs(matrix, a, 0);
                }
                else{
                    dfs(matrix, 0, a);
                }

            });
        }
    }


    void dfs(int[][] matrix, int row, int col)
    {
        //edge case
        if(row<0 || row>=matrix.length || col<0 || col>=matrix[0].length)
            return;

        matrix[row][col] = 0;

        //bottom
        dfs(matrix, row+1, col);

        //top
        dfs(matrix,row-1, col);


        //right
        dfs(matrix, row, col+1);
        //left
        dfs(matrix, row, col-1);


    }
}
