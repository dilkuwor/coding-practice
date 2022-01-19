package com.leetcode.amazon.arrays_n_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringToInteger {
    public static void main(String[] args) {

        System.out.println((char)9);

        String temp = "-91283472332";
//        if(temp.charAt(0)<='9' && temp.charAt(0)>='0'){
//            System.out.println(temp.charAt(0)-'0');
//            System.out.println(true);
//        }
        StringToInteger st = new StringToInteger();
        //System.out.println(2^32);
        System.out.println(st.myAtoi(temp));



    }


    public int myAtoi(String s){
        if(s.isEmpty())
            return 0;
        int i = 0;
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        if(i<s.length() && (s.charAt(i) =='-'  || s.charAt(i) =='+')){
            sign = s.charAt(i)=='-'?-1:1;
            i++;
        }
        int base = 10;
        int sum = 0;
        while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int bound = Integer.MAX_VALUE / 10;
            int digit = (s.charAt(i) -'0');
            if((sum>bound) || (sum == bound && digit>7)){
                sum = sign>0? Integer.MAX_VALUE: Integer.MIN_VALUE;
                return sum;
            }
            sum = sum * base + digit;
            i++;
        }

        return sum * sign;
    }

    public int myAtoi1(String s){
        //System.out.println("Input: "+s);
        Map<String, Integer> lookup = new HashMap<String, Integer>();
        for(int i =0;i<10;i++){
            lookup.put(String.valueOf(i),i);
        }

        boolean isValid = false;
        Stack<String> myStr = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(i == 0 &&( s.charAt(i) == ' ' ||s.charAt(i) =='+' || s.charAt(i) =='-' || lookup.containsKey(String.valueOf(s.charAt(i))))){
                isValid = true;
            }
            if(isValid){
                if(s.charAt(i) =='+' || s.charAt(i) =='-' || lookup.containsKey(String.valueOf(s.charAt(i)))){
                    myStr.push(String.valueOf(s.charAt(i)));
                }
                else if(s.charAt(i) ==' '){
                    continue;
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }
        int multiplier = 1;
        int sum = 0;
        int sign = 1;
        boolean overflow = false;
        if(myStr.size()>0){
            while(!myStr.isEmpty()){
                String key = myStr.pop();
                if(lookup.containsKey(key)){
                    sum += lookup.get(key) * multiplier;
                    if(multiplier> Integer.MAX_VALUE/10){
                        overflow = true;
                    }
                   else{
                        multiplier *=10;
                    }
                }
                else if (key.equals("-")){
                   sign = -1;
                }
            }
        }
        if(overflow){
            if(sign>0)
                return Integer.MAX_VALUE ;
            else
                return Integer.MIN_VALUE;
        }
           return sum * sign;

    }
}
