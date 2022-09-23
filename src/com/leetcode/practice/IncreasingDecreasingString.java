package com.leetcode.practice;

import java.util.TreeMap;
import java.util.TreeSet;

/*
1370
 */
public class IncreasingDecreasingString {
    public static void main(String[] args) {
        IncreasingDecreasingString i = new IncreasingDecreasingString();
        String test = "aaaabbbbcccc";
        String result = i.sortString(test);
        System.out.println(result);
    }

    public String sortString(String s) {
        StringBuilder bldr = new StringBuilder();
        TreeMap<Character, Integer> tree = new TreeMap<>();
        for(char c: s.toCharArray())
        {
            tree.put(c, tree.getOrDefault(c,0)+1);
        }
        boolean asc = true;
        while(!tree.isEmpty())
        {
            for(char c: asc?new TreeSet<>(tree.keySet()):new TreeSet<>(tree.descendingKeySet()))
            {
                System.out.println(c);
                bldr.append(c);
                tree.put(c, tree.getOrDefault(c,0)-1);
                tree.remove(c,0);
            }
            asc = !asc;
        }
        return bldr.toString();
    }
}
