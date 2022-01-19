package com.leetcode.amazon.arrays_n_string;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String  s = "({[})";
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid1(s));
    }

    public boolean isValid(String s) {
        Stack<Character> match = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                match.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(match.empty())
                    return false;
                if((s.charAt(i) == ')' && match.peek() == '(')||s.charAt(i) == ']' && match.peek() == '['||s.charAt(i) == '}' && match.peek() == '{'){
                    match.pop();
                }
                else{
                    return false;
                }
            }
        }
        return match.empty();
    }

    public boolean isValid1(String s){
        Stack<Character> myStack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '('){
                myStack.push(')');
            }
            else if (c == '{'){
                myStack.push('}');
            }
            else if (c == '['){
                myStack.push(']');
            }
            else if(myStack.isEmpty() || myStack.pop() != c)
                return false;
        }
        return myStack.isEmpty();
    }
}
