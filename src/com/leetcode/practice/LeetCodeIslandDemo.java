package com.leetcode.practice;

public class LeetCodeIslandDemo {
    public static void main(String[] args) {
// 1 1 1 0
// 1 0 0 1
// 0 1 0 1

        char[][] grod = {{'1','1','1','0'},{'1','0','0','1'},{'0','1','0','1'}};

        for(int i = 0;i<grod.length;i++){
            for(int j = 0;j<grod[i].length;j++){
                System.out.println("("+i+","+j+") = "+grod[i][j]+" "+grod[i].length);
            }
        }

        LeetCodeIslandDemo p = new LeetCodeIslandDemo();
        int count = p.numsIsland(grod);
        System.out.println(count);

        for(int i = 0;i<grod.length;i++){
            for(int j = 0;j<grod[i].length;j++){
                System.out.println("("+i+","+j+") = "+grod[i][j]+" "+grod[i].length);
            }
        }
    }

    public  int numsIsland(char[][] grid){
        int count = 0;
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    count +=1;
                    callBFS(grid,i,j);
                }
            }
        }

        return count;
    }

    private  void searchBFS(char[][] grid, int i, int j) {
        if(i<0||i>=grid.length||j<0||j>=grid[i].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';

        searchBFS(grid, i-1,j); //top
        searchBFS(grid,i+1,j); //bottom
        searchBFS(grid,i,j-1); //right
        searchBFS(grid,i, j+1); //left
    }


    private void callBFS(char[][] grid,int i, int j){
//        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j] == '0')
//            return;
        if(i<0||i>=grid.length||j<0||j>=grid[i].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
//        callBFS(grid,i-1,j);
//        callBFS(grid,i+1, j);
//        callBFS(grid,i,j-1);
//        callBFS(grid,i,j+1);

        callBFS(grid, i-1,j); //top
        callBFS(grid,i+1,j); //bottom
        callBFS(grid,i,j-1); //right
        callBFS(grid,i, j+1); //left
    }
}
