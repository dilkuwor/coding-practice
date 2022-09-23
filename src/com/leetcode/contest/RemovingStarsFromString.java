package com.leetcode.contest;

public class RemovingStarsFromString {
    public static void main(String[] args) {
        RemovingStarsFromString r = new RemovingStarsFromString();
        String test = "erase*****";
        System.out.println(r.removeStars(test));
    }

    public String removeStars(String s) {
        StringBuilder bldr = new StringBuilder();
        int skip = 0;
        for(int i = s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) == '*')
            {
                skip++;
            }
            else if(skip>0){
                skip--;
            }
            else{
                bldr.append(s.charAt(i));
            }
        }

        return bldr.reverse().toString();
    }
}
