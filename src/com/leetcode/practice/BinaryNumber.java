package com.leetcode.practice;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BinaryNumber {
    public static void main(String[] args) {
     int decimalDegit = 5445;
     BinaryNumber bn = new BinaryNumber();
//     bn.decToBinary(decimalDegit);

//        String _32Bit = "";
//        for(int i = 1;i<32){
//            _32Bit +="1";
//        }
        //int a = bn.binaryToDecimal(_32Bit);
    }
    int decToBinary(int decimalDigit){
        Queue<Integer> myStack = new PriorityQueue<>();
        while(decimalDigit>0){
            int remainder  = decimalDigit%2;
            System.out.print(remainder);
            myStack.add(remainder);
            decimalDigit = decimalDigit/2;
        }

        System.out.println("Converting binary back to decimal digit..");

        return -1;
    }

    int binaryToDecimal(String binary){
        for(int i = 0;i<binary.length();i++){

        }
        return -1;
    }
}
