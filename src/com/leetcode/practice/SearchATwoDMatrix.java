package com.leetcode.practice;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * 74 - Medium
 */
public class SearchATwoDMatrix {
    public static void main(String[] args) {
        SearchATwoDMatrix s = new SearchATwoDMatrix();
//        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix = new int[][]{{1,8},{9,11}};

        int target = 11;


        System.out.println(s.searchMatrix(matrix,target));

    }

    public boolean searchMatrix(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int size = row*col;
        int low = 0;
        int high = size - 1;
        while (low<=high){
            int mid = (low + high)/2;
            //calculate row and col based on the mid value
            int tempRow = mid/col;
            int tempCol = mid%col;


            if(matrix[tempRow][tempCol] == target)
                return true;
            if(matrix[tempRow][tempCol]>target){
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }

        }
        return false;
    }
}
