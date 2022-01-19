package com.basics.datastructure.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<String> set = new TreeSet();
        set.add("apple");
        set.add("match");
        set.add("aaa");
        System.out.println(set);
        set.add("baby");
        System.out.println(set);

        SortedSet sortedSet = new TreeSet();

    }
}
