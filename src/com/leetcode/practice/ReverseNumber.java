package com.leetcode.practice;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber r = new ReverseNumber();
        int a = 12345;
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(r.reverse(a));
    }
    int reverse(int x){
       int result = 0;
       while(x!=0){
           int pop = x%10;

           int newResult = result*10+pop;
           if((newResult-pop)/10!=result)
               return 0;
           result = newResult;
           x /=10;
       }
       return result;
    }
}
