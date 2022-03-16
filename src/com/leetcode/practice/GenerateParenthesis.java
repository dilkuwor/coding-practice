package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

//Generate Parentheses
public class GenerateParenthesis {
    Stack<Character> myStack;
    public static void main(String[] args) {
        GenerateParenthesis g = new GenerateParenthesis();
        for(String s: g.generateParenthesis(3))
        {
            System.out.println(s);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        myStack = new Stack<>();
        backTrack(0,0,n,result,myStack);
        return result;
    }

    void backTrack(int open, int close,int len, List<String> result,Stack<Character> myStack)
    {
        if(open == close && close == len)
        {
            result.add(myStack.stream().map(r->r.toString()).collect(Collectors.joining("")));
            return;
        }

        if(open<len)
        {
            myStack.push('(');
            backTrack(open+1,close,len,result,myStack);
            myStack.pop();
        }

        if(close<open)
        {
            myStack.push(')');
            backTrack(open,close+1,len,result,myStack);
            myStack.pop();
        }
    }


}
