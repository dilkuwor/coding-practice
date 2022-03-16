package com.leetcode.microsoft.dynamicprogramming;

/*
72. Edit Distance
 */
public class EditDistance {
    public static void main(String[] args) {
        EditDistance e = new EditDistance();
        String word1 = "a", word2 = "b";
        System.out.println(e.minDistance(word1,word2));


    }

//    public int minDistance(String word1, String word2) {
//        if(word2.isEmpty())
//            return word1.length();
//        if(word1.isEmpty())
//            return word2.length();
//        return minDistance1(word1,word2,0,0);
//    }

    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        //base
        if(m*n==0)
        {
            return m+n;
        }

        int[][] cost = new int[m+1][n+1];

        //base case
        //if word2 is ""
        for(int i = 0;i<m;i++)
        {
            cost[i][0] = i;
        }

        //if word1 is ""
        for(int j = 0;j<n;j++)
        {
            cost[0][j] = j;
        }


        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(word1.charAt(i) == word2.charAt(j))
                {
                    cost[i+1][j+1] = cost[i][j];
                }
                else{
                    int add = cost[i][j+1];
                    int remove = cost[i+1][j];
                    int replace = cost[i][j];
                    cost[i+1][j+1] = Math.max(add, Math.max(remove,replace)) + 1;
                }
            }
        }

        return cost[m][n];


    }
    private int minDistance1(String word1, String word2, int count, int index) {


        if(word1.isEmpty() || word2.isEmpty() || index>=word1.length())
            return Integer.MAX_VALUE;

        if(word1.equals(word2))
            return count;
        if(word1.length() == 1 && word2.length() == 1)
            return word1.length();
        if(index == word2.length() - 1)
            return count + (word1.length() - word2.length());


        if(word1.charAt(index) == word2.charAt(index))
            return minDistance1(word1,word2,count,index+1);


        int insertChar  = minDistance1(insertChar(word1,index,word2.charAt(index)), word2,count+1,index);
        int replaceChar = minDistance1(replaceChar(word1,index,word2.charAt(index)), word2,count+1,index);
        int removeChar = minDistance1(removeChar(word1,index), word2,count+1,index);

        return Math.min(insertChar, Math.min(replaceChar,removeChar));


    }

    String removeChar(String s, int index)
    {
        StringBuilder bldr = new StringBuilder(s);
        bldr.replace(index,index+1,"");
        return bldr.toString();

    }

    String replaceChar(String s, int index, char newChar)
    {
        StringBuilder bldr = new StringBuilder(s);
        bldr.replace(index,index+1,newChar+"");
        return bldr.toString();
    }

    String insertChar(String s,int index, char newChar)
    {
        StringBuilder bldr = new StringBuilder(s);
        bldr.replace(index,index,newChar+"");
        return bldr.toString();
    }
}
