package com.leetcode.microsoft.other;

import java.util.HashSet;

public class CelebrityProblem {
    public static void main(String[] args) {

    }

    public int findCelebrity(int n) {
        HashSet<Integer> mySet = new HashSet<>();
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i!=j){
                    if(!knows(i, j))
                    {
                        mySet.add(j);
                    }
                    else if(mySet.contains(j)){
                        mySet.remove(j);
                    }
                }
            }
        }
        return mySet.size() == 1?mySet.iterator().next():-1;
    }

    boolean knows(int a, int b)
    {
        return a>b;
    }
}
