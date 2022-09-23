package com.brain;

/*
https://www.geeksforgeeks.org/check-if-a-number-is-odd-or-even-using-bitwise-operators/
 */
public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd e = new EvenOdd();
        System.out.println(e.isEven(100));
    }

    boolean isEven(int n)
    {
        return ((n&1)!=1);
    }
}
