package com.basics.datastructure.arrays;

public class ArrayIntroduction {
    public static void main(String[] array){
        System.out.println("Hello world");

        int a = 0;
        int[] arr = new int[500];
        arr[++a] = 5;
        System.out.println(arr.getClass().getName());

        System.out.println(arr[0]);
    }
}
