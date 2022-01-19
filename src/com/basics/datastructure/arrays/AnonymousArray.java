package com.basics.datastructure.arrays;

public class AnonymousArray {
    public static void main(String[] args){
sum(new int[]{3,343,3});
    }
    private static void sum(int[] arr){
        int sum = 0;
        for(int a: arr){
            sum+=a;
        }

        System.out.println(sum);
    }
}
