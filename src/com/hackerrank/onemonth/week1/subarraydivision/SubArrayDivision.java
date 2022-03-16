package com.hackerrank.onemonth.week1.subarraydivision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {

        SubArrayDivision arr = new SubArrayDivision();
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(1);
        lst.add(3);
        lst.add(2);
        int d = 3;
        int m = 2;
        System.out.println(birthday(lst,d,m));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int start = 0;
        int end = m-1;

        int combination = 0;
        while(start<s.size() && end<s.size())
        {
            int total = 0;
            int i = start;
            while(i<=end)
            {
                total +=s.get(i);

                i++;
            }

            if(total == d)
            {
                combination++;
                start = i;
                end = start+m;
            }
            else{
                start++;
            }

        }
        return combination;
    }
}
