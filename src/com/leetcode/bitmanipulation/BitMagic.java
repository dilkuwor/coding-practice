package com.leetcode.bitmanipulation;

public class BitMagic {
    public static void main(String[] args) {
        kThBitSet(6);

        int a =7, b =9;

        System.out.println("Before swap");
        printSwap(a,b);
        System.out.println("After swap");
        swap(a,b);
        printSwap(a,b);


    }

    /*
    Create a number that has only kth bit set as number
     */
    static void kThBitSet(int k)
    {
        int a = 1<<(k-1);
        //00010000
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
    }

    /*
    check if kth bit is set or not
     */
    static void checkKthBitSetOrNot(int k, int a)
    {
//        if((a & (1<<(k-1))))
//            System.out.println(k+"th bit is set");
//        else{
//            System.out.println(k+"th bit is not set");
//        }
    }

    static void swap(Integer a, Integer b)
    {

        int temp = a;
        a = b;
        b = temp;
    }

    static void printSwap(int a, int b)
    {
        System.out.println(a+","+b);
    }
}
