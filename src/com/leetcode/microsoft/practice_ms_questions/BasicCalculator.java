package com.leetcode.microsoft.practice_ms_questions;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        BasicCalculator b = new BasicCalculator();
        String exp = "2*3*4-6";
        System.out.println(b.calculate(exp));
    }
    public int calculate(String s) {

        if(s.isEmpty() || s == null)
            return 0;

        int currentNumber = 0;
        char currentSign = '+';
        Stack<Integer> stack = new Stack();
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(Character.isDigit(c))
            {
                currentNumber = currentNumber * 10 + c-'0';
            }
            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == s.length()-1)
            {
                if(currentSign == '-')
                {
                    stack.push(-currentNumber);
                }
                if(currentSign == '+')
                {
                    stack.push(currentNumber);
                }
                if(currentSign == '*')
                {
                    stack.push(stack.pop() * currentNumber);
                }

                if(currentSign == '/')
                {
                    stack.push(stack.pop()/currentNumber);
                }
                currentNumber = 0;
                currentSign = c;
            }

        }

        int result = 0;
        while(!stack.isEmpty())
        {
            result +=stack.pop();
        }
        return result;
    }
}
