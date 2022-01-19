package com.leetcode.amazon.arrays_n_string;

public class RotateImage {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        RotateImage ri = new RotateImage();
        ri.rotate(matrix);
    }
    public void rotate(int[][] matrix) {

        transpose(matrix);
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j -1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
        //reverse matrix
    }

    public void transpose(int[][] matrix){
        //transpose matrix
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

}
