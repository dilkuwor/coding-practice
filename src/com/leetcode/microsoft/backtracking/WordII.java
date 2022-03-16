package com.leetcode.microsoft.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
212. Word Search II
Hard
Given an m x n board of characters and a list of strings words, return all words on the board.

Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 */
public class WordII {
    public static void main(String[] args) {
        WordII ii = new WordII();
        char[][] baord = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words = {"oath","pea","eat","rain"};
        for(String s: ii.findWords(baord,words))
        {
            System.out.println(s);
        }
    }

    public List<String> findWords(char[][] board, String[] words) {

        //insert word in trieNode
        TrieNode root = new TrieNode();
        for(String s:words)
        {
            TrieNode current = root;
            for(char c: s.toCharArray())
            {
                if(!current.children.containsKey(c))
                {
                    TrieNode node = new TrieNode();
                    current.children.put(c,node);
                    current = node;
                }
                else{
                    current = current.children.get(c);
                }
            }
            current.word = s;
        }

        List<String> result = new ArrayList<>();

        for(int i = 0;i<board.length;i++)
        {
            for(int j = 0;j<board[0].length;j++)
            {
                if(root.children.containsKey(board[i][j]))
                {
                    backTrack(board,i,j,root,result);
                }
            }
        }

        return result;

    }

    void backTrack(char[][] board,int row, int col,TrieNode parent, List<String> result)
    {
        Character c = board[row][col];
        TrieNode current = parent.children.get(c);
        if(current.word!=null)
        {
            result.add(current.word);
            current.word = null;
        }



        board[row][col] = '#';
        int[] rowOffset = {0,1,0,-1};
        int[] colOffset = {1,0,-1,0};

        for(int i = 0;i<4;i++)
        {
            int newRow = row+rowOffset[i];
            int newCol = col+colOffset[i];

            //check boundaries
            if(newRow <0 || newRow>=board.length || newCol <0 || newCol>=board[0].length)
            {
                continue;
            }
            if(current.children.containsKey(board[newRow][newCol]))
            {
                backTrack(board,newRow,newCol,current,result);
            }
        }
        board[row][col] = c;
    }
}

class TrieNode
{
    HashMap<Character,TrieNode> children;
    String word;
    public TrieNode()
    {
        children = new HashMap<>();
    }

}

