package com.leetcode.amazon.arrays_n_string;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. Roman to Integer
 * Easy
 */
public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger r = new RomanToInteger();
        String roman = "IV";
        System.out.println(roman.substring(0,1));
        System.out.println(r.romanToInt(roman));
    }
    public int romanToInt1(String s){
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int [] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};;

        Map<String,Integer> map = new HashMap<>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            if((i+2)<=s.length()&& map.containsKey(s.substring(i,i+2))){
                sum +=map.get(s.substring(i,i+2));
                i++;
            }
            else{
                sum +=map.get(s.substring(i,i+1));
            }
        }
        return sum;
    }

    public int romanToInt(String s){
        Map<String,Integer> map = new HashMap<>();
        map.put("M",1000);
        map.put("D",500);
        map.put("C",100);
        map.put("L",50);
        map.put("X",10);
        map.put("V",5);
        map.put("I",1);

        int sum = 0;

        int counter = 0;
        while(counter<s.length()){
            int currentValue = map.get(s.substring(counter,counter+1));
            int nextValue = 0;
            if(counter+2<=s.length()){
                nextValue = map.get(s.substring(counter+1,counter+2));
            }
            if(currentValue<nextValue){
                sum +=(nextValue-currentValue);
                counter +=2;
            }
            else{
                sum +=currentValue;
                counter++;
            }
        }
        return sum;
    }
}
