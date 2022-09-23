package com.leetcode.contest.day917;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SumOfPrefixScoresOfStrings {
    public static void main(String[] args) {
        SumOfPrefixScoresOfStrings s = new SumOfPrefixScoresOfStrings();
        String[] words = {"dbhiwxxr","hyqbpabh","hyqlgnnxiy","wosbckxrb","wosbckxmfq"};//{"abc","ab","bc","b"};
        System.out.println(Arrays.toString(s.sumPrefixScores(words)));
    }

    public int[] sumPrefixScores(String[] words) {
        Trie t = new Trie();
        for(String s: words)
        {
            t.insert(s);
        }

        int[] scores = new int[words.length];
        for(int i = 0;i<words.length;i++)
        {
            scores[i] = t.score(words[i]);
        }
        return scores;
    }

}

class Trie
{
    Map<Character, Trie> children = new HashMap<>();
    int score;
    public Trie(){

    }

    void insert(String s)
    {
        Trie current = this;
        for(int i = 0;i<s.length();i++)
        {
            if(current.children.containsKey(s.charAt(i)))
            {

                current = current.children.get(s.charAt(i));
                current.score++;
            }
            else{
                Trie child = new Trie();
                child.score = 1;
                current.children.put(s.charAt(i),child);
                current = child;
            }
        }
    }

    int score(String s)
    {
        int score = 0;
        Trie current = this;
        for(int i = 0;i<s.length();i++)
        {
            if(current.children.containsKey(s.charAt(i)))
            {

                current = current.children.get(s.charAt(i));
                score +=current.score;
            }
            else{
                break;
            }
        }
        return score;
    }
}
