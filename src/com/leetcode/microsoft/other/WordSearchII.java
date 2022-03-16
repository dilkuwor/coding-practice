package com.leetcode.microsoft.other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given an m x n board of characters and a list of strings words, return all words on the board.

Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 */
public class WordSearchII {
    public static void main(String[] args) {
        WordSearchII w = new WordSearchII();
        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};

        String[] words = {
                "oath","pea","eat","rain"
        };

        List<String> answers = w.findWords(board,words);
        for(String s: answers)
        {
            System.out.println(s);
        }
    }

    boolean isSubstring(Set<String> words, String word){

       for(String s: words)
       {
           if(s.indexOf(word)>=0)
           {
               return true;
           }
       }
        return false;
    }
    public List<String> findWords(char[][] board, String[] words) {


        int[][] marker = new int[board.length][board[0].length];
        List<String> answers = new ArrayList<>();
        Set<String> dp = new HashSet<>();
        for(String s: words)
        {
            char c = s.charAt(0);

            if(dp.contains(s) || isSubstring(dp,s)){
               answers.add(s);
            }
            else{
                breaker:
                for(int i = 0;i<board.length;i++)
                {
                    for(int j = 0;j<board[0].length;j++)
                    {
                        if(board[i][j] == c)
                        {
                            if(dfsSearch(board,i,j,s,0))
                            {

                                answers.add(s);
                                dp.add(s);
                                break breaker;
                            }
                        }
                    }
                }
            }


        }
        return answers;

    }


    boolean dfsSearch(char[][] board, int i, int j, String word, int index)
    {
        if(index == word.length())
            return true;

        //edge case
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] != word.charAt(index))
            return false;


        board[i][j] = '#';

        int[] xTraverse = {0,1,0,-1};
        int[] yTraverse = {1,0,-1,0};

        boolean completed = true;
        for(int k = 0;k<4;k++)
        {
            completed = dfsSearch(board,xTraverse[k] + i,yTraverse[k]+j,word, index+1);
            if(completed)
                break;;

        }

        board[i][j] = word.charAt(index);
        return completed;
    }
}
