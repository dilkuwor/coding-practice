package com.leetcode.practice;

public class WordSearch {
    char[][] board;
    int ROWS;
    int COLS;
    public static void main(String[] args) {

        WordSearch ws = new WordSearch();

        char[][] test = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};

        String word = "ABCCEDd";
        System.out.println(ws.exist(test,word));

    }

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.ROWS = board.length;
        this.COLS = board[0].length;
        for(int i =0;i<board.length;i++)
            for(int j = 0;j<board[0].length;j++)
                if(this.backTrack(i,j,word,0))
                {
                    return true;
                }

        return false;
    }

    public boolean backTrack(int row, int col, String word, int index)
    {
        //check bottom
        if(index>=word.length())
            return true;

        //check boundaris
        if(row<0 || row>=this.ROWS || col<0 || col>=this.COLS || this.board[row][col] != word.charAt(index))
            return false;

        this.board[row][col] = '#';

        int[] rowOffset = {0,-1,0,1};
        int[] colOffset = {1,0,-1, 0};
//        boolean ret = false;

        //apply DFS
        for(int d = 0;d<4;d++)
        {
            if(this.backTrack(row+rowOffset[d],col+colOffset[d],word,index+1))
            {
                return true;
            }
        }
        this.board[row][col] = word.charAt(index);
        return false;

    }
}
