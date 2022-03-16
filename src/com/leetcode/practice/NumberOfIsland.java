package com.leetcode.practice;

public class NumberOfIsland {
    public static void main(String[] args) {
        NumberOfIsland n = new NumberOfIsland();
        char[][] test = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        System.out.println(n.numIslands(test));
    }

    public int numIslands(char[][] grid) {

        int count = 0;

        for(int i =0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j] == '1')
                {
                    breadthFirstSearch(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }


    void breadthFirstSearch(int row, int col, char[][] grid)
    {
        //check boundary
        if(row<0 || row>=grid.length|| col<0 || col>=grid[0].length || grid[row][col]!='1')
            return;

        grid[row][col] = '0';
        //bfs left
        this.breadthFirstSearch(row,col-1,grid);
        //bfs right
        this.breadthFirstSearch(row,col+1,grid);
        //bfs top
        this.breadthFirstSearch(row-1,col,grid);
        //fbs bottom
        this.breadthFirstSearch(row+1,col,grid);
    }
}
