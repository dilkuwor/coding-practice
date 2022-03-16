package com.leetcode.ds_challange.day5;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        ValidSudoku v = new ValidSudoku();
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(v.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxs = new HashSet[N];


        for(int i = 0;i<N;i++)
        {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxs[i] = new HashSet<Character>();
        }
        for(int i =0;i<board.length;i++)
        {

            for(int j =0;j<board[0].length;j++)
            {
                Character c = board[i][j];

                if(Character.isDigit(c))
                {

                    if(rows[i].contains(c))
                    {
                        return false;
                    }
                    else{
                        rows[i].add(c);
                    }

                    if(cols[j].contains(c))
                    {
                        return false;
                    }
                    else{
                        cols[j].add(c);
                    }


                    int tr = i/3;
                    int tc = j/3;

                    int nr = tr*3 + tc;
                    if(boxs[nr].contains(c)){
                        return false;

                    }
                    else{
                        boxs[nr].add(c);
                    }
                }
            }
        }

        return true;

    }


    public boolean secondSolution(char[][] board)
    {
        Set seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }
}
