package com.leetcode.microsoft.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZagConversion {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";

        System.out.println(convert(str,3));
    }

    public static String convert(String s, int numRows) {
        if(numRows <=0 || s.isEmpty())
            return s;
        int start = 0;
        int end = s.length();
        boolean up = false;

        List<List<Character>> result = new ArrayList<>();
        List<Character> charArr = new ArrayList<>();
        int row = 0;
        while(start<end)
        {
            if(result.size()<row+1)
            {
                result.add(new ArrayList<>());
            }
            List<Character> arr = result.get(row);

            arr.add(s.charAt(start));
            if(!up)
            {
                row++;
                if(row == numRows -1)
                {
                    up = true;
                }
            }
            else{
                row--;
                if(row == 0)
                {
                    up = false;
                }
            }
            start++;

        }

        StringBuilder bldr = new StringBuilder();

        for(List<Character> c : result)
        {
            for(char cc: c)
            {
                bldr.append(cc);
            }

        }
        return bldr.toString();
    }
}
