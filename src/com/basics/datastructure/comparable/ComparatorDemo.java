package com.basics.datastructure.comparable;

import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args){
        TreeSet data = new TreeSet(new MySorting());
        data.add(152);
        data.add(185);
        data.add(10);
        System.out.println(data);
    }
}
