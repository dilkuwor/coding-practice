package com.leetcode.ds_challange.day5;

public class SearchTwoDMatrix {
    public static void main(String[] args) {
        SearchTwoDMatrix t = new SearchTwoDMatrix();
        int[][] arr = {{1,3,5,7}};
        System.out.println(t.searchMatrix(arr,10));
    }


    public boolean searchMatrix(int[][] matrix, int target) {

        int low = 0;
        int high = matrix.length * matrix[0].length - 1;

        while(low<=high)
        {
            int mid = low +(high-low)/2;
            int row = mid/matrix[0].length;
            int col = mid%matrix[0].length;
            if(matrix[row][col] == target)
            {
                return true;
            }
            else if (matrix[row][col] < target)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;

    }
}
